package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
/*
 * Java.nio.channels.Pipe is a pipe that reads and writes data in a sequence. Pipe ensures that data
 *  will be read in same order in which it is written to Pipe. Pipe has Pipe.SinkChannel and 
 *  Pipe.SourceChannel. Pipe.SinkChannel represents writable channel and Pipe.SourceChannel 
 *  represents readable channel. In our example we have a test data, we will write it into 
 *  Pipe using Pipe.SinkChannel and then we will read it by using Pipe.SourceChannel.
 */
public class PipeTest {
  public static void main(String[] args) throws IOException {
      
      //An instance of Pipe is created
      Pipe pipe = Pipe.open();
      
      // gets the pipe's sink channel
      Pipe.SinkChannel skChannel = pipe.sink();
      
      String testData = "Test Data to Check java NIO Channels Pipe.";

      ByteBuffer buffer = ByteBuffer.allocate(512);
      buffer.clear();
      buffer.put(testData.getBytes());

      buffer.flip();
       //write data into sink channel.
      while(buffer.hasRemaining()) {
          skChannel.write(buffer);
      }
      //gets  pipe's source channel
      Pipe.SourceChannel sourceChannel = pipe.source();
      buffer = ByteBuffer.allocate(512);

     //write data into console     
      while(sourceChannel.read(buffer) > 0){
          
          //limit is set to current position and position is set to zero
          buffer.flip();
          
          while(buffer.hasRemaining()){
              char ch = (char) buffer.get();
              System.out.print(ch);
          }
          
          //position is set to zero and limit is set to capacity to clear the buffer.
          buffer.clear();
      }
      
  }
}
 