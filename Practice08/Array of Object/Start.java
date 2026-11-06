public class Start 
{
	public static void main(String[] args)
	{
		Box obj1 = new Box(1.1,2.2,3.3);
		Box obj2 = new Box(3.3,4.4,5.5);
		obj1.show();
		obj2.show();
		System.out.println(obj1.volume());
		System.out.println(obj2.volume());
		System.out.println();
		
		//Array of Object 
		Box arr1[] = new Box[5];
		System.out.println(arr1[0]); //null
		arr1[0] = obj1;
		arr1[1] = obj2;
		System.out.println(arr1[0]); //memory address showing
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println("Index: "+i);
			if(arr1[i] != null)
			{
				arr1[i].show();
				System.out.println();
			}
			else 
			{
				System.out.println("Nothing to show");
				System.out.println();
			}
		}
	}
}