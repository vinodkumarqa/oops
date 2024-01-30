package abstraction;

public  class Abstract_logics implements Abstractmethods {
	public  void studentname() {
		System.out.println("vinod");
	}
	public void animal() {
		System.out.println("tiger");
	}
	public void car() {
		System.out.println("BMW");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_logics ab=new Abstract_logics();
		ab.studentname();
		ab.animal();
		ab.car();

	}
	@Override
	public void school() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void student() {
		// TODO Auto-generated method stub
		
	}

}
