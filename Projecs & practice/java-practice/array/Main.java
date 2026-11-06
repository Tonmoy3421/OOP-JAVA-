public class Main {
    public static void main(String[] args) {

        // Creating array of Student objects
        Student[] students = new Student[3];

        // Initializing objects inside the array
        students[0] = new Student("Arif", 21);
        students[1] = new Student("Nadia", 22);
		 students[1] = new Student("Nadia", 25);
        students[2] = new Student("Rahim", 23);

        // Printing student information
        System.out.println("Students Information:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}