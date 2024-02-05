package collections;

import java.util.ArrayList;

public class Aarraylistex1 {
	
	public static void main(String[] args) {
		ArrayList<String> fruits= new ArrayList<String>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("pomogranate");
		fruits.add("pineapple");
		
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		String  fruit1=fruits.get(0);
		System.out.println(fruit1);
		
		String last = fruits.get(fruits.size()-1);
		System.out.println(last);
	}

}
