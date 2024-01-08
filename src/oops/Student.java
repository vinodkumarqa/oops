package oops;

public class Student {
	String name;
	int rollno;
	int marks;
	String Grade;
	
	
	public void read() {
		//write();
		System.out.println("Student reading the book");
	}
	public void write() {
		read();
		System.out.println("Student writing the book");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="krishna";
		stu.rollno=1;
		stu.marks=85;
		stu.Grade="A";
		
		//stu.read();
		stu.write();

	}

}
