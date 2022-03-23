
public class ChildTest {

	public static void main(String[] args) {
		Grandfather gf = new Grandfather();
		gf.farming();
		System.out.println("+++++++++++++++++++++++++++++");
		
		Father f = new Father();
		f.farming();
		f.banking();
		System.out.println("+++++++++++++++++++++++++++++");
		
		Child c = new Child();
		c.farming();
		c.banking();
		c.javaCoding();
		
	}
}
class Grandfather
{
	Grandfather()
	{
				System.out.println("Grandfather constructor");
	}
	void farming()
	{
		System.out.println("Grandfather is farming....");
	}
	
}

class Father extends Grandfather
{
	Father()
	{
		//super();				 Child class implicitly calls the constructor of the parent class 
		System.out.println("Father constructor");
	}
	void farming()
	{
		System.out.println("Father is farming using Tractor..");
	}
	void banking()
	{
		System.out.println("Father is banking!!");
	}
	
}
class Child extends Father
{
	Child()
	{
		//super();				 Child class implicitly calls the constructor of the parent class 
		System.out.println("Child constructor");
	}
	void farming()
	{
		System.out.println("Child is farming using ROBOT..");
	}
	void banking()
	{
		System.out.println("Child is using net banking!!");
	}
	void javaCoding()
	{
		System.out.println("Child doing Java Coding!!!");
	}
	
}
