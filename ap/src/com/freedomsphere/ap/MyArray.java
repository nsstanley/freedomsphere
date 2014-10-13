package com.freedomsphere.ap;

public abstract class MyArray {
	
	/*
	 
		0		1		2		3		4		5		6		7		8
0		91		0		0		0		0		119		121		122		124
1		94		0		0		0		0		124		125		126		128
2		97		132		136	    139		141		128		129		131		133
3		100		136		140		144		146		132		134		135		137
4		104		141		144		148		150		136		138		140		142
5		107		145		149		153		155		141		143		144		146
6		110		150		154		158		160		145		147		149		151
7		114		155		159		163		165		150		152		154		156
8		117		160		163		168		170		155		156		158		161	
9		121		165		169		174		176		159		161		163		166
10		125		170		174		179		181		164		166		168		171
11		128		175		179		184		186		169		171		173		176
12		132		180		185		189		192		174		176		178		181
13		136		185		189		194		197		179		181		183		186
14		140		190		195		200		203		184		186		188		191
15		144		195		200		205		208		189		191		194		197
16		148		201		206		211		214		194		197		199		202
17		152		206		212		217		220		200		202		204		208
18		156		212		217		223		226		205		207		210		213
19		160		218		223		229		232		210		213		215		219
20		164		223		229		235		238		216		218		221		225
21		168		229		235		241		244		221		224		227		230
22		173		234		240		247		250		227		230		233		236


 */


	
	
	public static int getMinimumWeight(int height){
		
		int[] minimumWeights = {91,94,97,100,104,107,110,114,117,121,125,128,132,136,140,144,148,152,156,160,164,168,173};
		int heightIndex = getHeightIndex(height);
		return minimumWeights[heightIndex];
	}
	
	public static int getMaximumWeight(String sex, int age, int height){
		int[] weightArray = chooseArray(sex, age);
		int heightIndex = getHeightIndex(height);
		int maxWeight = weightArray[heightIndex];
		return maxWeight;
	}
	
	public static int[] chooseArray(String sex, int age){
		int[] male17_20 = {0,0,132,136,141,145,150,155,160,165,170,175,180,185,190,195,201,206,212,218,223,229,234};
		int[] male21_27 = {0,0,136,140,144,149,154,159,163,169,174,179,185,189,195,200,206,212,217,223,229,235,240};
		int[] male28_39 = {0,0,139,144,148,153,158,163,168,174,179,184,189,194,200,205,211,217,223,229,235,241,247};
		int[] male40_over = {0,0,141,146,150,155,160,165,170,176,181,186,192,197,203,208,214,220,226,232,238,244,250};
		int[] female17_20 = {119,124,128,132,136,141,145,150,155,159,164,169,174,179,184,189,194,200,205,210,216,221,227};
		int[] female21_27 = {121,125,129,134,138,143,147,152,156,161,166,171,176,181,186,191,197,202,207,213,218,224,230};
		int[] female28_39 = {122,126,131,135,140,144,149,154,158,163,168,173,178,183,188,194,199,204,210,215,221,227,233};
		int[] female40_over = {124,128,133,137,142,146,151,156,161,166,171,176,181,186,191,197,202,208,213,219,225,230,236};
		
		if(age >= 17 && age <= 20){
			if(sex == "Male"){
				return male17_20;
			}else{
				return female17_20;
			}
		}else if(age >= 21 && age <= 27){
			if(sex == "Male"){
				return male21_27;
			}else{
				return female21_27;
			}
		}else if(age >= 28 && age <= 39){
			if(sex == "Male"){
				return male28_39;
			}else{
				return female28_39;
			}
		}else if(age >= 40){
			if(sex == "Male"){
				return male40_over;
			}else{
				return female40_over;
			}
		}else{
			return male17_20;
		}
	
	}
	
	
	public static int getHeightIndex(int height){
		
		//returns height index
		
		int[] heights = {58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
		
		for(int i=0; i<heights.length; i++){
			if(heights[i] == height){
				return i;
			}
		}
		
		//if not within index guidelines returns the parameter height
		return height;	
	}//end getHeightIndex()
	
	public static int getMaximumBodyFat(String sex, int age){
		if(age >= 17 && age <= 20){
			if(sex == "Male"){
				return 20;
			}else{
				return 30;
			}
		}else if(age >= 21 && age <= 27){
			if(sex == "Male"){
				return 22;
			}else{
				return 32;
			}
		}else if(age >= 28 && age <= 39){
			if(sex == "Male"){
				return 24;
			}else{
				return 34;
			}
		}else if(age >= 40){
			if(sex == "Male"){
				return 26;
			}else{
				return 36;
			}
		}else{
			return 0;
		}
	}
	
}
