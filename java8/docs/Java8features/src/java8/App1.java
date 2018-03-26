package java8;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc =(a,b) -> a+b;
		
		System.out.println(calc.add(4, 5));

	}

}

@FunctionalInterface
interface Calc
{
	public int add(int a,int b);
	
	//public double getNum(double x);
}
