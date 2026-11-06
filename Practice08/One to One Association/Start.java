public class Start 
{
	public static void main(String[] args)
	{
		Account a1;
		a1 = new Account("11", 1500.00);
		Account a2 = new Account("12", 3000.00);
		
		Customer c1 = new Customer("Rahim", "012043", a1);
		Customer c2 = new Customer("Karim", "032043", a2);
		
		c1.showCustomer();
		System.out.println();
		c2.showCustomer();
	}
}