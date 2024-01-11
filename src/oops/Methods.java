package oops;

public class Methods {
	int empid;
	String empnames;
	
	public void m1(int id, String name){
		empid=id;
		empnames=name;
		}
	public void Display() {
		System.out.println(empid+" "+empnames);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m=new Methods();
		//m.m1(101,"vinod");
		m.m1(101,"vinod");
		m.Display();
		

	}

}
