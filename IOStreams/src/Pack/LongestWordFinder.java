package Pack;

import java.io.*;

public class LongestWordFinder {
	    public static void main(String[] args) {
	        String longestWord = "";

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/dabc.txt"));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+"); // split by spaces

	                for (String word : words) {
	                    if (word.length() > longestWord.length()) {
	                        longestWord = word;
	                    }
	                }
	            }
	            reader.close();
	            System.out.println("Longest word: " + longestWord);
	            System.out.println("Length: " + longestWord.length());

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
