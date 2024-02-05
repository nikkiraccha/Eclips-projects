package com.satyha.client;

import com.sathya.library.Book;
import com.sathya.library.Student;

public class Testclient {
	public static void main(String[] args) {
		
		Book b = new Book(1234,"java","gosling",500.15);
		System.out.println(b);
		
		Student s = new Student("kim","tae","tae143@gmail.com",9876655);
		System.out.println(s);
	}

}
