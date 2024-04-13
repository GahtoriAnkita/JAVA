import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) {
        // Creating InputStreamReader to read from standard input (keyboard)
        InputStreamReader isr = new InputStreamReader(System.in);
        // Wrapping InputStreamReader in BufferedReader for efficient reading
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Enter some text (press Enter to finish):");
            String input = br.readLine(); // Read a line of text from the input stream
            System.out.println("You entered: " + input);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedReader
                if (br != null) br.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
