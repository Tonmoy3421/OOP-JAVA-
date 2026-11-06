package Accounts;
public abstract class Account
{
	private String accountno;
	private double balance;
	public Account(String accountno, double balance)
	{
		this.accountno=accountno;
		this.balance=balance;
	}
	public void setAccountNo(String accountno)
	{
		this.accountno=accountno;
	}
	public String  getAccountNo()
	{
		return accountno;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public abstract void calculateInterest();
	public abstract void display();
	
	public void deposit(double taka)
	{
		setBalance(getBalance()+taka);
	}
}