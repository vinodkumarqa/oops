package abstraction;

//public  class Abstract_methods extends Abstract_logic3 {

	
public  class Abstract_methods extends Abstract_logic4 {

	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("the profile shows");
		
	}

	/*public void name() {
		// TODO Auto-generated method stub
		System.out.println("vinod");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_methods ab1=new Abstract_methods();
		ab1.animal();
		ab1.car();
		ab1.name();*/
	public static void main(String[] args) {
		
	
	Abstract_methods ab=new Abstract_methods();
	Abstract_methods ab1=new Abstract_methods();
	ab.show();
	ab.student(25, "ravi");
	ab.display();
	ab1.student(25, "vinod");
	ab1.display();
	}
	
     
}
		





