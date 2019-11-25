/*STEP 1: START
STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
STEP 3: PRINT "Duplicate elements in given array:"
STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
STEP 6: if(arr[i] == arr[j])
STEP 7: PRINT arr[j]
STEP 8: END*/

package Arraydemo;

public class PrintduplicateElement {

	public static void main(String[] args) {
		
		int[] arr1=new int[]{4,6,8,9,5,3,4,5};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println(arr1[j]);
				}
			}
		}

	}

}
