package com.syntax.class09;

public class ArreyIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=10;
	
	int[]  arr=new int[5];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	System.out.println(arr[2]+arr[0]);//40
	
	
	// i want to store week days
	
	String[] days=new String[7];
	
	days[0]="Monday";
	days[1]="Tuesday";
	days[2]="Wednesday";
	days[3]="Thusrday";
	days[4]="Friday";
	days[5]="Saturday";
	days[6]="Sunday";
	System.out.println(days[5]+" "+days[6]);
	
	days[6]="10";
	System.out.println(days[5]+" "+days[6]);
	
	
	
	
	
	}

}
