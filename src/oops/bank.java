package oops;

public class bank {
	String bankname;
	int empid;
	String Branch;

	
		public void interest() {
			System.out.println("pay the interset amount of loan");
		}
		public void bank() {
			interest();
			System.out.println("The bank will give the loan amount");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			bank sbi=new bank();
			sbi.bankname="hdfc";
			sbi.empid=101;
			sbi.Branch="cmk";
			
			
			sbi.bank();
			
		

	}

}
