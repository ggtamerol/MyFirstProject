package com.syntax.class12;

public class groupTask7 {

	public static void main(String[] args) {
		
   //Maximum and minimum number in the array?		
		
	int [] array={10,5,3,-5,15};
	
	int largest=array[0];
	int smallest=array[0];
	for(int i=1; i <array.length ; i++)	{
	if(array[i]>largest) {
	largest=array[i];
		
	}
		
	if (array[i]<smallest);
	smallest=array[i];
}
	System.out.println(smallest);
	System.out.println(largest);
	
		
	}

}
