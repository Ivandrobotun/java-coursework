import java.util.Arrays;
import java.util.Objects;

/** Lab 04, task 4 (variant 4): count negative array elements. */
public class Lab04Task4 {
    public static void main(String[] args) {
        printResult(new int[] {4, -2, 0, -7, 5});
        printResult(new int[] {});
        printResult(null);
    }

    public static int countNegative(int[] values) {
        Objects.requireNonNull(values, "array must not be null");

        int count = 0;
        for (int value : values) {
            if (value < 0) {
                count++;
            }
        }
        return count;
    }

    private static void printResult(int[] values) {
        System.out.println("Array: " + Arrays.toString(values));
        try {
            System.out.println("Negative elements: " + countNegative(values));
        } catch (NullPointerException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

