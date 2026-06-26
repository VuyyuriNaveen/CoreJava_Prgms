package oop;

public class Employee {

	
		private int eid;
		private String ename;
		private double basicPay;
		private static String org;
		static {
			org="C-DAC";
			System.out.println(org);
		}
		public Employee(int eid, String ename, double basicPay) {
			
			this.eid = eid;
			this.ename = ename;
			this.basicPay = basicPay;
		}
//		public void dispEmp() {
//			System.out.println(eid+" "+ename+" "+basicPay+" "+org);
//		}
//		
		public void changeOrg() {
			org="CDAC-Hyderabad";
			System.out.println(org);
		}
		public void calSal() {
			double hra=0.3;
			double da=0.2;
			double ta=0.1;
			double sal=basicPay+basicPay*(hra*ta*da);
			System.out.println("Salary:"+sal);
			
		}
		public String toString() {
			return eid+" "+ename+" "+basicPay+" "+org;
		}
	

}
