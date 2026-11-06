import java.lang.*; //for String, System, Wrapper class
public class Employee 
{
	private String name;
	private int id;
	private double sal;
	
	public Employee()
	{
		System.out.println("DC called");
	}
	public Employee(String name, int id, double sal)
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
		System.out.println("PC called");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setSal(double sal)
	{
		this.sal = sal;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getSal()
	{
		return sal;
	}
	
	public void show()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+sal);
	}
	
	public double annualSal()
	{
		return sal*12;
	}
}