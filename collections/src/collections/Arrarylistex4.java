package collections;

import java.util.ArrayList;

public class Arrarylistex4 {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setSid(100);
		s1.setSname("nikki");
		s1.setEmail("nikki@gmail.com");
		s1.setMobile(778998755);
		
		Student s2= new Student();
		s2.setSid(103);
		s2.setSname("manas");
		s2.setEmail("manas@gmail.com");
		s2.setMobile(88789086);
		
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(s2);
		students.add(s1);
		
		for (Student s:students)
		{
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getEmail()+s.getMobile());
		}
		
		
		
	}
	
	

}
