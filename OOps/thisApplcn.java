class thisApplcn{

	int isbn;
	String name;
	int page;
	String author;
	static String publisher="abc";

	 thisApplcn(int isbn,String name,int page,String author){
	 this.isbn=isbn;
	 this.name=name;
	 this.page=page;
	 this.author=author;

	}
	void display(){
		System.out.println(isbn+" "+name+" "+page+" "+author+" "+publisher);
	}
}			