
public class ConstructorTest {

	public static void main(String[] args) {
		
		System.out.println("\n");
		Camera cam1 = new Camera(10);
		Camera cam2 = new Camera(20);
		Camera cam3 = new Camera(30);
		
		cam1.setCamera(10);
		cam2.setCamera(20);
		cam1.setCamera(30);
	}

}
class Camera
{
	int megaPixel;
	String cameraBrand;
	int cameraId;
	float cost;
	
	Camera(int megaPixel)
	{
		System.out.println("Camera is constructed...");
		this.megaPixel = megaPixel;
		System.out.println("megapixel in cons "+megaPixel);
		System.out.println("=====================================");
	}
	
	void setCamera(int megaPixel)
	{
		System.out.println("Camera is constructed in fxn...");
		this.megaPixel = megaPixel;
		System.out.println("megapixel fxn "+megaPixel);
		System.out.println("=====================================");
	}
}
