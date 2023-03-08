package companylocker;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompanyLocker {
	final static String appName = "My Locker";

	public static void main(String[] args) {

		// Initialization of variables

		int ch;
		int opch;
		String str;
		boolean flag = true;
		boolean flag2 = false;

		Set<String> fileNames = new TreeSet<String>(new Mycomparator());

		CurrentFiles curfile = new CurrentFiles(fileNames);
		FileOperations1 fileopt = new FileOperations1(fileNames);

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------- " + appName + " ---------------------\n");
		System.out.println("-----------------------------------------------------------\n");

		DeveloperDetails dd = new DeveloperDetails();
		dd.getDeveloperDetails();

		System.out.println("\n-----------------------------------------------------------\n");
		
		while (!flag2) {
			try  {

				while (true) {

					System.out.println("\n-----Options Available-----\n");
					System.out.println("1.Files Available\n2.File Operations\n3.Exit Application\n");

					System.out.print("Enter your choice : ");
					ch = scanner.nextInt();
					switch (ch) {

					case 1:
						curfile.displayFileNames(fileNames);
						System.out.println("\n-----------------------------------------------------------\n");
						break;

					case 2:
						while (flag) {

							System.out.println("\n-----------------------------------------------------------\n");
							System.out.println("-----File Operations-----");
							System.out.println("\n1.Add file\n2.Delete file\n3.Search file\n4.Back to main\n");
							System.out.print("Enter your choice : ");
							opch = scanner.nextInt();

							switch (opch) {

							case 1:
								System.out.print("\nEnter the name of the file to Insert : ");
								str = scanner.next();
								fileopt.addFile(str);
								break;

							case 2:
								System.out.print("\nEnter the name of the file to Remove : ");
								str = scanner.next();
								fileopt.removeFile(str);
								break;

							case 3:
								System.out.print("\nEnter the name of the file to Search : ");
								str = scanner.next();
								fileopt.searchFile(str);
								break;

							case 4:
								flag = false;
								break;

							default:
								System.out.println("\nPlease enter valid choice.\n");
								break;

							}
						}
						flag = true;
						break;

					case 3:
						System.out.println("\nApplication Closed");
						System.exit(0);

					default:
						System.out.println("\nPlease enter valid choice.\n");
						System.out.println("\n-----------------------------------------------------------\n");
						break;

					}flag2 = true;
				}
				
			} catch (Exception e) {
				System.out.println("\nPlease enter valid choice.\n");
				scanner.nextLine();
			}
		}
	}

}

class DeveloperDetails {

	private final String name = "Vishal B B";
	private final String email = "vishalbb178@gmail.com";
	private final String phone = "7383892839";
	private final String education = "Bachelor's degree in Computer Science";
	private final String technicalSkills = "Java, Python, Javascript, HTML/CSS, SQL";

	public void getDeveloperDetails() {
		System.out.println("Name             : " + name);
		System.out.println("Contact          : " + email);
		System.out.println("Phone            : " + phone);
		System.out.println("Education        : " + education);
		System.out.println("Technical Skills : " + technicalSkills);
	}

}

class Mycomparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}

class CurrentFiles {

	private Set<String> fileNames;

	CurrentFiles(Set<String> fileNames) {
		this.fileNames = fileNames;
	}

	public void displayFileNames(Set<String> fileNames) {

		if (fileNames.isEmpty()) {
			System.out.println("\nDirectory is empty.\n");
			return;
		}

		int numoffiles = fileNames.size();
		System.out.println("\nNumber of files present in the directory are : " + numoffiles + "\n");
		for (String x : fileNames) {
			System.out.println(x + " ");
		}

	}
}

interface fileOperations {

	void addFile(String newFile);

	void removeFile(String file);

	void searchFile(String file);

}

class FileOperations1 implements fileOperations {

	private Set<String> fileNames;
	private boolean b;

	FileOperations1(Set<String> fileNames) {
		this.fileNames = fileNames;
	}

	@Override
	public void addFile(String newFile) {

		b = fileNames.contains(newFile);
		Pattern pattern = Pattern.compile(".*\\..*");
		Matcher matcher = pattern.matcher(newFile);
		if (b) {
			System.out.println("\nFile name already exists please change the name and try inserting again.\n");
		} else {
			if (matcher.find()) {
				fileNames.add(newFile);
				System.out.println("\nFile added to directory.\n");
			} else {
				System.out.println("\nPlease enter a file with extension.\n");
			}

		}
	}

	@Override
	public void removeFile(String file) {
		// TODO Auto-generated method stub
		b = fileNames.contains(file);

		if (b) {
			fileNames.remove(file);
			System.out.println("\nFile removed successfully.\n");
		} else {
			System.out.println("\nFile not found.\n");
		}
	}

	@Override
	public void searchFile(String file) {
		// TODO Auto-generated method stub
		fileNames.contains(file);
		if (b) {
			System.out.println("\nFile present in the root directory.\n");
		} else {
			System.out.println("\nFile not found.\n");
		}
	}

}