package Pack;

import java.io.*;
public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/abc.txt");
		FileWriter fw=new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/xyz.txt");
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("read file copied to xyz ");
		
		
	}

}
