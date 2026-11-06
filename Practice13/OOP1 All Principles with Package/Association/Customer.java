package Association;
import Interface.*;
import Parent.*;
public class Customer implements IOnetoManyOperations
{
	private int nid;
	private String name;
	//size will be 50
	private Account accounts[] = new Account[50]; 
	
	public Customer() { }
	public Customer(int nid, String name)
	{
		this.nid = nid;
		this.name = name;
	}
	
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNid() { return nid; }
	public String getName() { return name; }
	
	public void addAccount(Account a)
	{
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				System.out.println("Account added");
				break;
			}
		}
	}
	
	public void removeAccount(Account a)
	{
		for (int i = 0; i <accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				System.out.println("Account removed");
				break;
			}
		}
	}
	
	public void showAllAccounts()
	{
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("Account No: "+accounts[i].getAccountNo());
				System.out.println("Account Balance: "+accounts[i].getAccountBalance());
			}
			else
			{
				System.out.println("Nothing to show");
			}
		}
	}
}