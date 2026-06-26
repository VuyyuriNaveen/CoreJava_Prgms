package Pack;
import java.io.*;
public class FWDemo {
	public static void main(String[] args) throws IOException {
		/*
		FileWriter f=new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/abc.txt");
		f.write("Hi I am Student Of CDAC\n");
		f.write("This is @nd Line In the txt File\n");
		f.write("Thank You!!");
		f.close();		*/
		//To append in the File
		
		FileWriter f=new FileWriter("C:/Users/DAC-User18/Desktop/Java_AC/abc.txt",true);
		f.write("I am Student Of BDA\n");
		f.write("This is Updated ! Line In the txt File\n");
		f.write("Finally Thank You!!");
		f.close();	
		
		System.out.println("File Writing Success fully Completed!!");
	
	}

}
