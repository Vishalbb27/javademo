package threadingdemo;

public class Utils {
	public static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"- "+message);
	}
}
