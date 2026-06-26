package assignment9;

public class A extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Good morning");
			try {
				A.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	
	
}
