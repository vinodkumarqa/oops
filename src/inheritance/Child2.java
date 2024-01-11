package inheritance;

public class Child2 extends parent1 {
	int b=20;
	public void num1() {
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c1=new Child2();
		//c1.name();
		//c1.id();
		//c1.age();
		c1.num();
		c1.str();
		//c1.str1();
		c1.num1();

	}

}
