package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
	

		
String[] country= {"USA", "Italy", "Mexico", "France", "Spain"};
		
		for(int i=0; i<country.length; i++) {
			
			if(i==0) {
				System.out.println("capital of "+country[i]+" is "+"Washington D.C");
			} else if (i==1) {
				System.out.println("capital of "+country[i]+" is "+"Rome");
			}else if (i==2) {
				System.out.println("capital of "+country[i]+" is "+"Mexico City");
			}else if (i==3) {
				System.out.println("capital of "+country[i]+" is "+"Paris");
			}else if (i==4) {
				System.out.println("capital of "+country[i]+" is "+"Madrid");
			}else {
				System.out.println("Unknown");
			}
		}
		
		
	}

}
