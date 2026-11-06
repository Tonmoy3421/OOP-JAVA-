public class library{
	
	private String title;
	private String author;
	private int price;
	private int quantity;
	static int totalBooks;
	static int count;
	 
	library(){ 

		count++;
	};
	
	static {
		count=0;
	}
	void settitle(String title){
		this.title = title;
		}
    void setauthor(String author){
		this.author = author;
		}
    
	void setprice(int price){
		this.price = price;
		}
 
   void setquantity(int quantity){
		this.quantity = quantity;
		
	}
		
  String gettitle(){
  return title;}
  
  String getauthor(){
      return author;
  }
  
  int getprice(){  
        return price;
     }
	 
	int getquantity(){ 
	    return quantity;
	} 
	
	
    	static  int totalBooks(){ 
		  
		  return count;
		  
		}
		
   void showBookInfo(){
	   System.out.println("Title:" +gettitle());
	   System.out.println("Author:" +getauthor());
	   System.out.println("price:" +getprice());
	   System.out.println("quantity:" +getquantity());
	   System.out.println("............");
   }
}