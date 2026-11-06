public class Teacher extends Person
{
	private Student [] students;
	public Teacher(String name, int id, int age,Student[] students)
	{
		super(name,id,age);
		this.students=students;
	
	}
	public void setStudent(Student [] students)
	{
		this.students=students;
	}
	public Student[] getStudent()
	{
		return students;
	}
	
	public void addStudent(Student stu)
	{   boolean flag=false;
	    for(int i=0;i<students.length;i++)
		{
		if(students[i]==null)
		{
			students[i]=stu;
			flag=true;
			System.out.println("Add a new Student info!");
			break;
	    }
		if(flag!=true)
		{
			System.out.println("There is no space to add new student");
		}
		}
	}	
	public void display()
	{
	   System.out.println("Teacher Name:"+getName());
	   System.out.println("Teacher id:"+getId());
	   System.out.println("Teacher age:"+getAge());
	   
	   for(int i=0;i<students.length;i++)
	   {  Student st= students[i];
           if(st !=null)
		   { System.out.println("Student" +(1+i)+"  info:");
	       students[i].display();
		   }
	   }
	}
	
	public void removeStudent(Student studen)
	{
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==studen)
			{
			students[i]=null;
			System.out.println("Removed an student account");
			}
		}
		System.out.println("Sorry dont match with any studet account");
	}
	
	
	
}