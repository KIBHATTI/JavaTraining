import java.time.LocalDate;
public class BankTest {

	public static void main(String[] args) {
		
		BankAccount baObj = new BankAccount();
		//BankAccount baObj1 = new BankAccount();
		
		baObj.setBankAccount(101,"Kanwar Iqbal Bhatti",75000,LocalDate.of(2017,01,16),LocalDate.of(1989,11,20));
		baObj.printBankAccount();
		baObj.changeAccountName("KI bhatti");
		baObj.printBankAccount();
		System.out.println("\n");
		//float a = baObj.withdraw(74000);
		//System.out.println("Updated balance is Rs."+a);
		
		float b = baObj.deposit(54000);
		System.out.println("Updated balance is Rs."+b);
		System.out.println("\n");
		
		/*
		baObj1.setBankAccount(110,"Tavleen Singh",15000,30);
		baObj1.printBankAccount();
		float a1 = baObj1.withdraw(500);
		System.out.println("Updated balance of "+baObj1.accountHolderName+" is Rs."+a1);
		float si = baObj1.calculateInterest();
		System.out.println("Simple interest is "+si);
		*/
		
	}

}
class BankAccount
{
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	private LocalDate accountOpeningDate;
	private LocalDate dateOfBirth;
	private int age;
	
	
	void setBankAccount(int x,String y,float z,LocalDate aod, LocalDate dob)
	{
		System.out.println("Setting the bank account details....");
		accountNumber = x;
		accountHolderName = y;
		accountBalance = z;
		accountOpeningDate = aod;
		dateOfBirth = dob;
		LocalDate todaysDate = LocalDate.now();
		age=todaysDate.getYear() - dob.getYear();
		
	}
	
	void printBankAccount()
	{
		System.out.println("Account Number		:"+accountNumber);
		System.out.println("Account Holder Name	:"+accountHolderName);
		System.out.println("Account Balance 	: Rs."+accountBalance);
		System.out.println("Account Opening Date :"+accountOpeningDate);
		System.out.println("Account Holder's DOB :"+dateOfBirth);
		System.out.println("Account Holder's age :"+age);
		float si=calculateInterest();
		System.out.println("Simple Interest is :Rs."+si);
	}
	
	float  withdraw(float amountToWithdraw)
	{
		System.out.println("Withdrawing money...");
		if(amountToWithdraw > accountBalance)
		{
			System.out.println("Insufficient Funds");			
		}
		else {
			accountBalance = accountBalance-amountToWithdraw;
		}
		return accountBalance;
	}
	float deposit(float amountToDeposit)
	{
		System.out.println("Depositing Cash...");
		if(amountToDeposit > 5000)
		{
			System.out.println("please specify the source of the income");
		}
		else {
		accountBalance = accountBalance + amountToDeposit;
		}
		return accountBalance;
		
	}
	private float calculateInterest()
	{
		System.out.println("Calculating simple interest....");
		float si = accountBalance * 1 * 2.5f / 100;
		return si;
	}
	
	void changeAccountName(String newName)
	{
		System.out.println("changing the account holder's name to "+newName);
		accountHolderName = newName;
		
	}
	
}