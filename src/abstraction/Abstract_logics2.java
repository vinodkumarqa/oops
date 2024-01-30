package abstraction;

public  class Abstract_logics2 implements Abstractmethods  {
	String empname;
	int empid;
	public Abstract_logics2(String name,int id) {
		empname=name;
		empid=id;
	}
	public void display() {
		System.out.println(empname+" "+empid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_logics2 ab2=new Abstract_logics2("vinod", 25);
		ab2.display();

	}

}
