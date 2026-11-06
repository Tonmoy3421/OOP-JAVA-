public class ArrayExample 
{
	public static void main(String[] args)
	{
		System.out.println("Array Class");
		
		//4 approaches for declaring Array 
		//1st approach: size known, elements unknown 
		int arr1[] = new int[7];
		int []arr2 = new int[3];
		System.out.println("arr1[0]: "+arr1[0]); //0
		System.out.println("arr2[2]: "+arr2[2]); //0
		arr1[0] = 5;
		arr2[2] = 10;
		System.out.println("arr1[0]: "+arr1[0]); //5
		System.out.println("arr2[2]: "+arr2[2]); //10
		
		//2nd approach: size unknown, elements unknown
		int arr3[];
		int size1 = 10/2; //5
		arr3 = new int[size1];
		
		int []arr4;
		int size2 = 12/3; //4
		arr4 = new int[size2];
		System.out.println("arr3[1]: "+arr3[1]); //0
		arr3[1] = 12;
		System.out.println("arr3[1]: "+arr3[1]); //12
		
		//3rd approach: size unknown, elements known 
		int arr5[] = new int[] {2,4,6,8,10,12};
		int []arr6 = new int[] {1,3,5,7};
		System.out.println("arr5[2]: "+arr5[2]); //6
		arr5[2] = arr3[1] - 2; //12-2 = 10
		System.out.println("arr5[2]: "+arr5[2]); //10
		
		int size3 = arr5.length;
		System.out.println("Size of arr5: "+size3); //6
		int size4 = arr6.length;
		System.out.println("Size of arr6: "+size4); //4
		
		//printing array
		int arr7[] = new int[] {1,2,3,4,5,6,7};
		for(int i = 0; i<arr7.length; i++)
		{
			System.out.print(arr7[i]+" ");
		}
	}
}