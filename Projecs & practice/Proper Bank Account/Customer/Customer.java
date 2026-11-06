package Customer;
import Accounts.*;

public class Customer
{ private String name;
  private Account [] accounts;
  public Customer(String name, Account [] accounts)
  {
	  this.name=name;
	  this.accounts=accounts;
  }
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setAccount(Account [] accounts)
{
	this.accounts=accounts;
}
public Account[]  getAccount()
{
	return accounts;
}
public void setCustomerAccount(Account custo)
{     boolean flag=false;
	for (int i=0;i<accounts.length;i++)
	{    
		if(accounts[i]==null)
		{
			accounts[i]=custo;
			
			flag=true;
			break;
		}
	}
		
		if(flag==true)
		{
			System.out.println("Added a new account !");
		}
		else 
		{
			System.out.println("There don't have space   !");
		}
		
	
}

  public void displayCustomerAccount()
  {  System.out.println("Name"+(0+1)+":"+getName());
		  System.out.println("Account Info:");
	  for(int i=0;i<accounts.length;i++)
	  {
		  if(accounts[i]!=null)
	  { 
		  System.out.println("Account No"+accounts[i].getAccountNo());
		  System.out.println("Balance:"+accounts[i].getBalance());
		  
	  }
	  }
  }
  
   public void removedAccount(Account accoun)
   {
	   for(int i=0;i<accounts.length;i++)
	   {
		   if(accounts[i]==accoun)
		   {
			   accounts[i]=null;
			   System.out.println("Account removed!");
			   break;
		   }
	   }
   }


}