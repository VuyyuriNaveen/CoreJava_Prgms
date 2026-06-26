package Pack;

import java.io.*;
import java.util.Scanner;

public class CeaserDemo {
	    public static char encryptChar(char ch, int shift) {
	        if (Character.isLetter(ch)) {
	            char base = Character.isLowerCase(ch) ? 'a' : 'A';
	            return (char) ((ch - base + shift) % 26 + base);
	        }
	        return ch;
	    }

	    public static char decryptChar(char ch, int shift) {
	        if (Character.isLetter(ch)) {
	            char base = Character.isLowerCase(ch) ? 'a' : 'A';
	            return (char) ((ch - base - shift + 26) % 26 + base);
	        }
	        return ch;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int shift = 3;

	        try {
	           
	            System.out.print("Enter a message: ");
	            String message = scanner.nextLine();
	            

	            FileWriter encWriter = new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/enc_message.txt");

	            for (char ch : message.toCharArray()) {
	                encWriter.write(encryptChar(ch, shift));
	            }
	            encWriter.close();

	            System.out.println("Encrypted message written to enc_message.txt");

	            FileReader encReader = new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/enc_message.txt");
	            FileWriter decWriter = new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/dec_message.txt");

	            int ch;
	            while ((ch = encReader.read()) != -1) {
	                decWriter.write(decryptChar((char) ch, shift));
	            }

	            encReader.close();
	            decWriter.close();

	            System.out.println("Decrypted message written to dec_message.txt");

	        } catch (IOException e) {
	            System.out.println("Error handling file: " + e.getMessage());
	        }

	    }
	}
