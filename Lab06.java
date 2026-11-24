import java.util.Arrays;
import java.util.Objects;

/** Lab 06, variant 4: sort float arrays in descending order. */
public class Lab06 {
    public static void main(String[] args) {
        runCase(new float[] {3.5f, -1.0f, 0.0f, 8.2f});
        runCase(new float[] {4.0f, 4.0f, -2.0f});
        runCase(new float[] {-5.0f, -1.0f, -9.0f});
        runCase(new float[] {});
        runCase(null);
    }

    public static void bubbleSortDescending(float[] values) {
        Objects.requireNonNull(values, "array must not be null");

        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (Float.compare(values[i], values[i + 1]) < 0) {
                    float temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSortDescending(float[] values) {
        Objects.requireNonNull(values, "array must not be null");

        for (int i = 0; i < values.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (Float.compare(values[j], values[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                float temp = values[i];
                values[i] = values[maxIndex];
                values[maxIndex] = temp;
            }
        }
    }

    private static void runCase(float[] input) {
        System.out.println("Input: " + Arrays.toString(input));

        float[] bubbleResult = input == null ? null : input.clone();
        try {
            bubbleSortDescending(bubbleResult);
            System.out.println("Bubble sort: " + Arrays.toString(bubbleResult));
        } catch (NullPointerException ex) {
            System.out.println("Bubble sort exception: " + ex.getMessage());
        }

        float[] selectionResult = input == null ? null : input.clone();
        try {
            selectionSortDescending(selectionResult);
            System.out.println("Selection sort: " + Arrays.toString(selectionResult));
        } catch (NullPointerException ex) {
            System.out.println("Selection sort exception: " + ex.getMessage());
        }
    }
}

