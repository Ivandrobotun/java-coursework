import java.util.Locale;

/** Lab 03, task 14 (variant 4). */
public class Lab03Task14 {
    public static void main(String[] args) {
        printResult(0.0001);
        printResult(0.01);
        printResult(0.0);
        printResult(Double.NaN);
    }

    public static double calculate(double epsilon) {
        if (!Double.isFinite(epsilon) || epsilon <= 0.0)
            throw new IllegalArgumentException("epsilon must be finite and greater than 0");

        double sum = 0.0;
        double term = 1.0; // i = 0
        int i = 0;
        while (Math.abs(term) >= epsilon) {
            sum += term;
            i++;
            term *= -2.0 / (i + 1.0);
        }
        return sum;
    }

    private static void printResult(double epsilon) {
        System.out.printf(Locale.US, "epsilon=%s: ", epsilon);
        try {
            System.out.printf(Locale.US, "%.12f%n", calculate(epsilon));
        } catch (IllegalArgumentException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

