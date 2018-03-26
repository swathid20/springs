package nio;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
public class CharBufferTest {
	public static void main(String[] args) {
		try {
			Reader rd = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\abcd.txt")));
		    CharBuffer chbuff = CharBuffer.allocate(1024);
		    while(rd.read(chbuff) > 0){
		    	chbuff.flip();
		        while(chbuff.hasRemaining()){
		        	char ch =  chbuff.get();
		        	System.out.print(ch);
		        }
		        chbuff.clear();
		    }
		    rd.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}