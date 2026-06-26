package assignment9;

public class SleepExp extends Thread{
	String message;

    SleepExp(String message) {
        this.message = message;
    }

	public  void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(message);
			try {
				A.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
		
	
		
		
	
	public static void main(String[] args) throws InterruptedException {
		
		SleepExp sp=new SleepExp("morning");
		SleepExp sp1=new SleepExp("good");
		sp1.start();
	    sp1.join();
		
		sp.start();
		
//		sp1.join();
//		sp1.run1();
		
		
	}

}
