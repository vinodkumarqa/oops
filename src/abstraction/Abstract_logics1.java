package abstraction;

public  class Abstract_logics1 implements Abstractmethods {
	String schoolname;
	String studentname;
	int id;
	public void school(String name,String names,int no) {
		schoolname=name;
		studentname=names;
		id=no;
	}
	public void student() {
		System.out.println(schoolname+" "+studentname+" "+id);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_logics1 ab1=new Abstract_logics1();
		//ab1.school();
		ab1.school("saraswathi","vinod",25);
		ab1.student();
		

	}
	//@Override
	public void school() {
	//	// TODO Auto-generated method stub
	}
}
	
	


