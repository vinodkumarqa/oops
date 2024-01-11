package inheritance;

public class Modifier extends Accessmodifier {
	
	public void car() {
		System.out.println(names+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier m1=new Modifier();
		m1.animal("vinod", 25);
		m1.car();

	}

}
