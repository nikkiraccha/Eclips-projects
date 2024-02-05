package collections;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Roman {
	public static void main(String[] args) {
		Map<Character, Integer> roman=new HashMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter roman...");
		String num = sc.next();
		
		
		char [] ch=num.toCharArray();
		
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			char c=(ch[i]);
			int res=roman.get(c);
						
			if(sum<res)
			{
				sum=res-sum;
			}
			else
			{
				sum=sum+res;
			}
		}
		System.out.println(num+" "+sum);
		
		sc.close();
		
			
	}

}
