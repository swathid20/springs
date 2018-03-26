package features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Employee
{	int id;
	String name;
	Employee()
	{
		id=101;
		name="abc";
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
public class TyperefDemo {
	
	//@SuppressWarnings({"unchecked", "varargs"})
	@SafeVarargs
	public static void printAll(String x,List<Object>... lists){
	    for(List<Object> list : lists){
	        System.out.println(list);
	    }
	}

	public static void main(String[] args) {
		HashMap<Integer,Employee> map=new HashMap<>();
		map.put(1, new Employee());
		map.put(2, new Employee());
		map.put(3, new Employee());
		System.out.println(map);
		
		printAll("a",Arrays.asList("java","java7","java8"));
		printAll("b",Arrays.asList("java","java7","java8","java9"));
		printAll("c",Arrays.asList(50,60,70,80,90));
		
		
		
	}

}
