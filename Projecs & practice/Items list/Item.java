public class Item{
	private String  item_Name;
	private double price;
	private int quantity;
    static int total_Item;
	static int count;
	
	static{
		System.out.println("Car system LOADED");
		count=0;
		}
	Item(){
		
	};
		
	
    Item(String item_Name, double price){
		this.item_Name=item_Name;
		this.price= price;
		count++;
	}
	
	void setQuan(int quantity){
		this.quantity=quantity;
	}
	int getQuan(){
		return quantity;
	}
	void display(){
		System.out.println("Item-name:" +item_Name);
		System.out.println("price:" +price);
		System.out.println("Quantity" +getQuan());
		System.out.println("...........");
	}
	static int showTotalItem(){
		return count;
		}
}