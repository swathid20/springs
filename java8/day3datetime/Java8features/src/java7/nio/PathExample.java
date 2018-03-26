package nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathExample {
	public static void main(String[] args) throws IOException {
		//Get the instance of Path
		Path path = Paths.get("E:","sample","test.txt");
		//Print the path attributes
		System.out.println(path.getFileName());
		System.out.println(path.getFileSystem());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		
	        //Gets File Object
		File f = path.toFile();
		System.out.println(f.getAbsoluteFile());
		
		//Read File wit the help of Path
	        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
 	        String s = null;
	        while((s=reader.readLine())!=null){
	    	System.out.println(s);	
	        }
	}
}
 