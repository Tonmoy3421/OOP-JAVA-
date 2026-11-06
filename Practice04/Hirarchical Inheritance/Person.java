public class Person 
{
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("DC called for Person");
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("PC called for Person");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void showPersonInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}