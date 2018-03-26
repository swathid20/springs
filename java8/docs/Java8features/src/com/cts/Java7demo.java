package com.cts;

public class Java7demo {

	public static void main(String[] args) {
		testStringInSwitch("Java 6");
		
	}
		public static void testStringInSwitch(String param){
		       final String JAVA5 = "Java 5";
		       final String JAVA6 = "Java 6";
		       final String JAVA7 = "Java 7";
		       switch (param) {
		           case JAVA5:
		               System.out.println(JAVA5);
		               break;
		           case JAVA6:
		               System.out.println(JAVA6);
		               break;
		           case JAVA7:
		               System.out.println(JAVA7);
		               break;
		       }
		   }


	

}
