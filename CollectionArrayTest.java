

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayTest {

	public static void main(String[] args)
	{
		ArrayList<Log> al = new ArrayList<Log>();
		
		Log logObj = new Log("Missed",LocalDateTime.of(2022, 2, 10, 12, 5),"Mom");
		Log logObj1 = new Log("Dialled",LocalDateTime.of(2022,3, 15, 22, 00),"Dad");
		Log logObj2 = new Log("Received",LocalDateTime.of(2021,01, 01, 06, 5),"Tanu");
		Log logObj3 = new Log("Received",LocalDateTime.of(2022,03, 6, 12, 50),"Sabina");
		Log logObj4 = new Log("Missed",LocalDateTime.of(2022, 02, 25, 01, 55),"Balkar");
		al.add(logObj4);
		al.add(logObj3);
		al.add(logObj2);
		al.add(logObj1);
		al.add(logObj);
		
		Iterator<Log> iterator = al.iterator();
		while(iterator.hasNext())
		{
			Log logOBJ =iterator.next();
			System.out.println("details of the calls Log "+logOBJ);
		}
	}

}
class Log
{
	String logType;
	LocalDateTime time;
	String name;
	public Log(String logType, LocalDateTime time, String name) {
		super();
		this.logType = logType;
		this.time = time;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", time=" + time + ", name=" + name + "]";
	}
	
}
