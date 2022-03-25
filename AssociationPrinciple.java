
public class AssociationPrinciple {

	public static void main(String[] args) {
		
		carIndustry ci = new carIndustry();
		
		Labour lb1 = new Labour();
		Electricity e1 = new Electricity();
	
		ci.useElectricity(e1);
		ci.useLabour(lb1);
		
		AddWindows ad1 = new AddWindows();
		//CarFrame cf3 = new CarFrame();
		CarFrame cf4 = new CarFrame("frame");
		
		MakeCar makeCarObj = ci.produceCar(cf4,ad1);
		System.out.println("herecar "+makeCarObj);
		RunCar runCarObj = makeCarObj.driveTest();
		LaunchCar lc1 = runCarObj.show(); 
		System.out.println(lc1);
}

}
class Industry
{
	
}
class AutoMobileIndustry extends Industry //isA
{
	
}

class Electricity
{

}
class Labour
{
	
}
class carIndustry extends AutoMobileIndustry //isA
{
		
	void useLabour(Labour lab) //uses 
	{
		System.out.println("uses Labour "+lab);
	}
	
	void useMachine(RawMaterial rm) //hasMachines
	{
		System.out.println("using Machine"+rm);
	}
	
	void useElectricity(Electricity e)
	{
		System.out.println("using Electricity "+e);
	}
	
	MakeCar produceCar( CarFrame cf2,AddWindows aw1)	//producessA Raw material
	{
		System.out.println("making car using frame and windows"+cf2+ " "+aw1);
		MakeCar carObj = new MakeCar();
		return carObj;
	}
											
}
class MakeCar
{
	RunCar driveTest()
	{
		RunCar rc = new RunCar();
		System.out.println("Car testing going on");
		return rc;
	}
}
class RunCar{
	LaunchCar show()
	{
		LaunchCar lc = new LaunchCar();
		System.out.println("Car is Launched");
		return lc;
	}
}
class LaunchCar
{
	//System.out.println();
	@Override
	public String toString() {
		return "LaunchCar []";
	}
	
}
class RawMaterial
{
//	CarFrame build()
//	{
//		CarFrame cf = new CarFrame();
//		return cf;
//	}
	
	AddWindows fit1()
	{
		AddWindows aw = new AddWindows();
		return aw;
	}
}
class CarFrame 
{
	String crfrme; 
//	public CarFrame() {}
	public CarFrame(String crfrme)
	{
		System.out.println("car frame is "+crfrme);
	}
	@Override
	public String toString() {
		return "CarFrame [crfrme=" + crfrme + "]";
	}
	
	
}
class AddWindows
{
	
}
