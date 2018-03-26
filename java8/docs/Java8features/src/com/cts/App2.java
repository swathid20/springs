package com.cts;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		 List<String> features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		 
	//	 for(String x:features1)
		//	 System.out.println(x);
		 
	//	features1.forEach( n -> System.out.println(n)); 
		
		//method reference operator
		features1.forEach(System.out::println);

	}

}