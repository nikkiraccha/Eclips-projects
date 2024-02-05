package collections;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(23);
		numbers.add(54);
		numbers.add(24);
		numbers.add(23);
		numbers.add(00);
		numbers.add(12);
		
		java.util.ListIterator<Integer> n= numbers.listIterator();
		
		
		
	}
}
