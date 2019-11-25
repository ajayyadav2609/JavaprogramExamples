package Arraydemo;

public class NnumberofHighestOrLowestInArray {

	public static void main(String[] args) {
		int temp=0;
		int[] a= new int[]{2,5,6,8,78,15,23};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Array list for i: " + a[i]);
			
			for(int j=i+1; j<a.length;j++)
			{
				System.out.println("List of array for j: " + a[j]);
				
				if(a[i]> a[j])			// 		if(a[i]< a[j]) will print lowest
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		
		System.out.println("Highest element in array is: " + a[a.length-3]); // can change according to highest or lowest 
		

	}

}
