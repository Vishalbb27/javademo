package javademoproject;

public class switchdemo {
	public static void main(String[] args) {
		int userOption=2;
		switch(userOption) {
		case 1:
			System.out.println("Main Menu");
			break;
		case 2:
			System.out.println("Existing Customer");
			break;
		default:
			System.out.println("Pls. select a valid option");
		}
	}
}
