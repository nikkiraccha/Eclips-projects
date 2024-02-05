package collections;

import java.util.Vector;

public class Enumeration {
	
	public static void main(String[] args) {
		
		Vector<String> names= new Vector<String>();
		names.add("bunny");
		names.add("chanti");
		names.add("nani");
		names.add("john");
		names.add("hardin");
		
		java.util.Enumeration<String> enumeration= names.elements();
		
		while(enumeration.hasMoreElements())
		{
			String element=enumeration.nextElement();
			
	          System.out.println("names are"+"----"+element);
		}
		
	}

}
