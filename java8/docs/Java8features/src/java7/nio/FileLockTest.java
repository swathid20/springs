package nio;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
public class FileLockTest {
    public static void main(String[] args) throws IOException {
        
          FileInputStream fin = null;
          FileChannel fchannel = null;
          //opens a file to read from the given location
          fin = new FileInputStream("E:\\abcd.txt");
          
          //returns FileChannel instance to read the file
          fchannel = fin.getChannel();   
          
          //gets lock from postion 10 to 100
          FileLock lock1 = fchannel.lock(10,100, true); 
          System.out.println(lock1.isShared());
           
          //try for lock from position 201 to Integer.MAX_VALUE
          FileLock lock2 = fchannel.tryLock(201,250, true); 
          System.out.println(lock2.isShared());
          
          //locks are released.
          lock1.release();
          lock2.release();
          
          fchannel.close();
     }
}