package statics;

public class Stu {
	String empname;
	int empid;
	static int sal=30000;
	
	public Stu(String name,int no) {
		empname=name;
		empid=no;
	}
	public void display() {
		System.out.println(empname+" "+empid+" "+sal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1=new Stu("vinod",25);
		s1.display();
		

	}

}
