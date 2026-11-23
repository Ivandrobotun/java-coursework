import java.util.Locale;

/** Lab 03, task 9 (variant 4). */
public class Lab03Task9 {
    public static void main(String[] args) {
        printResult(5, 3);
        printResult(5, 4);
        printResult(0, 3);
        printResult(5, 0);
    }

    public static double calculate(int t, int l) {
        if (t < 1)
            throw new IllegalArgumentException("t must be a positive integer");
        if (l < 1)
            throw new IllegalArgumentException("l must be a positive integer");

        double term = (l % 2 == 1)
                ? Math.sqrt((double) t * l)
                : l / Math.sqrt(t);
        return t * term;
    }

    private static void printResult(int t, int l) {
        System.out.printf(Locale.US, "t=%d, l=%d: ", t, l);
        try {
            System.out.printf(Locale.US, "%.12f%n", calculate(t, l));
        } catch (IllegalArgumentException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

