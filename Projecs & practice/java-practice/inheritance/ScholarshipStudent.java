public class ScholarshipStudent extends Student
{
	private double amount;
	
	public ScholarshipStudent()
	{
		System.out.println("Default cons from Scholarship Student(level 2)");
	}
	public ScholarshipStudent(String name, int age, double cgpa, double amount)
	{
		super(name, age, cgpa);
		this.amount= amount;
		System.out.println("Default cons from Scholarship Student(level 2)");
	}
	
	public void setAmount(double amount)
	{
		this.amount= amount;
	}
	public double getAmount ()
	{
		return amount;
	}
	public void displayInformation ()
	{
		super.displayInformation();
		System.out.println(" Amount: " +amount);
	}
	}
	
	