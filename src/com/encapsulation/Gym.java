package com.encapsulation;

public class Gym {

	public static void main(String[] args) {
		
		float w=89f;
		
		float h=5.8f;
		
		BMCaclculator bmCaclculator=new BMCaclculator();
		float bmr=bmCaclculator.bodyMassCalculator(w, h);
		
		
		System.out.println(bmr);
		
	}

	// create calculator and use that in another class by creating instance/object.
	
}
