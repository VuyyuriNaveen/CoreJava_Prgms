package asg3;

public class Person {
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	Person() {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setName(String name) {
		this.name = name;
	}
	Person(String name){
		this.name=name;
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public void disp() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Country:"+country);
	}
	
		
		

	
}
