package collections;

public class Employee {
        private int empid;
        private String empname;
        private double empsal;
        
		public Employee(int empid, String empname, double empsal) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.empsal = empsal;
		}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
		}
        
		
        
			
		
}
