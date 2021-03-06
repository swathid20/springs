package com.cts;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
//import java.util.stream.Stream;   Not needed. See commented-out line below.

/** Solutions to first set of Stream exercises from Java 8 tutorial at coreservlets.com.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, Angular 2,
 *  GWT, Android, Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java). Java 9 topics coming soon.</a>.
 */

public class StreamExamples1 {
  public static void main(String[] args) {
    List<String> words = 
        Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    //  Stream<String> wordStream = words.stream();  Then, reuse the Stream. NO!! Why not?
    
    // Problem 1
    System.out.println("Words (with spaces):");
    words.stream().forEach(s -> System.out.println("  " + s));
    
    
    
    
    
    // Problem 2
    System.out.println("Words (no spaces):");
    words.stream().forEach(System.out::println);
    
    // Problem 3
    List<String> excitingWords = words.stream()
                                      .map(s -> s + "!")
                                      .collect(Collectors.toList());
    System.out.printf("Exciting words: %s.%n", excitingWords);
    List<String> eyeWords = words.stream()
                                 .map(s -> s.replace("i", "eye"))
                                 .collect(Collectors.toList());
    System.out.printf("Eye words: %s.%n", eyeWords);
    List<String> upperCaseWords = words.stream()
                                       .map(String::toUpperCase)  // or  .map(s -> s.toUpperCase())
                                       .collect(Collectors.toList());
    System.out.printf("Uppercase words: %s.%n", upperCaseWords);
    
    // Problem 4
    List<String> shortWords = words.stream()
                                   .filter(s -> s.length() < 4)
                                   .collect(Collectors.toList());
    System.out.printf("Short words: %s.%n", shortWords);
    List<String> wordsWithB = words.stream()
                                   .filter(s -> s.contains("b"))
                                   .collect(Collectors.toList());
    System.out.printf("B words: %s.%n", wordsWithB);
    List<String> evenLengthWords = words.stream()
                                        .filter(s -> (s.length() % 2) == 0)
                                        .collect(Collectors.toList());
    System.out.printf("Even-length words: %s.%n", evenLengthWords);
    
    // Problem 5, using helper method to avoid repeating code
    String result1 = firstFunnyString(words, "E");
    System.out.println("Uppercase short word with 'E': " + result1);
    String result2 = firstFunnyString(words, "Q");
    System.out.println("Uppercase short word with 'Q': " + result2);
    
    // Problem 6
    Function<String,String> toUpper = 
        s -> { System.out.println("Uppercasing " + s);
               return(s.toUpperCase());
             };
    String result3 = words.stream()
                          .map(toUpper)
                          .filter(s -> s.length() < 4)
                          .filter(s -> s.contains("E"))
                          .findFirst().orElse("No match");
    System.out.println("Uppercase short word with 'E': " + result3);
    
    // Problem 7
    String[] excitingWords2 = words.stream()
                                   .map(s -> s + "!")
                                   .toArray(String[]::new);
    System.out.printf("Exciting words as array: %s.%n", Arrays.asList(excitingWords2));
  }
  
  public static String firstFunnyString(List<String> words, 
                                       String containedTest) {
    String result =
      words.stream()
           .map(String::toUpperCase)
           .filter(s -> s.length() < 4)
           .filter(s -> s.contains(containedTest))
           .findFirst().orElse("No match");
    return(result);
  }
}
