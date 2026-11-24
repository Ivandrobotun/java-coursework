import java.util.Locale;
import java.util.Objects;

/** Lab 09, task 10 (variant 4): uppercase alphabetic words only. */
public class Lab09Task10 {
    public static void main(String[] args) {
        printResult("The user with the nickname koala757677 this month wrote 3 times more "
                + "comments than the user with the nickname croco181dile920 4 months ago");
        printResult("Hello, 123 abc45 World!");
        printResult("");
        printResult(null);
    }

    public static String uppercaseWords(String sentence) {
        Objects.requireNonNull(sentence, "sentence must not be null");

        StringBuilder result = new StringBuilder(sentence.length());
        int index = 0;

        while (index < sentence.length()) {
            char current = sentence.charAt(index);
            if (isAsciiLetterOrDigit(current)) {
                int start = index;
                boolean hasDigit = false;

                while (index < sentence.length()
                        && isAsciiLetterOrDigit(sentence.charAt(index))) {
                    if (isAsciiDigit(sentence.charAt(index))) {
                        hasDigit = true;
                    }
                    index++;
                }

                String token = sentence.substring(start, index);
                result.append(hasDigit ? token : token.toUpperCase(Locale.ROOT));
            } else {
                result.append(current);
                index++;
            }
        }
        return result.toString();
    }

    private static boolean isAsciiLetterOrDigit(char value) {
        return isAsciiLetter(value) || isAsciiDigit(value);
    }

    private static boolean isAsciiLetter(char value) {
        return (value >= 'A' && value <= 'Z')
                || (value >= 'a' && value <= 'z');
    }

    private static boolean isAsciiDigit(char value) {
        return value >= '0' && value <= '9';
    }

    private static void printResult(String sentence) {
        System.out.println("Input: " + sentence);
        try {
            System.out.println("Result: " + uppercaseWords(sentence));
        } catch (NullPointerException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}


