package constructor;

public class Cons {
	String names;
	int id;
	
	public Cons(String name,int no) {
		names=name;
		id=no;
	}
	public void display() {
		System.out.println(names+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c1=new Cons("vinod",25);
		Cons c2=new Cons("ravi",25);
		c1.display();
		c2.display();

	}

}
