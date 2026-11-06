public class VariableTypes
{
	private int x; //instance variable 
	public static int y; //class or static variable
	
	static 
	{
		//used to initialize static variable
		y = 10;
		System.out.println("Static block 1 called");
	}
	
	public VariableTypes()
	{
		System.out.println("DC called");
	}
	
	static 
	{
		//used to initialize static variable
		y = y*2; //y*2 = 10*2 = 20
		System.out.println("Static block 2 called");
	}
	
	public VariableTypes(int xx) //xx is a local variable
	{
		x = xx;
		System.out.println("PC called");
	}
	
	static 
	{
		//used to initialize static variable
		y = y*2; //y*2 = 20*2 = 40
		System.out.println("Static block 3 called");
	}
	
	public void setX(int xxx) //xxx is a local variable
	{
		x = xxx;
	}
	
	public int getX()
	{
		return x;
	}
	
	static 
	{
		//used to initialize static variable
		y = y*2; //y*2 = 40*2 = 80
		System.out.println("Static block 4 called");
	}
}