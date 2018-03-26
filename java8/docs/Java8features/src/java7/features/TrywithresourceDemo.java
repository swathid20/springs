package features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithresourceDemo {

	public static void main(String[] args) throws IOException
	{
		 //resource creation
		
		String line=null;
		try(FileReader f=new FileReader("E:\\abc.txt"); 
		BufferedReader b=new BufferedReader(f))
		{
			 line=b.readLine();
			 System.out.println(line);
			
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*finally{
			f.close();
			b.close();   //resource release
		}*/
	}

}
