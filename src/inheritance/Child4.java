package inheritance;

public class Child4  extends Child3{
	//public void vehicles() {
	//	System.out.println("vehicles");
	//}
	String d="sairam";
	public void str2() {
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 c1=new Child4();
		//c1.vehicles();
		//c1.ship();
		//c1.marine();
		//c1.air();
		c1.str();
		c1.str1();
		c1.str2();

	}

}
