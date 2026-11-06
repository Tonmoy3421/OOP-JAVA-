 public class Items{
	 private String item_Name;
	 private int price;
	 private int quantity;
	 
	 static int count;
	 
	 static{
		 System.out.println("system loaded");
		 count = 0;
	 }
	 
	 Items(){
		 
	 };
	 
	 Items(String item_Name, int price){
		 this.item_Name = item_Name;
		 this.price = price;
		 count++;
	  }
	  
	void setquantity (int quantity) {
		this.quantity= quantity;
	}
	
	int getquantity(){
		return quantity;
		
	}
	
	static int showtotal(){
		return count;
	}
	
	void display(){
		System.out.println("Item-Name:" +item_Name);
		System.out.println("Item-price:" +price);
		System.out.println("Quantity:" +getquantity());
		System.out.println("................");
 } }