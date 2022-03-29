
import emp.Employee;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee(35,"jack",4000f);
		ts.add(e1);
		Employee e2 = new Employee(95,"jane",3000f);
		ts.add(e2);
		Employee e3 = new Employee(1,"jill",2000f);
		ts.add(e3);
		Employee e4 = new Employee(60,"sonu",2000f);
		ts.add(e4);
		
		
		
		Iterator<Employee> iterator =  ts.iterator();
		while(iterator.hasNext())
		{
			Employee theEmp = iterator.next();
			System.out.println("Employee "+theEmp);
					
		}
		
	}

}
