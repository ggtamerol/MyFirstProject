package com.syntax.class12;

public class groupTask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a java program to find the second largest number in the array?
		
	
		int [] array={10,9,20,0,12,15};
		
		int largest=array[0];
		int secondlargest=array[0];
		for(int i=1; i <array.length ; i++)	{
		if(array[i]>largest) {
			secondlargest=largest;
		 largest=array[i];
		}else if(array[i]>secondlargest) {
			secondlargest=array[i];}
		 
	
		}
		System.out.println(largest);
		System.out.println(secondlargest);
	
	}

}
