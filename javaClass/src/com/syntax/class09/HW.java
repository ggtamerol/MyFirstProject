package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
	
//Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
//Create an array to store double values and then print those in reverse order
//Create an array on integers and calculate the sum of all elements in an array.
//HW:  From an array of integer elements find the largest number.

System.out.println("-----Home Work 1------------");
			
String [] animals= { "dog", "cat" ,"bird", "fish","tiger","fox"};
for(int i=0; i<animals.length;i++) {
System.out.println(animals[i])	; }

{System.out.println("--------defferent loop-------")	; 

for (String animal:animals) {
System.out.println(animal);}
	
{System.out.println("-----------Home Work 2-----------");}
	double[] array= {9.99,10.99,20.99,50.88};
for (int i=array.length-1; i>=0; i--)
{System.out.println(array[i]);}

{System.out.println("-----------Home Work 3-----------");}

int[] num= {3,5,9,6,8,2,4,5,7,8,10,20,25};

int sum=0;

for(int i=0; i<num.length ;  i++)
	sum=sum+num[i];
{System.out.println(sum);

{System.out.println("-----------Home Work 4-----------");}

int[] num1= {5,6,541,548,888};

int largest=num1[0];

for ( int i=1; i<num1.length; i++) {
	
	if(num1[i]>largest) {
		
		largest=num1[i];}}
	
System.out.println(largest);
}}}}
	
	

