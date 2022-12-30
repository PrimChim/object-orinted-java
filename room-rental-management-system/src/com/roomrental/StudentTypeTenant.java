package com.roomrental;

import java.util.Scanner;

public class StudentTypeTenant extends Tenant{

	static Scanner sc = new Scanner(System.in);
	
	@Override
	void viewLandlord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void selectLandlord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void TmsUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reviewLandlord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reviewProperty() {
		System.out.println("Please rate the property in 5");
		int a = sc.nextInt();
		System.out.println("Thank you for rating us "+ a+ " out of 5");
		
	}

}
