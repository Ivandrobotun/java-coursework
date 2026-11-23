import java.util.Arrays;
import java.util.Objects;

/** Lab 04, task 34 (variant 4): find the index of the element
 * with the greatest absolute value. Ties return the first index.
 */
public class Lab04Task34 {
    public static void main(String[] args) {
        printResult(new int[] {3, -10, 6, 5});
        printResult(new int[] {-8});
        printResult(new int[] {5, -5, 2});
        printResult(new int[] {});
        printResult(null);
    }

    public static int indexOfMaxAbsoluteValue(int[] values) {
        Objects.requireNonNull(values, "array must not be null");
        if (values.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }

        int maxIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (Math.abs((long) values[i]) > Math.abs((long) values[maxIndex])) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void printResult(int[] values) {
        System.out.println("Array: " + Arrays.toString(values));
        try {
            int index = indexOfMaxAbsoluteValue(values);
            System.out.println("Index: " + index + ", position: " + (index + 1)
                    + ", value: " + values[index]);
        } catch (NullPointerException | IllegalArgumentException ex) {
            System.out.println("EXCEPTION: " + ex.getMessage());
        }
    }
}

