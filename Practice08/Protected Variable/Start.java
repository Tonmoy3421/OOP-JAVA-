public class Start 
{
	public static void main(String[] args)
	{
		Faculty obj1 = new Faculty("Rahim", 20000.00, "OOP1");
		Faculty obj2 = new Faculty("Karim", 25000.00, "OOP2");
		obj1.showFaculty();
		System.out.println();
		obj2.showFaculty();
		System.out.println();
		
		System.out.println("Annual Salary: "+obj1.annualSal());
		System.out.println("Annual Salary: "+obj2.annualSal());
	}
}