import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedListTestMe
{
	public static void main(String[] args)
	{
		LinkedList<Contact> llObj = new LinkedList<Contact>();
		
		Contact cobj = new Contact("Nidhi AHM",98793888, "doriya.nidhi@gmail.com");
		Contact cobj1 = new Contact("Mom",94157459, "bal.vinder@gmail.com");
		Contact cobj2 = new Contact("Dad",82838160, "singh.nirmal@yahoo.com");
		Contact cobj3 = new Contact("Bro",98793888, "reckaran@yahoo.com");
		
		llObj.add(cobj3);
		llObj.add(cobj2);
		llObj.add(cobj1);
		llObj.add(cobj);
		
		Iterator<Contact> iterator = llObj.iterator();
		while(iterator.hasNext())
		{
			Contact theContact = iterator.next();
			System.out.println("Contact List ::"+theContact);
		}
	}

}
class Contact
{
	String contactName;
	double mobileNo;
	String emailAddress;
	public Contact(String contactName, double mobileNo, String emailAddress) {
		super();
		this.contactName = contactName;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress
				+ "]";
	}
	
	

}
