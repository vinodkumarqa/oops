package inheritance;

public class Child extends parent {
	public void bird() {
		System.out.println("peacock");
	}
	

public static void main(String[] args) {
	Child c=new Child();
	//c.car();
	//c.vehicle();
	//c.vehicles();
	c.Animal();
	c.animal();
	c.bird();
	
	
}
}

