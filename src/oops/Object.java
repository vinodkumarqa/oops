package oops;

public class Object {
	int id;
	String names;
	int age;
	public void show(int id,String names,int age) {
		System.out.println(id+" "+names+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new Object();
		o.show(101,"vinod",25);

	}

}
