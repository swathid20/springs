package java8app;
import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class Base64Demo {

	public static void main(String[] args) {
		      try {
				
		         // Encode using basic encoder
		         String base64encodedString = Base64.getEncoder().encodeToString("CognizantTechnologyServices".getBytes("utf-8"));
		         System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
				
		         // Decode
		         byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
				
		         System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
		         
		        	
		         
				
		        
		         
		      }catch(UnsupportedEncodingException e){
		         System.out.println("Error :" + e.getMessage());
		      }
		   }
		}
	