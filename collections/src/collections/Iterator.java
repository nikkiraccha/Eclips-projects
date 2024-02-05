package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterator {
	
	public static void main(String[] args) {
		
		HashSet<String> sweets= new HashSet<String>();
		sweets.add("jilebi");
		sweets.add("laddu");
		sweets.add("kalakanda");
		sweets.add("palakova");
		
		java.util.Iterator<String> i=sweets.iterator();
		
		while (i.hasNext()) {
			String n=i.next();
			System.out.println(n);
			
		}
	
		
	}

}
