package com.ayansys.test;

public class Test {

	public static void addData(String data) {
		System.out.println("Data:: "+data);
		if(data.equals("This is sachin misal")) 
			System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
        addData("This is sachin misal");
	}

}
