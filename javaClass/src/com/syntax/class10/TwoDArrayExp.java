package com.syntax.class10;

public abstract class TwoDArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[][] food= {{"borsh","vareniki","draniki"},{"kebabs","palaw","mantu"},
				{"tacos","burito","queso","salsa"},{"pasta","pizza","bread","risotto"}};
		
				
			System.out.println(food.length);
			int sizeof1Array=food[0].length;
			
			System.out.println(food.length);
			int sizeof2Array=food[1].length;
			
			System.out.println(food.length);
			int sizeof3Array=food[2].length;
			
			
			System.out.println(food[2][1]);
			System.out.println(food[3][2]);
			food[3][2]="cheese";	
			System.out.println(food[3][2]);	
		

	//how to get all values from 2d array 
			
		for(int i=0; i<food.length; i++) { //iterates over rows/arrays
		 for(int j=0; j<food[i].length;  j++) {//iterate over colomseach elements from an array
			
		System.out.println(food[i][j]);
	
	
	
			
			
		}}}}
		
	


