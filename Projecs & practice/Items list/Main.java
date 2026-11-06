public class Main{
	public static void main(String [] args){
	   
	    Item a1= new Item("pen", 10.50);
		Item a2= new Item("pencil", 15.40);
		Item a3= new Item("paper", 100);
		a1.setQuan(1);
		a2.setQuan(1);
		a3.setQuan(1);
		a1.display();
		a2.display();
		a3.display();
		System.out.println("Total-item:" +Item.showTotalItem());
		
	}
	
}
