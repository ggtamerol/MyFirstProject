package com.syntax.class13;

public class PrimeOrNot {

static //Write a method to return whether given number is prime or not?
	
String prime (int num) {
String result=null ;

for (int i=2; i<=num; i++ ) {
	
if(num%i==0) {
result ="not prime";break;}

else result="prime";}

return result;}



public static void main (String[] args)  {


System.out.println(PrimeOrNot.prime(23));	
	
	
	
}}
	
	