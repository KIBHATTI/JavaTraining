public class Test {

	public static void main(String[] args) {
	
		Tiger t = new Tiger();
		t.roar();
		t.hunt("Deer");
		int c = t.jump(5,4);
		System.out.println("Tiger covered..."+c+"area");
		int s = t.swimming();
		System.out.println("Tiger is swimming.."+s+"meters");
	}
}
	class Tiger
	{
		void roar()
		{
			System.out.println("Tiger is Roaring");
		}
		void hunt(String theHuntedAnimal)
		{
			System.out.println("Tiger is hunting.."+theHuntedAnimal);
		}
		int jump(int length, int height)
		{
			System.out.println("tiger is jumping");	
			int cover = length*height;
			return cover;
		}
		int swimming()
		{
			System.out.println("Tiger is Swimming... 20 meters");
			return 10;
		}
	}


