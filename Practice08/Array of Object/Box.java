public class Box 
{
	private double length;
	private double height;
	private double width;
	
	public Box() { }
	public Box(double length, double height, double width)
	{
		this.length = length;
		this.height = height;
		this.width = width;
		System.out.println("PC called");
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getLength() { return length; }
	public double getHeight() { return height; }
	public double getWidth() { return width; }
	
	public void show()
	{
		System.out.println("Length: "+length);
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
	}
	
	public double volume()
	{
		return (length*height*width);
	}
}