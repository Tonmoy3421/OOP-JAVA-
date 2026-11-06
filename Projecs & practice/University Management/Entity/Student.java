package Entity;
import java.lang.*;
import javax.swing.*; //package for GUI components 
import java.io.*; //for File class
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Student 
{
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	
	private File file;
	private FileWriter fwriter; //for insert or write in the file
	
	public Student() { }
	public Student(String s1, String s2, String s3, String s4, String s5, String s6)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
	}
	public void insertInfo()
	{
		try 
		{
			file = new File("./Data/userdata.txt");
			if (!file.exists()) {
                file.getParentFile().mkdirs(); 
                file.createNewFile(); 
            }
			
			
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
			String timeAndDate = myDateObj.format(myFormatObj);
			
			fwriter = new FileWriter(file, true); //ensure to not overwrite the existing text in the file
			fwriter.write("Date and Time: " +timeAndDate+"\n");
			fwriter.write("========================================================"+"\n");
			fwriter.write("Name: "+s1+"\n");
			fwriter.write("CGPA: "+s2+"\n");
			fwriter.write("Gender: "+s3+"\n");
			fwriter.write("Courses: "+s4+"\n");
			fwriter.write("Today's Topic: "+s5+"\n");
			fwriter.write("OOP Principles: "+s6+"\n");
			fwriter.write("--------------------------------------------------------"+"\n");
			fwriter.flush(); //ensure all the data are written in the file
			fwriter.close(); //close the file
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error writing to file!");
		}
	}
}