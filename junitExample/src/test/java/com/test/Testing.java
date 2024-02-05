package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tool.Operations;

public class Testing {
	
         static Operations obj=null;
	
	@BeforeClass
	public static void init() {
		
		obj=new Operations();
	}
	@AfterClass
	public static  void destroy() {
		
		obj=null;
	}
	
	@Test
	public void testAdd() {
		
		int actual=obj.add(20, 40);
		int expected=60;
		assertEquals(expected, actual);
		
	}
	
	
	

}
