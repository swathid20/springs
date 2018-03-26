package java8;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;
import java.util.List;  
class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

/*class ProductnameComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Product p1=(Product)o1;
		Product p2=(Product)o2;
	return p1.name.compareTo(p2.name);
		
	}
	
}*/
public class ComparatorExample{  
    public static void main(String[] args) {  
        List<Product1> list=new ArrayList<Product1>();  
          
        //Adding Products  
        list.add(new Product1(1,"HP Laptop",25000f));  
        list.add(new Product1(3,"Keyboard",300f));  
        list.add(new Product1(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  if (p1.price<p2.price )return 1; else return -1 ;});  
        for(Product1 p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
    }  
}  