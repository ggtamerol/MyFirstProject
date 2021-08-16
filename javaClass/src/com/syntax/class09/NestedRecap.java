package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	for(int i=1; i<=5; i++)	{
		
		System.out.println("Loop i");
		
	for(int j=1; j<4; j++)	{

		System.out.println("Loop j");
	
	}}	
	System.out.println("----------------------MULTIPLICATION TABLE--------------------");	
		
		
	for(int a=1; a<=10; a++)	{
		
		for(int b=1; b<=10; b++)	{
			
			System.out.println(a+"*"+b+"="+(a*b));
		
	 }}
	System.out.println("---------------------24 Clock--------------------");	
	
	
	
	for(int x=00; x<24; x++)	{
		
		for(int y=00; y<60; y++)	{
			
			if (x<10 && y<10) {
			System.out.println("0"+x +":0"+y);}
			
			else if(x>=10 && y<10 ){
				System.out.println(x +":"+"0"+y);}
			
			else if(x<10 && y>=10 ){
				System.out.println("0"+x +":"+y);}
			else
				System.out.println(x +":"+y);}
		
		
			
	System.out.println("-------------------what is output-------------------");	
		
		
		
		for(int j=0; j<3; j++)	{
			System.out.println("Inner loop "+j);}
            break;}
		    System.out.println("-------");}


}








