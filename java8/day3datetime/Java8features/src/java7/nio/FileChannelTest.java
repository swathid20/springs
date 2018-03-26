package nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class FileChannelTest {
  public static void main(String[] args) throws IOException {
      FileInputStream fin = null;
      FileChannel fchannel = null;
      try{
        //opens a file to read from the given location
        fin = new FileInputStream("E:\\abcd.txt");
        
        //returns FileChannel instance to read the file
        fchannel = fin.getChannel();   
        
        //allocate byte buffer size
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        
        while(fchannel.read(byteBuffer) > 0){
            
            //limit is set to current position and position is set to zero
            byteBuffer.flip();
            
            while(byteBuffer.hasRemaining()){
                char ch = (char) byteBuffer.get();
                System.out.print(ch);
            }
            
            //position is set to zero and limit is set to capacity to clear the buffer.
            byteBuffer.clear();
        }
      }catch(IOException e){
          e.printStackTrace();
      }finally{
          fin.close();
          fchannel.close();
      }
  }
}