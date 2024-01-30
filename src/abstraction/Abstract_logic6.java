package abstraction;

public class Abstract_logic6 {
	static String name;
	static int id;
	public void show() {
		System.out.println("hhhhhh");
	}
	public void display() {
		System.out.println(name+" "+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_logic6 ab=new Abstract_logic6();
		ab.show();
		ab.display("vinod",25);

	}

}
