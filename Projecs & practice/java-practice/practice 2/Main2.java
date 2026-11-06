public class Main2{
	public static void main(String[]args){ 
	   library a1= new library();
	   library a2= new library();
	   library a3= new library();
	   library a4= new library();
	   
	   a1.settitle("bangla");
	   a1.setauthor("kali dash");
	   a1.setprice(200);
	   a1.setquantity(2);
	   
	   
	   a2.settitle("english");
	   a2.setauthor("kali pro");
	   a2.setprice(300);
	   a2.setquantity(3);
	   
	   a3.settitle("math");
	   a3.setauthor("kali dash");
	   a3.setprice(400);
	   a3.setquantity(4);
	   
	   a4.settitle("science");
	   a4.setauthor("kali dash");
	   a4.setprice(500);
	   a4.setquantity(5);
	   
	   a1.showBookInfo();
	   a2.showBookInfo();
	   a3.showBookInfo();
	   a4.showBookInfo();
	   
	   System.out.println("total book:" +library.totalBooks());
	   
	   
	}
}