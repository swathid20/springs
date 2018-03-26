package features;

public class Stringinswitchdemo {
	public static void testStringInSwitch(String param)  {
		 final String JAVA5 = "Java5";
		 final String JAVA6 = "Java6"; 
		final String JAVA7 = "Java7";
		 switch (param) 
		
		 { case JAVA5: 	System.out.println("JDK 5.0"); break; 
		   case JAVA6:   System.out.println("JDK 6.0"); break;
		   case JAVA7:     System.out.println("JDK 7.0"); break;
		   default :System.out.println(" Wrong data");
		 } 
		 
	}
	public static void main(String[] args) {
		testStringInSwitch(args[0]);

	}

}
