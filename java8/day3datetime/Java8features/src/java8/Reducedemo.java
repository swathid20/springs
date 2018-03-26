package java8;
import java.util.*;
public class Reducedemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
	
	
		int sum1 = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		System.out.println(sum1);

	}
}