package Pack;
import java.util.ArrayList;

public class prime1 {	
	ArrayList<Integer> prime=new ArrayList<>();
	ArrayList<Integer>febo1=new ArrayList<>();
	public synchronized void prime() {	
		System.out.println("Prime -----");
		for(int i=2; i<=1000; i++) {		
			boolean isprime= true;
			for(int j=2;j<Math.sqrt(i); j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
				if (isprime) {
					prime.add(i);
					System.out.print(i+" ");				
			}
							
		}
		System.out.println();	
	}

	public synchronized void febo() {
		int a=0; 
		int b=1;
		System.out.println("febo   ......");
		System.out.print(a+" "+b+" ");
		febo1.add(a);
		febo1.add(b);
		while(true) {
			int c=a+b;
			if (c > 1000) {   // stop condition
                break;
            }
			if (c<=1000) {
				febo1.add(c);
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
		System.out.println();
	}
	
	public synchronized void same1() {
	    System.out.println("Common........");
	    for (int i = 0; i < febo1.size(); i++) {
	        if (prime.contains(febo1.get(i))) {
	            System.out.print(febo1.get(i)+" ");
	        }
	    }
	}

}
