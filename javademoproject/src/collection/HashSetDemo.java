package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> intset=new TreeSet<String>(new StringComparator());
		intset.add("Maxim");
		intset.add("John");
		intset.add("Willam");
		intset.add("Neymar");
		intset.add("Joe");
		System.out.println(intset);
		
		Set<Employee> employees=new TreeSet<Employee>();
		employees.add(new Employee(1,"Mark",15000,"AA1001"));
		employees.add(new Employee(2,"Johni",17000,"AA3034"));
		System.out.println(employees);
		
		Set<Employee> emps = new TreeSet<Employee>(new EmpNameComparator());
		emps.add(new Employee(1,"Mark",15000,"AA1001"));
		emps.add(new Employee(2,"Johni",17000,"AA3034"));
		System.out.println(emps);
	}
}


class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		System.out.println(o1+" "+o2);
		int l1=o1.length();
		int l2=o2.length();
		if(l1<l2) {
			return -1;
		} else if(l1>l2) {
			return 1;
		} else {
			return o1.compareTo(o2);
		}
		
	}
	
	
}

class EmpNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.name.compareTo(o1.name);
	}
}

class Employee implements Comparable<Employee>{
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
					return this.id+"|"+this.name+"|"+this.salary;
				}
				else {
					return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
				}
				
			}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.id<o.id?-1:this.id>o.id?1:0;
		
//		return this.name.length()<o.name.length()?-1:this.name.length()>this.name.length()?1:0;
	}
	
}
