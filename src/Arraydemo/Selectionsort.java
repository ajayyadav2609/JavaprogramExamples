package Arraydemo;

public class Selectionsort {

	public static void main(String[] args) {
		int [] arr = new int[]{20,62,5,23,65,4,9}; 
		
		for(int i=0;i<arr.length;i++)
		{			
			int smallindex=i;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[j]>arr[smallindex])
				{
					smallindex=j;
				}
			}
			
			int temp=0;
			temp=arr[i];
			arr[i]=arr[smallindex];
			arr[smallindex]=temp;
			
		}
		System.out.println("After selection sort ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
