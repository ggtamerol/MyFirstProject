package com.syntax.class13;

public class Phone {
	
//Create a Class "Phone". Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.	
	
  String make;
  String model;
  int RAM;
  int ROM;
  int camera;
  boolean is5G;
  double screenSize;
  
 
  void makeCall() {
 System.out.println(make+" "+" "+model+" making calls"); }
  
 void takePictures() {
 System.out.println(make+" "+" "+model+" can take picture"); }
 
 
  public static void main(String[] args) {
		
		
	Phone iphone=new Phone();
	iphone.camera=12;
	iphone.make="Apple";
	iphone.model="Iphone 12";
	iphone.is5G=true;
	iphone.screenSize=6.7;
	iphone.makeCall();
    iphone.takePictures();
	
	


	}

}
