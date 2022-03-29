import emp.Employee;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Employee staff[] = new Employee[5]; //JUST REFERENCES NO ALLOCATION 
		
		staff[0] = new Employee(31,"Nidhi",5000f);	//ALLOCATED EMPNO,ENAME,ESAL
		staff[1] = new Employee(32,"poornima",6000f);
		staff[2] = new Employee(33,"Kanwar",5100f);
		staff[3] = new Employee(34,"Deepmala",4000f);
		staff[4] = new Employee(35,"Veni",4500f);
		
		for(int i=0;i<staff.length;i++) 
		{
			System.out.println("Staff details:: "+staff[i]);
		}
	}

}

