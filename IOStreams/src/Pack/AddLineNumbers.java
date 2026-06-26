package Pack;
import java.io.*;
public class AddLineNumbers {
	    public static void main(String[] args) {
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
	            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	            String line;
	            int lineNumber = 1;
	            while ((line = reader.readLine()) != null) {
	                writer.write(lineNumber + ". " + line);
	                writer.newLine();
	                lineNumber++;
	            }
	            reader.close();
	            writer.close();

	            System.out.println("File copied with line numbers!");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
