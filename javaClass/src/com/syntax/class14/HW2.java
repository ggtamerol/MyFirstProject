package com.syntax.class14;

public class HW2 {
	
//Write a program that reads two people's first//names and if they expecting boy or girl? 
//Based on the input suggests a name for a baby://Example Output:
//Mom?s first name? Mary//Dad?s first name? Daniel
//Boy or Girl? boy//Suggested baby name: DANRY
//Example Output://Mom?s first name? Mary
//Dad?s first name? Daniel//Boy or Girl? girl
//Suggested baby name: MAIEL	
	
	 String info ( String momName ,String dadName, String gender) {
	
	String babyName;
	
	if (gender.equalsIgnoreCase("boy")) {
	   babyName=dadName.substring(dadName.length()/2).concat
	   (momName.substring(momName.length()/2,momName.length()));}
		
	else if (gender.equalsIgnoreCase("girl")) {
		babyName=momName.substring(momName.length()/2).concat
		(dadName.substring(dadName.length()/2,dadName.length()));}	
		
	else{
		babyName="invalid";}
	  return babyName;
	
	
		
		
	}


}


	
	

