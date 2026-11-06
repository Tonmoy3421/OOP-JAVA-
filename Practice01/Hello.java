public class Hello 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		System.out.println("OOP1[A]");
		System.out.println("Spring 2025-26");
		
		int x = 10;
		System.out.println(x);
		System.out.println("Value of x: "+x);
		//cout<<"Value of x: "<<s1<<endl;
		
		byte b1 = 127;
		System.out.println("Value of b1: "+b1);
		
		String s1 = "23";
		int i1;
		i1 = Integer.parseInt(s1);
		System.out.println("Value of s1: "+s1);
		System.out.println("Value of i1: "+i1);
		System.out.println();
		
		byte b2 = 100; //byte = 8 bits 
		int i2; //int = 32 bits 
		i2 = b2; //implicit type casting
		System.out.println("Value of b2: "+b2);
		System.out.println("Value of i2: "+i2);
		System.out.println();
		
		int i3 = 130; //int = 32 bits 
		byte b3; //byte = 8 bits 
		b3 = (byte)i3; //explicit type casting
		System.out.println("Value of i3: "+i3);
		System.out.println("Value of b3: "+b3);
	}
}