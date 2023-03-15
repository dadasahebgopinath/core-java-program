package com.allaccessmodifier.child;

import com.allaccessmodifier.privatemodifier.WithinSameClass;

public class ChildClassFromOtherPackage  extends WithinSameClass{

	public static void main(String[] args) {
		
		ChildClassFromOtherPackage instance=new ChildClassFromOtherPackage();
		
		System.out.println(instance.wieght);
		System.out.println(instance.departmentName);
	}

}
