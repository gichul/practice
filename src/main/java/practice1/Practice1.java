package practice1;
/**
 * 
 * 
 * @author GiCheol
 *
 */

public class Practice1 {
	
	
	public static void main(String[] args) 
	{
		BankAccount account1=new BankAccount("312-132","956516-12355",10000);
		BankAccount account2=new BankAccount("213-213","956123-15312",20000);
		
		account1.deposit(10000);
		account1.checkMyBalance();
		account1.withdraw(4000);
		account1.checkMyBalance();
		
		account2.deposit(5000);
		account2.checkMyBalance();
		account2.withdraw(3000);
		account2.checkMyBalance();
		
		
		
		
	}
	
	
}



class BankAccount
{
	
	String accNumber;
	String ssNumber;
	int balance=0;

	public BankAccount(String acc, String ss, int bal)
	{
		accNumber=acc;
		ssNumber=ss;
		balance=bal;
	}


	public int deposit(int amount) 
	{
		balance+=amount;
		return balance;
	}
	
	public void checkMyBalance() 
	{
		System.out.println("accNumbe : "+accNumber);
		System.out.println("ssNumber : "+ssNumber);
		System.out.println("balance  : "+balance);
		
	}
	
	public int withdraw(int spend) 
	{
		balance-=spend;
		return balance;
	}
	
	
}



