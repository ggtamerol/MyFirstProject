package com.syntax.class13;

import java.util.Scanner;

public class Student {
	
	String name;
	String id;
	int age;
	char gender;
	int tutition;
	String school;
	
	void study() {
	System.out.println(name +"studies in "+school);}
	
	void payTuition() {
	System.out.println(name +" pay "+ tutition);}
		
	
	public static void main(String[] args) {
	
	Student Micheal=new Student();
	Micheal.name="Michael";
	Micheal.id="123";
	Micheal.gender='M';
	Micheal.school="Syntax";
	Micheal.tutition=1000;
	Micheal.study();
	Micheal.payTuition();
	
	
	Student Anne=new Student();
	Anne.name="Anne Mary";
	Anne.id="455";
	Anne.gender='F';
	Anne.school="Syntax";
	Anne.tutition=750;
	Anne.study();
	Anne.payTuition();
	
	
	Scanner scan=new Scanner(System.in);
			
      scan.next();
      
      
      
      
      
	
	}}
	
	
		

