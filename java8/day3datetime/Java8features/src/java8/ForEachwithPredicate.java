package java8;

import java.util.*;
import java.util.function.Predicate;
public class ForEachwithPredicate {
		public static void main(String args[]) {
		 List<String> languages = new ArrayList<String>();//Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		 languages.add("Java");
		 languages.add("Scala");
		 languages.add("c++");
		 languages.add("J2EE");
			
			//languages.get(1).toString().s
		 
		 languages.forEach(n -> System.out.println(n));
		 
		 
		 System.out.println("Languages which starts with J :");
		 filter(languages, ( str)-> str.startsWith("J")); 
		 
		 
		 
		 
		System.out.println("Languages which ends with a "); 
		filter(languages, (str)->str.endsWith("a")); 
		
		
		
		System.out.println("Print all languages :");
		 filter(languages, (str)->true); 
		System.out.println("Print no language : ");
		 filter(languages, (str)->false); 
		System.out.println("Print language whose length greater than 4:");
		
		 filter(languages, (str)->str.length() > 4); 
		 } 
		
	/*	public static void filter(List names, Predicate condition) {
		 for(String name: names) { 
		if(condition.test(name)) { 
		System.out.println(name + " ");
		 } } } }*/

		//betterway
		
		public static void filter(List<String> names, Predicate condition)
		 { names.stream().filter((name) -> (condition.test(name))).forEach((name) -> { System.out.println(name + " "); 
		}); }


		


}
