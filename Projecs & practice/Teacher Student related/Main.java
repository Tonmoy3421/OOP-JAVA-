public class Main
{
	public static void main(String[] args)
	{
		Student a1=new Student("Foysal", 458,20);
		Student a2=new Student("Fardin",854,14);
		
		 
        Student [] students=new Student[5];
		 
		 students[0]=a1;
		 students[1]=a2;
		 
		 Teacher t1=new Teacher("Mr x",5875,68, students);
		 t1.display();
		
		
	}
}