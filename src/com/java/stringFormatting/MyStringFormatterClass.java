package com.java.stringFormatting;

import java.util.Calendar;

public class MyStringFormatterClass {
	
	public static void main(String [] str) {
		
		//Creating calendar instance for using in date visualization
		Calendar calendar = Calendar.getInstance();
		//Creating string to show actual date
		String dateNow = String.format("Today is %tm.%1$te.%1$tY", calendar);
		// Printing string dateNow to console
		System.out.println(dateNow);
		
		//Creating string to insert into greeting
		String name = "Jack";
		//String to use format method
		String greeting = String.format("Hello dear %s!", name);
		//Printing greeting
		System.out.println(greeting);
		
		// Creating instance integer type to use in formatter
		int number = 12;
		//Creating string stringWithNumber
		String stringWithNumber = String.format("Number = %d ", number);
		//Printing stringWithNumber
		System.out.println(stringWithNumber);
		
		//Double number to insert into string
		double number1 = 12.3;
		String stringWithNumber1 = String.format("Number = %f ", number1);
		//Printing stringWithNumber
		System.out.println(stringWithNumber1); //12.300000 
		
		//Double number to insert into string
		double number2 = 12.3;
		String stringWithNumber2 = String.format("Number = %.12f ", number2);
		//Printing stringWithNumber
		System.out.println(stringWithNumber2); // Output  12.300000000000 filled with 0 all twelve digits places
	}

}
