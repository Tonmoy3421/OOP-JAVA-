import java.lang.*; //importing String class
public class StringExample
{
	public static void main(String[] args)
	{
		System.out.println("String Example Class");
		
		//there are 3 approaches for declaring String 
		//1st approach: creating an object
		String obj1 = new String("OOP1");
		System.out.println(obj1); //OOP1
		
		//2nd approach: implicit way
		String s1 = "Hello World";
		System.out.println(s1); //Hello World
		
		//3rd approach: using '+' sign
		int age = 20;
		String s2 = "I am "+age+" years old";
		System.out.println(s2); //I am 20 years old
		System.out.println(s2.length()); //17
		System.out.println(s2.charAt(4)); //
		System.out.println(s2.charAt(10)); //a
		System.out.println(s1.equals(s2)); //false
		String s3 = "AIUB";
		String s4 = "AIUB";
		System.out.println(s3.equals(s4)); //true
		System.out.println(s3.compareTo(s4)); //0
		String s5 = "aIUB";
		System.out.println(s4.compareTo(s5)); //A - a = -32
		//s2 = I am 20 years old
		System.out.println(s2.indexOf('I')); //0
		System.out.println(s2.indexOf('a')); //2
		System.out.println(s2.indexOf('Y')); //-1
		System.out.println(s2.indexOf("years")); //8
		System.out.println(s2.indexOf("Old")); //-1
		System.out.println(s2.substring(2, 11)); //am 20 yea
		System.out.println(s2.substring(6, 16)); //0 years ol
		String s6 = "OoP";
		System.out.println(s6.toUpperCase()); //OOP
		System.out.println(s6.toLowerCase()); //oop
		System.out.println(s6); //OoP
		String s7 = s6.toLowerCase(); 
		System.out.println(s7); //oop
		String s8 = "Hello";
		String s9 = "Hello";
		System.out.println(s8.equals(s9)); //true
		System.out.println(s8==s9); //true
		String obj2 = new String("Hello");
		String obj3 = new String("Hello");
		System.out.println(obj2.equals(obj3)); //true
		System.out.println(obj2==obj3); //false
		System.out.println(s8.equals(obj2)); //true 
		System.out.println(s8==obj2); //false
		System.out.println(s9.isEmpty()); //false 
		System.out.println(s8.concat(s9)); //HelloHello
		System.out.println();
		
		System.out.println("AIUB"+20); //AIUB20
		System.out.println("AIUB"+20+30); //AIUB2030
		System.out.println("AIUB"+(20+30)); //AIUB50
		System.out.println(20+"AIUB"); //20AIUB
		System.out.println(20+30+"AIUB"); //50AIUB
		System.out.println((20+30)+"AIUB"); //50AIUB
		System.out.println((50+40)+30+"AIUB"+(10+20)+30+40); //120AIUB303040
	}
}