package com.syntax.class14;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//is Empty ()
		
		String name="Batch 10 ";
		System.out.println(name.isEmpty());
		name=" ";
		System.out.println(name.isEmpty());
		name=" ";
		System.out.println(name.isBlank());
		
		
	String str="           Hi there                ";
	System.out.println(str);
	System.out.println(str.trim());
	
String longStr="This class is easy";
System.out.println(longStr.startsWith("t"));
System.out.println(longStr.startsWith("T"));
System.out.println(longStr.startsWith("This"));
	
	
	
	
	}

}
