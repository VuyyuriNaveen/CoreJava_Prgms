import java.util.*;

class Student{

	int rno;
	String name;
	int age;
	static String org="C-Dac";

	void setData(int r,String n, int a){
		rno=r;
		name=n;
		age=a;
	}
	void stud(){
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter the rno");
 		rno=sc.nextInt();
 		System.out.println("entre the name");
 		name=sc.next();
 		System.out.println("enter the age");
 		age=sc.nextInt();

	}

	void display(){
		System.out.println(rno+" "+name+ " "+age+" "+org);
	}


}