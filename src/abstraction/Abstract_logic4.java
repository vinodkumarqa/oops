package abstraction;

public abstract class Abstract_logic4 {
	int id;
	String stuname;
	static String stuname1="ravi";
	public void student(int no,String name) {
		id=no;
		stuname=name;
	}
	public void display() {
		System.out.println(id+" "+stuname+" "+stuname1);
	}
	public abstract void show();

}
