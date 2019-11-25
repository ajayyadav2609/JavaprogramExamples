package Arraydemo;

import java.util.HashMap;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,1,2,4,5,4};
		//Creating a HashMap object with elements of a[] as keys and their count as values		
		HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
		
		for(int val: a) ////checking every element of the array a[]
		{
			if(elementCount.containsKey(val))
			{
				//If element is present in elementCount, incrementing it's count by 1
				elementCount.put(val, elementCount.get(val)+1);
			}
			else
			{
				 //If element is not present in elementCount, 
                //adding this element to elementCount with 1 as it's value
				elementCount.put(val, 1);
			}
			
		}
		System.out.println("Array Frequency: " + elementCount);
		

	}

}
