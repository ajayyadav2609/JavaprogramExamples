package Arraydemo;

public class Bubblesortexample 
{
	public static void Bubblesort(int[]arr)
	{
	
	
int n=arr.length;
int temp=0;

for(int i=0;i<n;i++)
{
	for(int j=1;j<n-i;j++)
	{
		if(arr[j-1] > arr[j])
		{
			temp=arr[j-1];
			arr[j-1] = arr[j];
			arr[j]=temp;
		}
	}
}
}
public static void main(String[] args) 
{		
	int[] arr = new int[] {3,60,35,2,45,320,5};
	
	System.out.println("Array before bubble sort");
	for(int i =0;i<arr.length;i++)			
	{
		System.out.println(arr[i]);
	}
	
	Bubblesort(arr);
	
	System.out.println("After bubble sort");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	
}
}