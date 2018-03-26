package com.cts;
import java.util.function.BiFunction;  

interface x
{
	public void say(String msg);
	
}
		class Arithmetic{  
			
			
			public Arithmetic(String msg )
			{
				System.out.println("constructor==="+ msg);
			}
		public static int add( int a, int b){  
		return a+b;  
		}  
		
		
		public static String sayMessage123(String msg,String msg1)
		{
			return "Welcome"+msg+"  "+msg1;
		}
		
		public int product(int a,int b)
		{
			return a*b;
		}
		
		}  
		public class MethodReferenceDemo {  
			
		public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
		
		BiFunction<String, String,String> messenger = Arithmetic::sayMessage123;  
		String fullmsg=messenger.apply("Cts", "Hyderabad");
		System.out.println(fullmsg);
		
		Arithmetic a=new Arithmetic("cts");
		BiFunction<Integer, Integer, Integer> pro = a::product;
		int product=pro.apply(5, 6);
		System.out.println(product);
		
		x x1=Arithmetic::new;
		
		x1.say("Cogniznat");
		
		}  
		}  
