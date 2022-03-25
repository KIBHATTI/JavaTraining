
public class HotelAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel2 hotelObj = new Hotel2();
		
		CashCounter ccObj1 = new CashCounter();
		ccObj1.payCash(hotelObj);
		
	}

}
interface Booking
{
	void bookRoom();
}

interface PayBill
{
	void payingBill();
}
class Hotel2 implements Booking,PayBill 
{
	static int numberOfRooms1;
	
	public Hotel2()
	{
		
	}
	
	public void bookRoom() {
		System.out.println("Room booked in hotel");
	}
	@Override
	public void payingBill() {
		// TODO Auto-generated method stub
		System.out.println("paying Bill in Hotel");
	}
	
}
class CashCounter extends Reception
{
	static void payCash(hotelObj ho)
	{
		
		System.out.println("pay cash");
	}
}
class Reception extends Hotel2
{
	static void getRoom()
	{
		System.out.println("only book room at Reception");
	}
}
//class Guest
//{
//	
//	static void payCash(CashCounter c)
//	{
//		System.out.println("pay cash");
//		
//	}
//	static void getRoom(Reception rec )
//	{
//		System.out.println("only book room at Reception");
//	}
//}

