package arrayDemo;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
public class objectarraydemo {

		public static void main(String[] args) {
//			Employee emp=new Employee(1,"Mark",15000,"AA1001");
//			System.out.println(emp);
//			Employee emp2=new Employee(2,"John",17000,"AA3034");
//			System.out.println(emp2);
			ObjectOutputStream oos=null;
			FileOutputStream fos=null;
				
			serializationdemo(oos, fos);
			deserializationdemo();
		}
		
		private static void deserializationdemo() {
			try(FileInputStream fis=new FileInputStream("C:/javafsd/javademo/README.md");
				ObjectInputStream ois=new ObjectInputStream(fis);) {
				Employee emp=(Employee) ois.readObject();
				System.out.println("Object Deserialized - " +emp);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		private static void arrayofobjects() {
			Employee[] employees=new Employee[4];
			employees[1]=new Employee(1,"Mark",15000,"AA1001");
			employees[2]=new Employee(2,"John",17000,"AA3034");
			
		}

		private static void serializationdemo(ObjectOutputStream oos, FileOutputStream fos) {
			try {
				
				fos=new FileOutputStream("C:/javafsd/javademo/README.md");
				oos=new ObjectOutputStream(fos);
				Employee emp=new Employee(1,"Mark",15000,"AA1001");
				oos.writeObject(emp);
				System.out.println(emp);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

	class Employee implements Serializable{
		int id;
		String name;
		double salary;
		transient String aadharno;
		
		Employee(int id,String name,double salary, String aadharno){
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.aadharno=aadharno;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			if(this.aadharno==null) {
				return this.id+" "+this.name+" "+this.salary;
			}
			else {
				return this.id+" "+this.name+" "+this.salary+" "+this.aadharno;
			}
			
		}

}
