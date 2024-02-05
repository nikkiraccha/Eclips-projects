package emplooyee;

import java.util.List;

public class EmployeeMain{
	public static void main(String[] args) {
		Empdao dao = new Empdao(); 
		// Table Creation 
		int createResult = dao.createProducttable();
		System.out.println("Table creation status..." + createResult);
	}
}

class EmployeeMain1{
	public static void main(String[] args) { // Data insertion
		Empdao dao = new Empdao();
		Employee e = new Employee();
		e.setEmpId("1234v");
		e.setEmpName("Tae");
		e.setEmpSal(50000.0);
		
		int result = dao.saveProduct(e);
		if (result == 1) {
			System.out.println("Data inserted sucessfully....." + result);
		} else {
			System.out.println("Data insertion fail check once..." + result);
		}
	}
}

class EmployeeMain2{
		public static void main(String[] args) { 
			Empdao dao = new Empdao();
			Employee e = dao.findbyId("1234v");
			if(e!=null)
			{	System.out.println("Product Available...");
				System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
			}
			else
			{	System.out.println("Product is not available");	
			}
		}
}

class EmployeeMain3{
	public static void main(String[] args) { 
		Empdao dao = new Empdao();
		List<Employee> employee = dao.findAll();
		employee.forEach(e->System.out.println(e));
	}
}

class EmployeeMain4{
		public static void main(String[] args) { 
			Empdao dao = new Empdao();
			int count = dao.updateEmployee(20000, 5000);
			System.out.println("updated records count.."+count);
		}
}

class EmployeeMain5 {
	public static void main(String[] args) { 
		Empdao dao = new Empdao();
		int count = dao.deleteEmpById("PD2450");
		System.out.println("deleate records count.."+count);
	}
}

class EmployeeMain6 {
	public static void main(String[] args) { 
		Empdao dao = new  Empdao();
		int count = dao.deleteEmpByPrice(60000);
		System.out.println("deleate records count.."+count);
	}
}

class EmployeeMain7 {
	public static void main(String[] args) { 
		Empdao dao = new Empdao();
		int count = dao.droptable();
		System.out.println("Table is dropped status...."+count);
	}
}

