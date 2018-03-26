package java8app;
import java.util.*;
public class Reducedemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		int sum = 0;
		for(Integer n : list) {
			int x = n * n;
			sum = sum + x;
		}
		System.out.println(sum);

		//New way:
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		int sum1 = list1.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		System.out.println(sum1);

	}
}