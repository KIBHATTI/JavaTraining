
public class ClassExtensionTest {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.setDoctor("MBBS", 500);
		System.out.println(d);
		d.diagnose();
	    System.out.println("+++++++++++++++++++++++++++++");	
	     
	    Surgeon s = new Surgeon();
	    s.setSurgeon("MBBS",1000,"MS");
	    System.out.println(s);
	    s.diagnose();
	    s.cut();
	    s.surgery();
	    s.stitch();
	    System.out.println("+++++++++++++++++++++++++++++");
	    
	    HeartSurgeon hs = new HeartSurgeon();
	    hs.setHeartSurgeon("MBBS",5000,"MS","HS");
	    System.out.println(hs);
	    hs.diagnose();
	    hs.cut();
	    hs.heartSurgery();
	    hs.stitch();
	    System.out.println("+++++++++++++++++++++++++++++");
	}

}
class Doctor
{
	String qualification;
	int fees;
	
	void setDoctor(String qualification,int fees)
	{
		this.qualification = qualification;
		this.fees = fees;
	}
	void diagnose()
	{
		System.out.println("Doctor is diagnosing");
	}
	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + ", fees=" + fees + "]";
	}
	
}
class Surgeon extends Doctor
{
	String specializedQualification;
	
	void setSurgeon(String qualification, int fees, String specializedQualification) 
	{
		super.setDoctor(qualification, fees);
		this.specializedQualification = specializedQualification;
	}
	void diagnose()
	{
		System.out.println("Surgeon is diagnosing");
	}
	void cut()
	{
		System.out.println("Surgeon is Cutting the VEIN...");
	}
	void surgery()
	{
		System.out.println("Surgeon is doin surgery");
	}
	void stitch()
	{
		System.out.println("Surgeon is stitching");
	}
	@Override
	public String toString() {
		return "Surgeon [specializedQualification=" + specializedQualification + ", qualification=" + qualification
				+ ", fees=" + fees + "]";
	}
	
}
class HeartSurgeon extends Surgeon
{
	String surgeryQual;
	
	void setHeartSurgeon(String qualification, int fees, String specializedQualification,String surgeryQual) 
	{
		super.setSurgeon(qualification, fees,specializedQualification);
		this.surgeryQual = surgeryQual;
	}
	void diagnose()
	{
		System.out.println("heartSurgeon is diagnosing");
	}
	void cut()
	{
		System.out.println("heartSurgeon is cutting...");
	}
	void heartSurgery()
	{
		System.out.println("Heart Surgeon is doing Heart Surgery");
	}
	
	void stitch()
	{
		System.out.println("heartSurgeon is stitching");
	}
	@Override
	public String toString() {
		return "heartSurgeon [surgeryQual=" + surgeryQual + ", specializedQualification=" + specializedQualification
				+ ", qualification=" + qualification + ", fees=" + fees + "]";
	}	
}
