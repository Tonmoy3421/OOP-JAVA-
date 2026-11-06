   public class Person
   {
	   private String name;
	   private int age;
	   private static int count=10;
	   
	   public static void ShowCount ()
	   {
		   System.out.println ("Count:" +count);
	   }
	   
	   
	   Person()
	   {
		   System.out.println ("Default Constructor from Person ");
		   count++;
	   }
	   Person(String name, int age)
	   {
		   this.name = name;
		   this.age = age;
		   System.out.println ("Parameterized Constructor from person ");
		   count++;
	   }
	   public void setName(String name)
	   {
		   this.name= name;
	   }
	   public void setAge(int age)
	   {
		   this.age= age;
	   }
	   public String getName ()
	   {
		   return name;
	   }
	   public int getAge()
	   {
		   return age;
	   }
	   void displayInformation ()
	   {
		   System.out.println ("Name :" +name);
		   System.out.println ("Age :" +age);
	   }
		   
   }
    