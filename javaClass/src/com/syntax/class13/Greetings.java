package com.syntax.class13;

public class Greetings {
	
	void sayHello() {
	System.out.println("Hello Batcch 10");
	System.out.println("Hello Batcch 10");
	System.out.println("Hello Batcch 10");}


void printNumber(int number) {
System.out.println(number);}


 void sayHelloManyTimes(int number) {
 for(int i=0; i<number; i++) {
 System.out.println("Hello Batch 10 ");}}

	
	
public static void main(String[] args) {
	
	System.out.println("Line in the main method");
    Greetings greeting =new Greetings();
    greeting.sayHello();
    System.out.println("Line after the method call");
	greeting.printNumber(10);
	greeting.printNumber(100);
	greeting.printNumber(125);
	
}}