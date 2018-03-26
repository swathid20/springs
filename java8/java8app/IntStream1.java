package java8app;
import java.util.stream.IntStream;
public class IntStream1 {
	  public static void main(String[] args) {
	    IntStream i = IntStream.concat(IntStream.of(6,5,7,1, 2, 3, 3),IntStream.of(9,8));
	    boolean d = i.allMatch(n-> n > 0 );
	    System.out.println(d);
	  }
	}