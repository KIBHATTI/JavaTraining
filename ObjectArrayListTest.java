import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import emp.Employee;


public class ObjectArrayListTest 
{
		public static void main(String[] args)
		{
		//	ArrayList<Employee> staff = new ArrayList<Employee>(); //JUST REFERENCES NO ALLOCATION 
		//	LinkedList<Employee> staff = new LinkedList<Employee>();
			HashSet<Employee> staff= new HashSet<Employee>();
				
			staff.add(new Employee(31,"Nidhi",5000f));	//ALLOCATED EMPNO,ENAME,ESAL
				//	or
				Employee e = new  Employee(31,"Nidhi",5000f);
						staff.add(e);
			staff.add(new Employee(33,"poornima",6000f));
			staff.add(new Employee(34,"Veni",7000f));
			staff.add(new Employee(35,"Kanwar",5100f));
				
//BELOW FOR PRITING ARRAYLIST AND LINKED LIST				
//				for(int i=0;i<staff.size();i++) 
//				{
//					System.out.println("Staff details:: "+staff.get(i));
//				}
				
			
//FOR ARRAYLIST, LINKED LIST, HASH SET
			Iterator<Employee> iterator = staff.iterator();
			while(iterator.hasNext())
			{
				Employee theEmp = iterator.next();
				System.out.println(" details "+theEmp);
			}
				
	}


}