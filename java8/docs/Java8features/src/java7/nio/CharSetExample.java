package nio;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/*
 * charset canonical name as US-ASCII changed to  a string into char buffer of Unicode 
 * charset by using byte buffer with US-ASCII charset and again 
 * changing that char buffer of Unicode charset into byte buffer of given charset.
 */
public class CharSetExample {
	public static void main(String[] args) {
		 Charset charset=Charset.forName("US-ASCII");
		 System.out.println(charset.displayName());
		 System.out.println(charset.canEncode());
		 String s= "Hello, This is Charset Example.";
		 //convert byte buffer in given charset to char buffer in unicode
		 ByteBuffer bb = ByteBuffer.wrap(s.getBytes());
		 CharBuffer cb = charset.decode(bb);
		//convert char buffer in unicode to byte buffer in given charset
		 ByteBuffer newbb = charset.encode(cb);
		 while(newbb.hasRemaining()){
	        	char ch = (char) newbb.get();
	        	System.out.print(ch);
	     }
		 newbb.clear();
	}
}
 