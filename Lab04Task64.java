import java.util.Arrays;
import java.util.Objects;

/** Lab 04, task 64 (variant 4): create a transformed array. */
public class Lab04Task64 {
    public static void main(String[] args) {
        printResult(new int[] {-5, 0, 4, -3});
        printResult(new int[] {0, 0, 2});
        printResult(new int[] {});
        printResult(new int[] {Integer.MIN_VALUE});
        printResult(null);
    }

    public static int[] transform(int[] values) {
        Objects.requireNonNull(values, "array must not be null");

        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (value < 0) {
                if (value == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException(
                            "Integer.MIN_VALUE cannot be negated as an int");
                }
                result[i] = -value;
            } else if (value > 0) {
                result[i] = value - 3;
            } else {
                result[i] = -2;
            }
        }
        return result;
    }

    private static void printResult(int[] values) {
        System.out.println("Source: " + Arrays.toString(values));
        try {
            System.out.println("Result: " + Arrays.toString(transform(values)));
        } catch (NullPointerException | IllegalArgumentException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

