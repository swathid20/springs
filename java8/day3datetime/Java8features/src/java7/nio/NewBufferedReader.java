package nio;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedReader {
	public static void main(String[] args) throws IOException {
	    //Get the instance of Path
	    Path path = Paths.get("E:\\sample","test.txt");
	    //opens the file to read
	    BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
	    String s = null;
	    while((s=reader.readLine())!=null){
	    	System.out.println(s);	
	    }
	}
}
 