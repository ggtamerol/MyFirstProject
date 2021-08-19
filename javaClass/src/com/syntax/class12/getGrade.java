package com.syntax.class12;
public class getGrade {

//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
//score > 90 - A
//score >80 - B
//score >70 - C
//score > 50 - D
//anything else - F



char grade(int grades) {
	
	char result=0;
	if (grades>90 ) result='A';
	else if (grades<90 && grades>=80) result='B';
	else if (grades<80 && grades>=70) result='C';
	else if (grades<70 && grades>=50) result='D';
	else  result='F';
	return result;
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     getGrade getgrade=new getGrade() ;
     
	 System.out.println(getgrade.grade(35) );
	

	}}