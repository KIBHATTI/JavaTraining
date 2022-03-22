import java.util.*;
//import java.util.Date;

public class FunctionTest2 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dance();
		
		String trim1 = trimText(" hello  how are you?  ");
		System.out.println(trim1);
		Date Date1=date_time();
		System.out.println("Current Date and Time is "+Date1);

	}
	static void dance()
	{
		System.out.println("Dancing !!! ");
	}
	static void displayMenu()
	{
		System.out.println("today's offers are:");
	}
	static String trimText(String d)
	{
		System.out.println(d);	
		return d.trim();
	}
	static Date date_time()
	{
		Date d1=new Date();
		//System.out.println(d1);
		return d1;
	}
	
}
