package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//creating 2d Array
	
	int[][] c=new int [3][4];
	
	//1 row or 1 array
	c[0][0] =11;
	c[0][1] =12;
	c[0][2] =13;
	c[0][3] =14;
	
    //2 row or 2 array
	c[1][0] =20;
	c[1][1] =30;
	c[1][2] =40;
	c[1][3] =50;
	
    //3 row or 3 array
	c[2][0] =100;
	c[2][1] =200;
	c[2][2] =300;
	c[2][3] =400;
		
	
System.out.println(c[1][3]);//50//to access specify from which row index and column index
System.out.println(c[2][1]);//200//	to access specify from which array  and what  element index

//another way creating 2d Array


int[][]myArray= { {11,12,13,14,15},{20,30,40}, {100,200,300,400}};

System.out.println(myArray[0][4]);
System.out.println(myArray[1][0]);





















	
	}

}
