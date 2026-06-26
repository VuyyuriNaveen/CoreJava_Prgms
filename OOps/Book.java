import java.util.Scanner;
class Book{

	int isbn;
	String name;
	int page;
	String author;
	static String publisher="abc";
	/*
	Book(int i,String n,int p,String a){
		//System.out.println("its default const");
	//}
	//void setData(int i,String n,int p,String a){
		isbn=i;
		name=n;
		page=p;
		author=a;

	}
	*/
	
	// void Book(){

	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("Enter Isbn No:");
	// 	isbn=sc.nextInt();
	// 	System.out.println("Enter Book Name:");
	// 	name=sc.next();
	// 	System.out.println("Enter Pages:");
	// 	page=sc.nextInt();
	// 	System.out.println("Author");
	// 	author=sc.next();


	// }
	void Display(){
		System.out.println(isbn+" "+name+" "+page+" "+author+" "+publisher);
	}
}