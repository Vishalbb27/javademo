package filehandlingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) {
//		fileInputStreamDemo();
//		fileOutputStreamDemo();
		filewriterDemo();
		fileReaderDemo();
//		fileInputStreamDemo();
	}
	static void fileInputStreamDemo(){
		int i;
		File file = new File("C:/javafsd/javademo/README.md");
		System.out.println("File is read");
		try {
			FileInputStream fis=new FileInputStream(file);
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void fileOutputStreamDemo() {
		File file = new File("C:/javafsd/javademo/README.md");
		System.out.println("File is read");
		try {
			FileOutputStream fos=new FileOutputStream(file);
			System.out.println("File opened");
			System.out.println("-----------");
			String data =("File Handling In Java.");
			byte[] dataByteArray=data.getBytes();
			fos.write(dataByteArray);
			fos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void fileReaderDemo() {
		int i;
		File file = new File("C:/javafsd/javademo/README.md");
		System.out.println("File is read");
		try {
			FileReader fis=new FileReader(file);
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void filewriterDemo() {
		File file = new File("C:/javafsd/javademo/README.md");
		System.out.println("File is read");
		try {
			FileWriter fos=new FileWriter(file);
			System.out.println("File opened");
			System.out.println("-----------");
			String data =("File Handling In Java.");
			fos.write(data);
			fos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void fileInputBufferReader() throws FileNotFoundException {
		int i;
		FileReader file = new FileReader("C:/javafsd/javademo/README.md");
		System.out.println("File is read");
		try {
			BufferedReader fis=new BufferedReader(file);
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

