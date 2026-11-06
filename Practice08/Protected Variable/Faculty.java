public class Faculty extends Employee 
{
	protected String courses;
	
	public Faculty() { }
	public Faculty(String name, double sal, String courses)
	{
		super(name, sal);
		this.courses = courses;
	}
	
	public void showFaculty()
	{
		super.showEmployee();
		System.out.println("Courses: "+courses);
	}
	
	public double annualSal()
	{
		return sal*12;
	}
}