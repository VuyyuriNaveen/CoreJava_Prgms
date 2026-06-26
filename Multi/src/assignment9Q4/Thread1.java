package assignment9Q4;

import java.io.File;
import java.io.FileReader;

public class Thread1 extends Thread{
	
	private String filepath;

	public Thread1(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void run() {
		int ch=0;
		int wcount=0;
		boolean inWords= false;
		try {
			FileReader f=new FileReader(filepath);
			while((ch=f.read())!=-1) {
				if(Character.isWhitespace(ch)) {
					inWords=false;
					
				}
				else if(!inWords) {
					wcount++;
					inWords=true;
				}
				
			}
			System.out.println(wcount);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	
	}
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1("C:/Users/DAC-User18/Desktop/Java_AC/Multi/src/assignment9/A.java");
		t1.start();
	}
	
	
	
}

