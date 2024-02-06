package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Thow_demo {
	public void t1() throws FileNotFoundException {
		File f=new File("vinod");
		FileInputStream stream=new FileInputStream(f);
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Thow_demo d=new Thow_demo();
		d.t1();
	}
}
