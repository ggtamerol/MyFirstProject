package com.syntax.reviewclass4;

public class NestedArray {

	public static void main(String[] args) {
	
	// 1 //****
		 //****
		 //****
		 //****
		
		
	for (int j=0; j<4; j++)	{
	for(int i=0; i<4; i++)	{
		System.out.print("*");}
	  System.out.println(" ");}
	

	{ System.out.println("-------------------------------- ");}


//2 //*****
    //**
    //**
    //*****


for(int j=0; j<4; j++) {//4 line istiyorum
for(int i=0; i<5; i++) {//0,1,2,3,4 * olacak
	  if(j==1 || j==2) {//1. ve 2. line (line 0 dan baslar) buyuk olsun 1 den yani (0,1,2) buda 3 yildiz demek
		 if(i>1) {
			continue;
			
		 }
	  }
	System.out.print("*");}
  System.out.println( );}
	
{ System.out.println("-------------------------------- ");}





	
	
}}
