package Arraydemo;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {1,5,6,8,9};
		int[] arr2 = arr1.clone();
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		//second Method using for loop and copy
		
		int[] a={9,8,7,6,5,4};
		int[] b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Array of a: "+a[i]);
			b[i] = a[i];
			System.out.println("Array of b: " +b[i]);
		}
	
	

	}

}
