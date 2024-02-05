package collections;

import java.util.ArrayList;

public class Arraylistex3 {
	public static void main(String[] args) {
		
		ArrayList<Employee> emps= new ArrayList<Employee>();
		emps.add(new Employee(1001, "tae", 50000));
		emps.add(new Employee(1006, "jimin", 60000));
		emps.add(new Employee(1006, "joon", 7000));
		emps.add(new Employee(1007, "nikki", 50000));
		
		 Employee  first=emps.get(0);
		 System.out.println(first);
		 
		 for(Employee e:emps)
		 {
			 System.out.println
			 (e);
		 }
				 
	}

}
