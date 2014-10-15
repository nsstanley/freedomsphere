package com.freedomsphere.standards;

public class ArrayTest {
	public static void main(String args[]){
		String f = "Female";
		String m = "Male";
		
		int max1 = BodyFatStandards.getMaximumWeight(m, 17, 85);
		int max2 = BodyFatStandards.getMaximumWeight(f,17,85);
		
		int max3 = BodyFatStandards.getMaximumWeight(m,32,82);
		int max4 = BodyFatStandards.getMaximumWeight(f, 32, 82);
		int min1 = BodyFatStandards.getMinimumWeight(75);
		
		
		int max5 = BodyFatStandards.getMaximumBodyFat(m,26);
		
		System.out.println("Weights: "+ max1+ " " +max2+ " " +max3+ " " +min1+" " +max4+ " " +max5);
				
		
	}
}
