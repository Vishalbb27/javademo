package threadingdemo;

public class Utils {
	public static void printmessage(Object message) {
		System.out.println(Thread.currentThread().getName() + "- " + message.toString());
	}
}
