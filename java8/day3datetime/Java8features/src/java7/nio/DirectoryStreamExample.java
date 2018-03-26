package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class DirectoryStreamExample {
	public static void main(String[] args) throws IOException{
		  DirectoryStream<Path> stream = null;
	      try{
	          Path dir = Paths.get("E:\\sample");
	    	  stream = Files.newDirectoryStream(dir, "*.{java,txt,exe}");
	    	   for (Path p: stream) {
		        System.out.println(p.getFileName());
		       }
		   } catch (IOException ex) {
		       ex.printStackTrace();
		   }finally{
			   stream.close();
		   }
	}
}