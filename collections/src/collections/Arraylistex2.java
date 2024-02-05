package collections;

import java.util.ArrayList;

public class Arraylistex2 {
	public static void main(String[] args) {
		
		ArrayList<String> topcomp= new ArrayList<String>();
		topcomp.add("tcs");
		topcomp.add("wipro");
		topcomp.add("infosys");
		topcomp.add("IBM");
		topcomp.add("google");
		
		System.out.println(topcomp);
		System.out.println(topcomp.size());
		
		String firstcomapany=topcomp.get(0);
		System.out.println(firstcomapany);
		
		String second=topcomp.get(2);
		System.out.println(second);
		
		String last= topcomp.get(topcomp.size()-1);
		System.out.println(last);
		
		for(int i=2; i<=4;i++)
		{
			String s=topcomp.get(i);
			System.out.println(s);
			
		}
		for (String comp:topcomp)
		{
			System.out.print(comp+",");
		}
		
 	}
	

}
