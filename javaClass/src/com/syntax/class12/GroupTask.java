package com.syntax.class12;

public class GroupTask {

	public static void main(String[] args) {
		
	//Create a 2D array of integer values. Print the sum of all numbers.	
		
	
		int[][] array= {{1,2,3,4,5},{10,20,30,40,50}};
		
		
	    System.out.println("number of rows in abpve 2d array: "+array.length);
	    int sum=0;
	    
	    
	    for(int row=0; row<array.length; row++ ) {
	    	
	    System.out.println("number of coloms in above 2d array: "+array[row].length);
			
		for(int col=0; col<array[row].length; col++ ) {
			
		System.out.println(array[row][col]);
	    sum=sum+array[row][col];
	      
	      }}
	
	    System.out.println("Sum "+sum);}}
		

