package emailValidation;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		
		String[] email = new String[10];
		email[0]="michael.thomas@email.com";
		email[1]="john.doe@email.com";
		email[2]="sarah.smith@email.com";
		email[3]="james.wilson@email.com";
		email[4]="david.jackson@email.com";
		email[5]="amanda.roberts@email.com";
		email[6]="lisa.johnson@email.com";
		email[7]="kelly.miller@email.com";
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int b = 1;
		for(int i=0;i<email.length;i++) {
			if(email[i].equalsIgnoreCase(str)) {
				b=0;
			}
		
		}if (b==0) {
			System.out.println("Email found\n");
		}
		else {
			System.out.println("Email not found");
		}
	}
}
