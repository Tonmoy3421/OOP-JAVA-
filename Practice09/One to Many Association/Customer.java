public class Customer 
{
	protected String name;
	protected String phone;
	
	//A Customer has many Accounts (1 to many association)
	//A Customer class has many object of Account class 
	//private Account arr1[] = new Account[5]; //if size is mentioned in the question
	private Account arr1[]; 
	//arr1 has two role now
	//arr1 is the array for the Account class 
	//arr1 is the instance varible of Customer class
	public Customer() { }
	public Customer(String name, String phone, int size)
	{
		this.name = name;
		this.phone = phone;
		arr1 = new Account[size]; //Array 2nd approach
	}
	//For one to many association, we need to implement 3 new methods 
	//1. Insert in an array 
	public void insertAccount(Account acc)
	{
		for(int i = 0; i<arr1.length; i++)
		{
			if(arr1[i] == null) 
			{
				System.out.println("Index: "+i);
				arr1[i] = acc;
				System.out.println("Account inserted");
				break;
			}
		}
	}
	
	//2. Delete from the array 
	public void deleteAccount(Account acc)
	{
		for(int i = 0; i<arr1.length; i++)
		{
			if(arr1[i] == acc) 
			{
				System.out.println("Index: "+i);
				arr1[i] = null;
				System.out.println("Account deleted");
				break;
			}
		}
	}
	
	//3. Show the latest array
	public void showAllAccounts()
	{
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("Index: "+i);
			if(arr1[i] != null)
			{
				arr1[i].showAccount();
				System.out.println();
			}
			else 
			{
				System.out.println("Nothing to show");
				System.out.println();
			}
		}
	}
	
}