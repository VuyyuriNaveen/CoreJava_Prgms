package assignment9Q4;
import java.io.*;

public class q4 extends Thread {

	public static void main(String[] args) throws Exception {
		
	
	FileReader fr= new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/Multi/src/assignment9/A.java");
	FileReader fr1= new FileReader("C:/Users/DAC-User18/Desktop/Java_AC/Multi/src/assignment9/B.java");
	
	int ch;
	int wcount = 0;
	
	while( (ch = fr.read() ) != -1) {

		if(ch ==' ')
			wcount++;
	}
	while( (ch = fr1.read() ) != -1) {

		if(ch ==' ')
			wcount++;
	}
	
	q4 qq=new q4();
	q4 q1=new q4();
	qq.start();
	
	
	
	}
}
