import java.util.Locale;

/** Lab 03, task 4 (variant 4). */
public class Lab03Task4 {
    public static void main(String[] args) {
        printResult(2.0, 8.0, 5);
        printResult(1.5, 4.0, 3);
        printResult(-1.0, 4.0, 3);
        printResult(2.0, 8.0, 31);
    }

    public static double calculate(double a, double b, int k) {
        if (!Double.isFinite(a) || !Double.isFinite(b) || a < 0 || b < 0)
            throw new IllegalArgumentException("a and b must be finite and non-negative");
        if (k < 0 || k > 30)
            throw new IllegalArgumentException("k must be between 0 and 30");

        double sum = 0.0;
        for (int i = 1; i <= k; i++)
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        return sum;
    }

    private static void printResult(double a, double b, int k) {
        System.out.printf(Locale.US, "a=%.2f, b=%.2f, k=%d: ", a, b, k);
        try {
            System.out.printf(Locale.US, "%.12f%n", calculate(a, b, k));
        } catch (IllegalArgumentException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

