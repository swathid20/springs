package features;

public class TrywithmultipleexceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int y[]={4,5,6};
		
		
		try{
			System.out.println(y[5]);
			System.out.println(x/0);
			
		
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
