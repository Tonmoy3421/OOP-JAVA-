public class Example implements IMyInterface
{
	public Example()
	{
		System.out.println("Example");
	}
	
	//override the abstract methods of interface 
	public void show2()
	{
		System.out.println("Show 2 override");
	}
	public void show1()
	{
		System.out.println("Show 1 override");
	}
}