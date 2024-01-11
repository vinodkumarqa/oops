package inheritance;

public class Child1 extends parent1  {
	String name="ravi";
	public void str1() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		///c.name();
		//c.age();
		//c.id();
		c.num();
		c.str();
		c.str1();
		

	}

}
