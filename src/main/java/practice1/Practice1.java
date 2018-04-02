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
		BankAccount account1=new BankAccount();
		BankAccount account2=account1;
	
		account1.deposit(3000);
		account1.withdraw(500);
		check(account1);
	}
	
	public static void check(BankAccount acc)
	{
		acc.checkMyBalance();
		
	}
	
	
}

class BankAccount
{
		int balance=0;

	public int deposit(int amount) 
	{
		balance+=amount;
		return balance;
	}
	
	public void checkMyBalance() 
	{
		System.out.println("ภÜพื"+balance);
		
	}
	
	public int withdraw(int spend) 
	{
		balance-=spend;
		return balance;

	}
}



