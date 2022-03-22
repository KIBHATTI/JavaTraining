import java.awt.Frame;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greeting to the World of Java Programming");
		clap();
		setFontSize(10,"Comic Sans","bold");
		String name = convertToUpperClass("kanwar iqbal bhatti");
		System.out.println("Name is: "+name);
		int score= hitSixer();
		System.out.println("Score is: "+score);
		
	}
	static void clap()
	{
			System.out.println("I am clapping");
	}	
	static void setFontSize(int size,String fontName, String fontStyle)
	{
		System.out.println("Setting the font size "+size);
		System.out.println("Setting the font name "+fontName);
		System.out.println("Setting the font style "+fontStyle);
	}
	static String convertToUpperClass(String yourname)
	{
		return yourname.toUpperCase();
	}	
	static int hitSixer()
	{
		return 6;		
	}
}
