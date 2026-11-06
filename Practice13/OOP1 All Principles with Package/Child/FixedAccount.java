package Child;
import Parent.*;
public class FixedAccount extends Account 
{
	private int year;
	public FixedAccount() { }
	public FixedAccount(String accNo, double accBalance, int year)
	{
		super(accNo, accBalance);
		this.year = year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
}