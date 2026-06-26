package Pack;
import java.io.*;
public class RWDemo {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/abc.txt");
		FileWriter fw = new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/WRDemo.txt");
		int ch;
		int ccount = 0;
		int wcount = 0;
		int lcount = 0;
		while( (ch = fr.read() ) != -1) {
			fw.write(ch);// WRDemo.java
			System.out.print((char)ch);
			ccount++;
			
			if(ch ==' ')
				wcount++;
			
			if(ch =='\n')
				lcount++;
		}
		fw.write("\n\nNo of chars: "+ccount);
		fw.write("\n\nNo of words: "+(wcount+lcount-1));
		fw.write("\n\nNo of lines: "+lcount);
		
		
		
		fr.close();
		fw.close();
		
		System.out.println("\n\nNo of chars in the file: "+ccount);
		System.out.println("\n\nNo of words in the file: "+(wcount+lcount-1));
		System.out.println("\n\nNo of lines in the file: "+lcount);
	}

}