package features;


//binary literals with underscores
public class Binaryliteraldemo {
	
	public static  void testBinaryIntegralLiterals(){
        int binary = 0b1010; //2^3 = 8
        if (binary == 10){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        long x=0B1111L;
        byte y=(byte)0B0010;
        System.out.println("Long Binary value:"+ x +"  "+y);
}
	
	public static void testUnderscoresNumericLiterals() 
	{ int oneMillion_ = 1_000_000; //new
	  int oneMillion = 1000000; 
	if (oneMillion_ == oneMillion)
	{ System.out.println(true); } 
	else{ System.out.println(false);
	 } }

	public static void main(String[] args) {
		testBinaryIntegralLiterals();
	//	testUnderscoresNumericLiterals();
		
			//byte value (8-bit) expressed in binary number system
		byte numByte = (byte) 0b10010001;

		//short value (16-bit) expressed in binary number system
		short numShort = (short) 0b1001000100011110;

		//int value (32-bit) expressed in binary number system
		int numInt =  0b10010001000111101010101001010101;

		//long value (64-bit) expressed in binary number system
		long numLong =  0b1001000100011110101010100101010110010001000111101010101001010101L;

		
		System.out.println(numByte+"  "+numShort+"  "+numInt+"   "+numLong);
	}

}
