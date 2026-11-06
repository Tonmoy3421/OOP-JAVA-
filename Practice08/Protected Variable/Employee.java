public class Employee
{
	protected String name;
	protected double sal;
	
	public Employee() { }
	public Employee(String name, double sal)
	{
		this.name = name;
		this.sal = sal;
	}
	
	public void showEmployee()
	{
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
	}
}