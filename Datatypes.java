
public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte playerNumber = 10;				// -128 - 0 - 127
		System.out.println("Player number "+playerNumber);
		System.out.println("Byte's min value "+Byte.MIN_VALUE);
		System.out.println("Byte's max value "+Byte.MAX_VALUE);
		System.out.println("size of Byte "+Byte.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		short rollnumber = -10000;				
		System.out.println("Roll  number "+rollnumber);
		System.out.println("short min value "+Short.MIN_VALUE);
		System.out.println("short max value "+Short.MAX_VALUE);
		System.out.println("size of short "+Short.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int  policyNumber = 999999999;				
		System.out.println("policy Number  "+policyNumber);
		System.out.println("int min value "+Integer.MIN_VALUE);
		System.out.println("int max value "+Integer.MAX_VALUE);
		System.out.println("size of int "+Integer.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		long nriAccountNumber = 999999999;				
		System.out.println("nriAccount Number  "+nriAccountNumber);
		System.out.println("long min value "+Long.MIN_VALUE);
		System.out.println("long max value "+Long.MAX_VALUE);
		System.out.println("size of long "+Long.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		float  interestRate = 13.5f;				
		System.out.println("interestRate   "+interestRate);
		System.out.println("float min value "+Float.MIN_VALUE);
		System.out.println("float max value "+Float.MAX_VALUE);
		System.out.println("size of float "+Float.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
		double  molecularDistance = 00.00001236d;				
		System.out.println("molecularDistance   "+interestRate);
		System.out.println("double min value "+Double.MIN_VALUE);
		System.out.println("double max value "+Double.MAX_VALUE);
		System.out.println("size of double "+Double.SIZE);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		char ch = 'K';				
		System.out.println("Characters   "+ch);
		System.out.println("char1's min value "+Character.MIN_VALUE);
		System.out.println("char1's max value "+Character.MAX_VALUE);
		System.out.println("size of char's "+Character.SIZE);
		System.out.println("numeric value "+Character.getNumericValue('a'));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		boolean boo=false;			
		System.out.println("boo "+boo);
		if(boo)
		{
			System.out.println("Boo is True");
		}
		else {
			System.out.println("Boo is False");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}


