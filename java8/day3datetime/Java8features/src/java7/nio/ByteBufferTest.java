package nio;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class ByteBufferTest {
	public static void main(String[] args) {
		try{
		    RandomAccessFile rafile = new RandomAccessFile("E:\\abcd.txt", "r");
		    FileChannel fileChannel = rafile.getChannel();
		    ByteBuffer byteBuffer = ByteBuffer.allocate(512);
		    while(fileChannel.read(byteBuffer) > 0) {
		    	byteBuffer.flip();
		        while(byteBuffer.hasRemaining()){
		        	char ch = (char) byteBuffer.get();
		        	System.out.print(ch);
		        }
		        byteBuffer.clear();
		    }
		    fileChannel.close();
		    rafile.close();
		} catch (IOException e) {
	      e.printStackTrace();
        }
	}
}