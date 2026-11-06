package Accounts;
public class CurrentAccount extends Account implements Method1
{
	public CurrentAccount(String accountno, double balance)
	{
		super(accountno,balance);
	}
	public void calculateInterest()
	{
		setBalance(getBalance()+getBalance()*.05); 
           		//5% interest will be count 
	}
	public void add(double taka)
	{
		setBalance(getBalance()+taka);
	}
	public void display()
	{
		System.out.println("Current Account No:"+getAccountNo());
		System.out.println("Current Account Balance:"+getBalance());
	
	}
	
}