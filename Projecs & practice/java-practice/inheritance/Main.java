public class Main 
{
	public static void main (String [] args)
	{
	    Person p1 = new Person ("John" , 22);
		p1.displayInformation();
	    Person.ShowCount();
		
		
		Student s1 = new Student("Alex" , 22, 3.8);
		s1.displayInformation();
		Student.ShowCount();
		ScholarshipStudent sc1 = new ScholarshipStudent("X", 22, 3.9, 10500);
		sc1.displayInformation();
		ScholarshipStudent.ShowCount();
		
		
         
		 
	}
}
		
		
		