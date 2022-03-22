public class Test1 
{

	public static void main(String[] args) {
		Scooter s = new Scooter();
		s.honk();
		s.startScooter("Press start button");
		int d=s.distanceCoveredbyScooter(12, 13);
		System.out.println("Distance Covered by the Scooter is "+d+" kms");
		s.applyBrake();
				}
}
class Scooter{
		
		void honk() {
			System.out.println("scooter is Honking...");
		}
		void startScooter(String s)
		{
			System.out.println("To start scooter.."+s);
			
		}
		int distanceCoveredbyScooter(int speed,int time )
		{
			 	int c = speed * time;
			 	return c;		
		}
		
		int applyBrake()
		{
			System.out.println("Scooter is Stopping...");
			return 0;
		}
		 
}


