package com.cts;

import java.util.*;



public class FunctionExamples {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hello", "hola", "goodbye", "adios");
    
    String word1 = 
        FunctionUtils.firstAllMatch(words.stream(), 
                                    s -> s.contains("o"),
                                    s -> s.length() > 5);
    System.out.println("First word with o and 5+ letters is " + word1);
    
    String word2 = 
        FunctionUtils.firstAllMatch(words.stream(), 
                                    s -> s.contains("o"),
                                    s -> s.length() > 8);
    System.out.println("First word with o and 8+ letters is " + word2);
    
    String word3 = 
        FunctionUtils.firstAnyMatch(words.stream(), 
                                    s -> s.contains("o"),
                                    s -> s.length() > 5);
    System.out.println("First word with o or 5+ letters is " + word3);
    
    String word4 = 
        FunctionUtils.firstAnyMatch(words.stream(), 
                                    s -> s.contains("o"),
                                    s -> s.length() > 8);
    System.out.println("First word with o or 8+ letters is " + word4);
    
    String word5 = 
        FunctionUtils.firstAnyMatch(words.stream(), 
                                    s -> s.contains("q"),
                                    s -> s.length() > 8);
    System.out.println("First word with q or 8+ letters is " + word5);
  }
}
