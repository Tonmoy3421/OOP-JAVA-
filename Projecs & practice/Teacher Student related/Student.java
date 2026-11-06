public class Student extends Person
{
	Student (String name,int id, int age)
	{
		super(name,id,age);
	}
	public void display()
	{
		System.out.println("Student Name:"+getName());
		System.out.println("Student id:"+getId());
		System.out.println("Student age:"+getAge());
	}
}