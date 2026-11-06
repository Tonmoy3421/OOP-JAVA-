public class Start 
{
	static 
	{
		System.out.println("Static block of Start class");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Variable Types Class");
		
		VariableTypes obj1 = new VariableTypes();
		System.out.println("x: "+obj1.getX()); //0
		System.out.println("y: "+obj1.y); //80
		obj1.setX(12);
		System.out.println("x: "+obj1.getX()); //12
		obj1.y = 25;
		System.out.println("y: "+obj1.y); //25
		System.out.println();
		
		VariableTypes obj2 = new VariableTypes(15);
		System.out.println("x: "+obj2.getX()); //15
		System.out.println("y: "+obj2.y); //25
		VariableTypes.y = 35;
		System.out.println("y: "+VariableTypes.y); //35
		System.out.println("y: "+obj1.y); //35
	}
}