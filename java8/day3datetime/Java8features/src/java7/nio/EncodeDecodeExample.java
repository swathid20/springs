package nio;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
public class EncodeDecodeExample {
	public static void main(String[] args) throws CharacterCodingException {
		 Charset charset = Charset.forName("UTF-8");
		 CharsetDecoder chdecoder = charset.newDecoder();
		 CharsetEncoder chencoder = charset.newEncoder();
		 String s = "Encode and Decode Example.";
		 ByteBuffer byteBuffer= ByteBuffer.wrap(s.getBytes());
		 CharBuffer charBuffer = chdecoder.decode(byteBuffer);
		 ByteBuffer newByteBuff = chencoder.encode(charBuffer); 
		 while(newByteBuff.hasRemaining()){
	        	char ch = (char) newByteBuff.get();
	        	System.out.print(ch);
	     }
		 newByteBuff.clear();	
	}
}