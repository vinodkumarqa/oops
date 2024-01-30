package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Admin\\Downloads");
		try {
			FileInputStream stream=new FileInputStream(f);
			System.out.println("file is there");
			System.out.println("compile error");
			System.out.println("runtime error");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("the file is missing");
		}
		finally {
		
           System.out.println("compile error");
           System.out.println("runtime error");

	}

}
}