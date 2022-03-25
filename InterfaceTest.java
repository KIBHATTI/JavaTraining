interface Liquid
{
	 public void drink();
	 public void pour();
	 void refillWater();
}
interface Solid
{
	void chew();
	void eat();
	void refillPlate();
}

class MyObject implements Liquid,Solid
{

	@Override
	public void chew() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refillPlate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("I am drinking in cafe \n");
	}

	@Override
	public void pour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refillWater() {
		// TODO Auto-generated method stub
		
	}
	
}
class AnotherObject extends MyObject
{} 
class Cafe extends AnotherObject
{
	static void drinkOnlyLiquids(Liquid liq)
	{
		//liq.drink();
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		
		MyObject myobjectObj = new MyObject();
		
		Cafe cafeObj = new Cafe();
		
		Cafe.drinkOnlyLiquids(myobjectObj);
	}

}