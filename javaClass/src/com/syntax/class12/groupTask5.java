package com.syntax.class12;

public class groupTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//Write e a java program to check whether a given number is prime or not?
//Prime number is a number that is divisiable by only itself and negative numbers(2,3,5,7,11)
		
int number=15;
boolean isPrime=true;

if (number>1) {
for(int i=2; i<number ; i++  ) {	
if(number%i==0)	{
	isPrime=false;
	break;
	
}}
	
}else {
	isPrime=false;}
	
	
	System.out.println(number+" is prime "+isPrime);
	
	
	
}}
