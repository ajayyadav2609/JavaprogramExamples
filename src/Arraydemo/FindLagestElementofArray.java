/*STEP 1: START
STEP 2: INITIALIZE arr[] = {25, 11, 7, 75, 56}
STEP 3: max = arr[0]
STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
STEP 5: if(arr[i]>max) max=arr[i]
STEP 6: PRINT "Largest element in given array:"
STEP 7: PRINT max
STEP 8: END*/

package Arraydemo;

public class FindLagestElementofArray {

	public static void main(String[] args) {
		
		int[] a = new int[] { 2, 6, 18, 9, 4 };
		int temp = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array of i:" + a[i]);
		
				/*for(int j=i+1;j<a.length;j++)
					
				{
					System.out.println("Array of J: " + a[j]);*/
					
					if(a[i]> temp) // for minimum use a[i]< temp
					{
						temp=a[i];
					}
					//System.out.println("Highest Number: " + temp);
				}
		      System.out.println("Highest Number: " + temp);
		
}
		
	
    

	

}
