package com.allaccessmodifier.child;

import com.allaccessmodifier.privatemodifier.WithinSameClass;

public class NonChildOutSidePackage {

	public static void main(String[] args) {
		
		WithinSameClass withinSameClass=new WithinSameClass();
		
		System.out.println(withinSameClass.departmentName);

	}

}
