package com.syntax.class11;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int[][] twoDArray={{10,20},{1,2,3},{100,200,300,400}};
		
	  int howManyArrays=twoDArray.length;	
	  
	  System.out.println(howManyArrays);
	  
	  System.out.println(twoDArray[2].length);
	  
		
		for(int [] arr:twoDArray) {
			
		for(int num:arr) {
			
			System.out.print(num+" ");	
			System.out.println();
			
		}
		
		
		System.out.println("--------------------------");
		
		
		
		
		
		
			
		}
	}

}
