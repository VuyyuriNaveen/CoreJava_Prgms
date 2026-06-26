package asg3;

public class Q3P {
	public static void main(String[] args) {
		Person p0=new Person();
		p0.setName("Hi");
		p0.setAge(22);
		p0.setCountry("India");
		System.out.println("By using Default Constructor:");
		p0.disp();
		System.out.println("Parameterized ConstructorS");
		Person p1=new Person("Nani",23);
		Person p2=new Person("CDAC");
		p2.disp();
	}

}
