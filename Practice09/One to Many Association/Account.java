public class Account 
{
	protected String accNo;
	protected double accBalance;
	
	public Account()
	{
		
	}
	public Account(String accNo, double accBalance)
	{
		this.accNo = accNo;
		this.accBalance = accBalance;
	}
	
	public void showAccount()
	{
		System.out.println("Account No: "+accNo);
		System.out.println("Account Balance: "+accBalance);
	}
}