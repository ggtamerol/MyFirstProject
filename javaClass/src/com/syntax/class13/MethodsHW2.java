package com.syntax.class13;

public class MethodsHW2 {
	
	
	//Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address. 

	String usersName,Lastname,Type;
	
    void eAddress() {
		
	System.out.println(usersName+Lastname+"@"+Type+".com");}

	public static void main(String[] args) {
	
        MethodsHW2 John= new MethodsHW2();
		John.usersName="John";
		John.Lastname="Snow";
		John.Type="gmail";
		
     	MethodsHW2 Ayse= new MethodsHW2();
		Ayse.usersName="Ayse";
		Ayse.Lastname ="Gezer";
		Ayse.Type="hotmail";
		
		
		MethodsHW2 Umut= new MethodsHW2();
		Umut.usersName="Umut";
		Umut.Lastname ="Kuvvetli";
		Umut.Type="yahoo";
		
		
		John.eAddress();
		Ayse.eAddress();
		Umut.eAddress();
		
		
}}