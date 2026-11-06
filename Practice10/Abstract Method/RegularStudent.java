public class RegularStudent extends Student 
{
	public RegularStudent() 
	{
		System.out.println("Regular Student");
	}
	
	//overriding abstract method from Person class 
	public void show()
	{
		System.out.println("Show method overriding");
	}
}