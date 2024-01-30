package exception;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//System.out.println("the exceptions");
			System.out.println(10/0);
			System.out.println("exception handling");
			System.out.println("finally block");
		}
		catch(Exception e) {
			//System.out.println(" the file missing");
			System.out.println(10/5);
		}
		finally {
			System.out.println("exception handling");
			System.out.println("finally block");
		}

	}

}
