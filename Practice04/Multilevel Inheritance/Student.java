public class Student extends Person
{
	private int id;
	private double cgpa;
	
	public Student()
	{
		System.out.println("DC called for Student");
	}
	public Student(String nname, int aage, int id, double cgpa)
	{
		super(nname, aage);
		this.id = id;
		this.cgpa = cgpa;
		System.out.println("PC called for Student");
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	
	public int getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	
	public void showStudentInfo()
	{
		super.showPersonInfo();
		System.out.println("ID: "+id);
		System.out.println("CGPA: "+cgpa);
	}
}