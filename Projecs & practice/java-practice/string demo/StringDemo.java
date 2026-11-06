

public class StringDemo
{
	public static void main(String []args)
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s1.length()); // 4
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.charAt(2));// v
		
		
		if(s1 == s2)
		{
			System.out.println("Same"); // print same
		}
		else
		{
			System.out.println("Different");
		}
		
		if(s3 == s4)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");// different
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Same"); //same
		}
		else
		{
			System.out.println("Different");
		}
		if(s3.equals(s4))
		{
			System.out.println("Same"); // same
		}
		else
		{
			System.out.println("Different");
		}
		
		
		String s5 = new String(s1 + s3); 
		System.out.println(s5);  // JavaJava
		String s6 = s1 + s3;
		System.out.println(s6); // JavaJava
		
		System.out.println(s5.substring(2,5)); //vaJ
		
		s1 = "Hello";
		s1=s1.concat(s3);
		System.out.println(s1);  // HelloJava
		s2 = "Good ";
		s3= "Morning";
		s2.concat(s3);
		System.out.println(s2); // Good
		
		System.out.println(s2.concat(s3)); // Good Morning
		
		String s7 = "wOlvaRIne";  
		String s8 = s7.toUpperCase();
		System.out.println(s7); //wOlvaRIne
		System.out.println(s8);  //WOLVARINE
		
		String str10 = "Apple";
        String str11 = "Banana";

        
        int result = str10.compareTo(str11);
        System.out.println("compareTo result: " + result); //-1
        
        int index = str11.indexOf('n'); 
        System.out.println("indexOf 'n' in Banana: " + index); //2

        int indexStr = str11.indexOf("ana"); 
        System.out.println("indexOf 'ana' in Banana: " + indexStr);
        

        
        String sub = str11.substring(1, 4);
        System.out.println("substring(1,4) of Banana: " + sub); //ana
        
	}
}