public class Teacher extends Person 
{
	private int id;
	private double sal;
	
	public Teacher()
	{
		System.out.println("DC called for Teacher");
	}
	public Teacher(String n, int a, int id, double sal)
	{
		super(n, a);
		this.id = id;
		this.sal = sal;
		System.out.println("PC called for Teacher");
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setSal(double sal)
	{
		this.sal = sal;
	}
	
	public int getId()
	{
		return id;
	}
	public double getSal()
	{
		return sal;
	}
	
	public void showTeacherInfo()
	{
		super.showPersonInfo();
		System.out.println("ID: "+id);
		System.out.println("Salary: "+sal);
	}
}