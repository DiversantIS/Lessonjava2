
// Bubble Sort implementation in Java
import java.io.FileWriter;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 8, 1, 6, 9, 2};

        // Log file
        FileWriter writer;
        try {
            writer = new FileWriter("result.log", false);

            // Bubble sort
            int n = array.length;
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (array[j - 1] > array[j]) {
                        //swap the elements
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }

                // Write result to log file
                writer.write("Iteration " + i + ": ");
                for (int k = 0; k < array.length; k++) {
                    writer.write(array[k] + " ");
                }
                writer.write("\n");
            }

            // Close writer
            writer.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
