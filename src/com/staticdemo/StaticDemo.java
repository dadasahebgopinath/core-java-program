package com.staticdemo;

 public class StaticDemo {

  static String departName="Engineering";
  
  
  public static void main(String[] args) {
	
	  System.out.println(StaticDemo.departName);
	  StaticDemo.display();
}
  
  static void display() {
	  
	  System.out.println(StaticDemo.departName);
	  
  }
	
}
