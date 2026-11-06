public class ClassExample 
{
	private int x; //instance variable
	private double y; //instance variable
	
	public ClassExample() //default constructor
	{
		System.out.println("DC called");
	}
	
	public ClassExample(int x, double y) //para constructor
	{
		this.x = x;
		this.y = y;
		System.out.println("PC called");
	}
	
	//setter method
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	
	//getter method 
	public int getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	
	//show method
	public void show()
	{
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
	}
	
	public double sum()
	{
		double temp;
		temp = x; //implicit type casting
		double result;
		result = temp + y; 
		return result;
	}
}