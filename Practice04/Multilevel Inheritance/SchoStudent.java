public class SchoStudent extends Student
{
	private double schopercent;
	
	public SchoStudent()
	{
		System.out.println("DC called for SchoStudent");
	}
	public SchoStudent(String name, int age, int id, double cgpa, double schopercent)
	{
		super(name, age, id, cgpa);
		this.schopercent = schopercent;
		System.out.println("PC called for SchoStudent");
	}
	
	public void setSchoPercent(double schopercent)
	{
		this.schopercent = schopercent;
	}
	
	public double getSchoPercent()
	{
		return schopercent;
	}
	
	public void showSchoStudentInfo()
	{
		super.showStudentInfo();
		System.out.println("Percent: "+schopercent);
	}
}