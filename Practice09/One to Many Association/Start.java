public class Start 
{
	public static void main(String[] args)
	{
		Account a1 = new Account("A01", 25000.00);
		Account a2 = new Account("A02", 30000.00);
		Account a3 = new Account("A03", 40000.00);
		
		Customer c1 = new Customer("Rahim", "01242", 5); //5 is the array size
		
		c1.insertAccount(a1); //index 0 = a1
		c1.insertAccount(a2); //index 1 = a2
		c1.deleteAccount(a2); //index 1 = null
		c1.insertAccount(a3); //index 1 = a3
		c1.insertAccount(a2); //index 2 = a2
		c1.deleteAccount(a3); //index 1 = null
		c1.insertAccount(a3); //index 1 = a3
		System.out.println();
		
		c1.showAllAccounts();
	}
}