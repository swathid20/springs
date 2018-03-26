package java8;
import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().map((x) -> x*x*x).forEach(System.out::println);
		
		
	Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings.parallelStream().filter(string -> !string.isEmpty()).count();
		
System.out.println(count);
List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
System.out.println("Filtered List: " + filtered);
String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
System.out.println("Merged String: " + mergedString);
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
System.out.println("Highest number in List : " + stats.getMax());
System.out.println("Lowest number in List : " + stats.getMin());
System.out.println("Sum of all numbers : " + stats.getSum());
System.out.println("Average of all numbers : " + stats.getAverage());


List<Double> decimalnumbers=Arrays.asList(345.234,4554.2,433.34,789.67,657.89);
DoubleSummaryStatistics st1=decimalnumbers.stream().mapToDouble((x)->x).summaryStatistics();
System.out.println(st1.getMax());

	}
}
