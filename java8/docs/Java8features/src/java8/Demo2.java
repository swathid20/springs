package java8;

 
interface FI
{
	public void call();
}
 class Demo2    
 {
	
	 public static  void taste(FI fi)
	 {
		 fi.call();
	 }
	 
	 public static void main(String args[])
	 {
		 taste( () -> System.out.println(" Lambda expression") );
	 }
 }
