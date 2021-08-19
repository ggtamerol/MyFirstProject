package com.syntax.class13;

public class MethodsHW {
	
//Create a method that will take 2 parameters as a numbers and prints which number is larger
			
void  bigger(int number1,int number2) {
	
if (number1>number2) {
	
	System.out.println(number1+ " is largest number");}

	else {
		System.out.println(number2+ " is largest number");}}

//Create a method that will take a number and prints whether the number is even or odd.

void EvenOrOdd(int number) {
	
if(number%2==0) {
 System.out.println(number +" is an even number.")	;}
else {
	 System.out.println(number +" is an odd number.");}}
	
//Create a method that will say Hello in different language based on the country that will passed when method is executed.

 String Hello (String country) {
	
if( country=="Turkey") {
	return "Merhaba";}
else if	(country=="USA") {
	return "Hello";}
else if	(country=="Mexico") {
	return "Hola";}
else {
	return "Invalid";
	

}}}








