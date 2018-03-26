package java8;
public class LamdaApp1 {
	public static void main(String[] args) {
		
		
		Operation o1= (a,b) -> a+b;
		
		System.out.println(o1.oper(4, 5));
		
		sq s= a->   a*a ;
		System.out.println(s.square(4));
		
		
		Message m=  g-> g.toUpperCase(); 
		
		
		System.out.println(m.msg("cts"));
	}
}
interface Operation {
    int oper(int a, int b);
    
 }

@FunctionalInterface
interface sq{
	int square(int a);
	//int add(int a);
}
interface Message
{	public String msg(String m);
}

