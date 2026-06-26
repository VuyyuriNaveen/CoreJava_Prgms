package Pack;

public class DemoClass {
	public static void main(String[] args) {
		prime1 p1=new prime1();
		Thread t1 = new Thread() {
			@Override
			public void run() {
			p1.prime();
			}
		}; 
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
			p1.febo();
			}
		}; 
		t2.start();
		Thread t3 = new Thread() {
			@Override
			public void run() {
			p1.same1();;
			}
		}; 
		t3.start();
	}

}
