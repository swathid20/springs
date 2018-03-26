package java8;
class Car1
{
	String name;
	Car1()
	{
		name="Mahindra";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Java8Tester {

	/*int operation(int a ,int b)
	{
		int c=a+b;
		return c;
	}*/
	   public static void main(String args[]){
	      Java8Tester tester = new Java8Tester();
	      
	      
	   
	       MathOperation addition = (int a, int b) -> a + b;
		      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
	      
	      //without return statement and without curly braces
	      
	      MathOperation division = (int a, int b) -> a / b;
	      
	      System.out.println(addition.operation(5,6));
	      System.out.println(subtraction.operation(5,6));
	      System.out.println(multiplication.operation(5,6));
	      System.out.println(division.operation(5,6));
	      
	      GreetingService greetService1 = message -> System.out.println( message);
	      
	      greetService1.sayMessage("Mahesh");
	      
	      
	      Loan emi1=(amt) -> amt/5;
	      
	      System.out.println("Using lamda calculating EMI"+ emi1.getEmi(60000));
	      FLoan fl1=(Car1) -> Car1.getName(); 
	      System.out.println(fl1.getCarName(new Car1()));
		   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
	   
	@FunctionalInterface
	   interface GreetingService {
	      void sayMessage(String message);
	    //  public int getsq(int c);
	   }
		
	interface Loan
	{
		int getEmi(int amt);
		
	}
	interface FLoan
	{
	String getCarName(Car1 c);
	   
	}
}