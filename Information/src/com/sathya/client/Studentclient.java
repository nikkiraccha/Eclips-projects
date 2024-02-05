package com.sathya.client;

import com.sathya.info.Facultyinfo;
import com.sathya.info.Instituteinfo;

public class Studentclient {
	public static void main(String[] args) {
		Instituteinfo i= new Instituteinfo();
		i.info();
		
		Facultyinfo.info();
	}

}
