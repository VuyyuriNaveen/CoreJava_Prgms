package assignment9;

public class B extends Thread {

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("wlcome");
			try {
				B.sleep(600);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
 
	
	
}
