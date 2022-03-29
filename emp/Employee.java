package emp;

public class Employee implements Comparable<Employee>
{
	int empNo;
	String eName;
	Float eSal;
	public Employee(int empNo, String eName, Float eSal) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("Comparing "+empNo+"  With Emp No "+o.empNo);
		return Integer.compare(empNo,o.empNo);
	}
	

}



