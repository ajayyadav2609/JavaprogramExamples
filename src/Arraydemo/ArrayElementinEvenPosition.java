/*STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
STEP 3: PRINT "Elements of given array present on even position:"
STEP 4: REPEAT STEP 5 for(i=1; i< arr.length; i= i+2)
STEP 5: PRINT arr[i]
STEP 6: END*/


package Arraydemo;

public class ArrayElementinEvenPosition {

	public static void main(String[] args) {
		int[] arr1=new int[]{1,2,3,4,5};
		System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from [1] as first even positioned element is present at position 1.
		
		for(int i=1; i<arr1.length;i=i+2)
		{
			System.out.println(arr1[i]);
		}

		System.out.println("Elements of given array present on Odd position: ");
		//Loop through the array by incrementing value of i by 2  
        //Here, i will start from 0 as first odd positioned element is present at position 1.
		
		for(int i=0; i<arr1.length;i=i+2)
		{
			System.out.println(arr1[i]);
		}
	}

}
