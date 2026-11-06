import java.util.*; //package for Scanner Class
public class ScannerExample 
{
	public static void main(String[] args)
	{
		System.out.println("Scanner Class Example");
		
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = obj1.nextLine();
		System.out.print("Enter your address: ");
		String address = obj1.next();
		
		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = obj2.nextInt();
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
	}
}