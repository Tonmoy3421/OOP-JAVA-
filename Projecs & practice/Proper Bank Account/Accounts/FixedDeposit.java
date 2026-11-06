package Accounts;
public final class  FixedDeposit extends Account implements Method1, Method2 
{
	public FixedDeposit(String accountno, double balance)
	{
		super(accountno, balance);
	}
	public void calculateInterest()
	{
		setBalance(getBalance()+getBalance()*.2);  // 20% interest will be produce
	}
	public void add(double taka)
	{
		setBalance(getBalance()+taka);
	}
	public void withdraw(double taka)
	{
		setBalance(getBalance()-taka);
	}
	public void display()
	{
		System.out.println("Fixed Accont No:"+getAccountNo());
		System.out.println("Fixed Account Balance:"+getBalance());
	
	}
	
}