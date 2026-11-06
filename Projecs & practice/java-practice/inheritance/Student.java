class Student extends Person
{
	private double cgpa;
	public Student ()
	{
		System.out.println ("Default cons from student (level-1)" );
	}
	
	public Student (String name, int age, double cgpa)
	{
		super (name, age );
		this.cgpa = cgpa;
		System.out.println ("Parameterized cons from student (level-1) ");
	}
	
	public void setCGPA(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public double getCGPA ()
	{
		return cgpa;
	}
	public void displayInformation()
	{
		super.displayInformation();
		System.out.println("CGPA: " +cgpa);
	}
		
}