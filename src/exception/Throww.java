package exception;

import java.io.File;

public class Throww extends Exception {
	
	//File f=new File("vinod");
	//FileInputStage stream=new FileInputStage(f);
	public Throww(String message) {
		super(message);
	}
	 void m1() throws Throww {
		int age=16;
		if(age<=18) {
			throw new Throww("age not valid");
		}
		
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Throww d=new Throww();
		d.m1();

	}

}
