public class Start 
{
	public static void main(String[] args)
	{
		Student obj1 = new Student();
		obj1.setName("Rakib");
		obj1.setAge(18);
		obj1.setId(102);
		obj1.setCgpa(2.67);
		System.out.println("Name: "+obj1.getName());
		System.out.println("Age: "+obj1.getAge());
		System.out.println("ID: "+obj1.getId());
		System.out.println("CGPA: "+obj1.getCgpa());
		System.out.println();
		
		Student obj2 = new Student("Akib", 20, 101, 3.78);
		//obj2.showPersonInfo();
		obj2.showStudentInfo();
		
		//Same process to create two objects for Teacher class
	}
}