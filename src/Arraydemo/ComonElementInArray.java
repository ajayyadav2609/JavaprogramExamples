package Arraydemo;

public class ComonElementInArray {

public static void main(String[] args) {

		
		int[] a = { 2, 8, 18, 9, 4,6,15 };
		int[] b = {2,7,5,14,9,3,6}; 
		//int temp = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<b.length;j++)
			{					
					if(a[i]==b[j])
					{
						 System.out.println("common element:" +a[i]);
					}
					//System.out.println("Highest Number: " + temp);
				
		     
			}
		}
}
	}