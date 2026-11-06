public class Start 
{
	public static void main(String[] abc)
	{
		System.out.println("Class Example");
		
		ClassExample obj1 = new ClassExample(); //creating an object with default constructor
		System.out.println("Value of x: "+obj1.getX());
		System.out.println("Value of y: "+obj1.getY());
		System.out.println();
		
		ClassExample obj2 = new ClassExample(15, 25.25); //creating an object with para constructor
		System.out.println("Value of x: "+obj2.getX());
		System.out.println("Value of y: "+obj2.getY());
		obj2.setX(35);//obj2.x = 35;
		System.out.println("Value of x: "+obj2.getX());
		System.out.println();
		
		obj2.show();
		System.out.println("Sum: "+obj2.sum());
	}
}