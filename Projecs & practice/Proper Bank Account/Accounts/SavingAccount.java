package Accounts;
public class  SavingAccount extends Account
{
	public SavingAccount(String accountno, double balance)
	{
		super(accountno,balance);
	}
	public void calculateInterest()
	{
		setBalance(getBalance()+getBalance()*.1); //10 % interest will be count
	}
	public void deposit(double taka)
	{
	   setBalance(getBalance()+taka);
	}
	public void display()
	{
		System.out.println("Saving Account No:"+getAccountNo());
		System.out.println("Saving Account Balance:"+getBalance());
	}
}