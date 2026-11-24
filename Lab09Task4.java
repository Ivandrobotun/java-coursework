import java.util.Objects;

/** Lab 09, task 4 (variant 4): parse a hexadecimal string as an int. */
public class Lab09Task4 {
    public static void main(String[] args) {
        printResult("CAFE");
        printResult("10");
        printResult("7f");
        printResult("12G");
        printResult("FFFFFFFF");
        printResult(null);
    }

    public static int hexStringToInt(String value) {
        Objects.requireNonNull(value, "hex string must not be null");
        return Integer.parseInt(value, 16);
    }

    private static void printResult(String value) {
        System.out.print("Input: " + value + " -> ");
        try {
            System.out.println(hexStringToInt(value));
        } catch (NullPointerException | NumberFormatException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}


