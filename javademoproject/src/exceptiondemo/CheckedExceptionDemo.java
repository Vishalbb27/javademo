package exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			checkedExceptionDemo();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void checkedExceptionDemo() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fs= new FileInputStream("/user/new.txt");
	}
}
