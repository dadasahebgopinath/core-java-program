package com.allaccessmodifier.privatemodifier;

public class WithinSameClass {

	private int age=10; // private
	
	String name="Ninja Code"; // default access modifier
	
	protected float wieght= 100.23f; // protected
	
	public String departmentName="Engineering";
	
	public static void main(String[] args) {
		WithinSameClass instance=new WithinSameClass();
		System.out.println(instance.age);
		System.out.println(instance.name);
		System.out.println(instance.wieght);
		System.out.println(instance.departmentName);
		
	}
	
	
}
