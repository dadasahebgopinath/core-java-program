package com.allaccessmodifier.privatemodifier;

public class ChildClassFromSamePackage extends WithinSameClass {

	
	public static void main(String[] args) {
		
		ChildClassFromSamePackage instance=new ChildClassFromSamePackage();
		
		System.out.println(instance.name);
		System.out.println(instance.wieght);
		System.out.println(instance.departmentName);
	}
}
