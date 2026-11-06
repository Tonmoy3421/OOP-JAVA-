import Association.*;
import Child.*;
import Interface.*;
import Parent.*;
public class Start 
{
	public static void main(String[] args)
	{
		Account acc1 = new FixedAccount("ACC1", 50000.00, 2); //object reference
		Account acc2 = new SavingsAccount("ACC2", 10000.00, 0.1); //object reference
		
		Customer c1 = new Customer(1, "Rakib");
		c1.addAccount(acc1);
		c1.addAccount(acc2);
		c1.removeAccount(acc1);
		c1.showAllAccounts();
	}
}