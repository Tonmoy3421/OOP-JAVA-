public class Start 
{
	public static void main(String[] args)
	{
		SchoStudent obj1 = new SchoStudent();
		obj1.setName("Rakib");
		obj1.setAge(22);
		obj1.setId(202);
		obj1.setCgpa(3.56);
		obj1.setSchoPercent(0.15);
		System.out.println("Name: "+obj1.getName());
		System.out.println("Age: "+obj1.getAge());
		System.out.println("ID: "+obj1.getId());
		System.out.println("CGPA: "+obj1.getCgpa());
		System.out.println("Percentage: "+obj1.getSchoPercent());
		System.out.println();
		
		SchoStudent obj2 = new SchoStudent("Akib", 20, 101, 3.87, 0.3);
		obj2.showSchoStudentInfo();
	}
}