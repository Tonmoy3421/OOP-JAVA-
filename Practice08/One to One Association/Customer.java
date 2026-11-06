public class Customer 
{
	protected String name;
	protected String phone;
	
	//A Customer has an Account (1 to 1 association)
	//A Customer class has an object of Account class 
	private Account aa;
	//aa has two role now
	//aa is the objct of Account class 
	//aa is the instance varible of Customer class
	
	public Customer() { }
	public Customer(String name, String phone, Account aa)
	{
		this.name = name;
		this.phone = phone; 
		this.aa = aa;
	}
	
	public void setAccount(Account aa)
	{
		this.aa = aa;
	}
	public Account getAccount()
	{
		return aa;
	}
	
	public void showCustomer()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		aa.showAccount();
	}
}