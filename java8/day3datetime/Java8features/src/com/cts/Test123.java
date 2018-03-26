package com.cts;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
@FunctionalInterface
 interface Add
{	public int getSum(int a,int b);
}
@FunctionalInterface
 interface Display {
    public String show();    
 }
public class Test123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Add add1 =( a,  b) ->  a+b ;
        System.out.println(add1.getSum(5, 6));
        Add add2=(a,b) ->a*a+b*b;
        
        System.out.println(add2.getSum(5, 6));
        
        Display d= () -> "Lamda without argument ";
        
       System.out.println(d.show());
       
       List<String> words =  Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
       
       System.out.println(" for each with lambda");
       words.forEach( n -> System.out.println(n));
       
       
       System.out.println(" method reference");
       
       words.forEach(System.out::println);
       
       System.out.println("=====filtered list==============");
       filter(words, (str)-> str.toString().startsWith("h")); 
      
       
       List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
       strings.forEach(x -> System.out.println(x));

       List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
       filtered.forEach(x -> System.out.println(x));
       
       
       System.out.println("============without collectors ============");
       strings.stream().filter( string  ->! string.isEmpty()).forEach(x -> System.out.println(x));

       Random random = new Random();
   //    System.out.println(random.nextInt());
        random.ints().limit(3).sorted().forEach(System.out::println);

       List<Integer> numbers = Arrays.asList(3, 22, 34, 3, 7, 3, 5);
     //get list of unique squares
     List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

       
       numbers.stream().forEach(x -> System.out.println(x));
       
       System.out.println("==== distinct mapped list ====");
       numbers.parallelStream().map( i -> i*i).distinct().forEach(x -> System.out.println(x));
       
       long count=numbers.parallelStream().filter( i  -> i>5).count();
       System.out.println("count of numbers > 5 is  "+count);
       
       
       List<String> filtered1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

       System.out.println("Filtered List: " + filtered1);
       String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
       System.out.println("Merged String: " + mergedString);

       
       
       List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

       IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).summaryStatistics();

       System.out.println("Highest number in List : " + stats.getMax());
       System.out.println("Lowest number in List : " + stats.getMin());
       System.out.println("Sum of all numbers : " + stats.getSum());
       System.out.println("Average of all numbers : " + stats.getAverage());
      

       
       
	}
	public static void filter(List names, Predicate condition)
	 { names.stream().filter((name) -> (condition.test(name))).forEach((name) -> { System.out.println(name + " "); 
	}); }


}


