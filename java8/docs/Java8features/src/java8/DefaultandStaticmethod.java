package java8;
interface vehicle1
{
	default void getType()
	{		System.out.println("Any vehicle1");
	}
	static void getLoan()
	{
		System.out.println("Minimum loan for any vehicle for Govt Employees 2,00,000.00");
	}
}
public class DefaultandStaticmethod  implements vehicle1{
	public void getType()
	{
		System.out.println("Any vehicle2");
		vehicle1.super.getType();
	}
	public static void main(String[] args) {
	
		DefaultandStaticmethod ds =new DefaultandStaticmethod();
		ds.getType();
	
		vehicle1 v;
		//v.getType();
		//DefaultandStaticmethod
		vehicle1.getLoan();
		
		
	}

}
