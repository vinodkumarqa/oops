package oops;

public class Animal {
	int age;
	String species;
	int legs;
	
	public void doeat() {
		System.out.println("Animal is eating");
	}
	
	public void makesound() {
		System.out.println("Animal makes sound");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger=new Animal();
		tiger.age=4;
		tiger.species="leopard";
		tiger.legs=4;
		
		tiger.doeat();
		tiger.makesound();

	}

}
