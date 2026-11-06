public class Main{
	public static void main(String[]args){ 
	
	    Items L1 = new Items("pen",20);
		Items L2 = new Items("pencil",15);
		Items L3 = new Items("scale",10);
		Items L4 = new Items("rubber",5);
		
	    L1.setquantity(3);
		L2.setquantity(5);
		L3.setquantity(10);
		L4.setquantity(2);
       
	   	L1.display();	
		L2.display();
		L3.display();
		L4.display();
		
	System.out.println("total-items:" +Items.showtotal());
	
	System.out.println("max-value:" +Integer.MAX_VALUE);
	
	}
}