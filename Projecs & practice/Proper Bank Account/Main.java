import Accounts.*;
import Customer.*;
public class Main
{
	public static void main(String[] args)
	{
		Account a1=new CurrentAccount("dfdf",500000);
		Account a2=new SavingAccount("dfes",400000);
		Account a3=new FixedDeposit("gded",80000);
		
		Account [] accounts=new Account[5];
		
		accounts[0]=a1;
		accounts[1]=a2;
		accounts[2]=a3;
		
		
		Customer c1= new Customer ("Foysal", accounts);
		((CurrentAccount)a1).add(400.23);
		((FixedDeposit)a3).withdraw(500.75);
		
		/*a1.display();
		a2.display();
		a3.display();*/
		c1.displayCustomerAccount();
		
		
	}
}