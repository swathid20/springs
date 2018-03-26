package java8;

import java.util.*;
class Product
{
	int id;
	String name;
	Product(){}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class ForEachdemo {

	public static void main(String[] args) {
		/*List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		for (String feature : features) { System.out.println(feature); 
		} 
		//In Java 8:
		 List<String> features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		features.forEach(n -> System.out.println(n)); 
		
		// Even better use Method reference feature of Java 8 // method reference is denoted by :: (double colon) operator // looks similar to score resolution operator of C++ 
		features.forEach(System.out::println);
*/
		
		
		List<Object> list1 =new ArrayList<Object>();//Arrays.asList(34,56,78,2,3,4,5,6,78);
		list1.add(new Product(04,"Pen"));
		list1.add(new Product(05,"Pencil"));
		list1.add(new Product(06,"Bag"));
		
		for(Object x :list1)
			System.out.println(x);
			
		System.out.println("using lambda =======");
		list1.forEach(n->  System.out.println(n) );  //using lambda for each
		
		System.out.println("using scope operator=======");
		
		list1.forEach(System.out::println);
	}

}
