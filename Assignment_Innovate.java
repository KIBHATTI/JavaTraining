
public class Assignment_Innovate {

	public static void main(String[] args) {
		Hotel h =  new Hotel();
		h.createHotel("Park Venue","Navi Mumbai",50,"KI Bhatti",5);
		h.displayHotelList();
		h.bookRoom("Tanu",1);
		System.out.println(h.roomToBook+" room Booked in the name of  : "+h.customerName);
		
	}

}
class Hotel
{
	String hotelName;
	String city;
	//int numberOfGuest;
	int numberOfRooms;
	String ownerName;
	int stars;
	String customerName;
	int roomToBook;
	
	void createHotel(String hname,String cname, int rooms, String owner,int star)
	{
		System.out.println("Creating Hotel");
		hotelName = hname;
		city = cname;
		numberOfRooms = rooms;
		ownerName = owner;
		stars = star;
		
	}
	void displayHotelList()
	{
		System.out.println("Hotel Name is                 : "+hotelName);
		System.out.println("City	                      : "+city);
		System.out.println("Number of rooms in the Hotel  : "+numberOfRooms+" Rooms");
		System.out.println("Name of the Hotel Owner       : "+ownerName);
		System.out.println("Rating of the Hotel           : "+stars+" star");
		
	}
	int bookRoom(String custName,int bookRoom)
	{
			customerName = custName;
			roomToBook = bookRoom;
			numberOfRooms = numberOfRooms - bookRoom;
			System.out.println("Available Room to book        : "+numberOfRooms);
			return numberOfRooms;
	}
	
}
