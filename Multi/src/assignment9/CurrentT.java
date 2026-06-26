package assignment9;

public class CurrentT extends Thread {
	
	public void run() {
		  System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		
		CurrentT t1= new CurrentT();
		t1.setPriority(MIN_PRIORITY);
		CurrentT t2=new CurrentT();
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
