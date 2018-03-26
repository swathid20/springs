package java8;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
public class IntStream1 {
	  public static void main(String[] args) {
	    IntStream i = IntStream.concat(IntStream.of(6,5,7,1, 2, 3, 3),IntStream.of(9,8));
	   
	    System.out.println("enter any 5 numbers");
	    Scanner sc=new Scanner(System.in);
	    IntStream i1=IntStream.of(sc.nextInt());
	    
	    i1=IntStream.of(sc.nextInt());
	   // IntStream.
	    i1=IntStream.of(sc.nextInt());
	    i1=IntStream.of(sc.nextInt());
	    i1=IntStream.of(sc.nextInt());
	    i1.forEach(x -> System.out.println(x));
	    
	/*  boolean d = i.allMatch(n-> n > 0 );
	   System.out.println(d);
	*/  
	//   i.forEach(n->System.out.println(n));
	  //  i.forEach(System.out::println);
	   
	// d1=DoubleStream.of(34.435634,12312.3423,345345.34534,456456.45645);
	//   d1.forEach( n -> System.out.println(n));
	  }
	}