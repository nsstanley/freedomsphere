package com.freedomsphere.ap;

public class ArrayTest {
	public static void main(String args[]){
		String f = "Female";
		String m = "Male";
		
		int max1 = MyArray.getMaximumWeight(m, 17, 75);
		int max2 = MyArray.getMaximumWeight(f,17,59);
		
		int max3 = MyArray.getMaximumWeight(m,32,75);
		int min1 = MyArray.getMinimumWeight(75);
		
		int max4 = MyArray.getMaximumBodyFat(f,33);
		int max5 = MyArray.getMaximumBodyFat(m,26);
		
		System.out.println("Weights: "+ max1+ " " +max2+ " " +max3+ " " +min1+" " +max4+ " " +max5);
				
		
	}
}
