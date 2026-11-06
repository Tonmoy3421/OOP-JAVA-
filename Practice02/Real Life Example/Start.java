public class Start 
{
	public static void main(String[] args)
	{
		Employee obj1 = new Employee();
		obj1.setName("Akib");
		obj1.setId(202);
		obj1.setSal(15000.00);
		System.out.println("Name: "+obj1.getName());
		System.out.println("ID: "+obj1.getId());
		System.out.println("Salary: "+obj1.getSal());
		
		Employee obj2 = new Employee("Rakib",101,25000.00);
		obj2.show();
		System.out.println("Annual Salary: "+obj2.annualSal());
	}
}