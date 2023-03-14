package com.encapsulation;

public class TataCarNexon extends Car {

	int horsePower=1440;
	
	public void displayConfigurtion() {
		
		System.out.println(horsePower);
		System.out.println(numberOfWheels);
		System.out.println(numberOfGears);
		System.out.println(dashboardName);
	}
}
