package com.azaonlinefoodordering;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import java.io.FileWriter;

public class SignUp {
	// regex to check the name, password, username, and date of birth
	public String nameString = "^[\\w\\s\\w]{4,}";
	public String passString = "^\\w+(@|&)+\\d*";
	public String dateOfBirth ="^(0[1-9]|1[0-2])\\/(0\\d|1\\d|2\\d|3[0-1])\\/(19|20)\\d{2}";
	public String userName = "^[0]\\d{9}";
	
	// importing scanner class to take input
	static Scanner sc = new Scanner(System.in);
	
	// signUp method to take input from user while signing up
	public void signUp() {

		boolean flag = true;
		String password = "", name="", userName="",dob="",re_password="";
		
		// while loop to prompt user to give the correct input
		while (flag) {
			
			// taking name input
			System.out.println("\nPlease enter your full name: ");
			name = sc.nextLine();
			
			// taking username or number as input
			System.out.println("\nPlese enter your mobile number(Username):");
			userName = sc.nextLine();
			
			// taking input for date of birth
			System.out.println("\nPlease enter your date of birth(MM/DD/YY):");
			dob = sc.nextLine();
			
			// taking input for password
			System.out.println("\nPlease enter your password:");
			password = sc.nextLine();
			
			// taking input for password correction
			System.out.println("\nPlease confirm your password:");
			re_password = sc.nextLine();
			
			// using if else to check if strings match their format
			// and prompting user for correct input
			if(!Pattern.matches(this.nameString, name)) {
				System.out.println("Your name is incorrect (it must be at least 4 characters):\n"
						+ "Please re-enter it");
			}else if(!Pattern.matches(this.userName, userName)) {
				System.out.println("Your mobile number is incorrect (it must begin with 0 and must have 10 numbers):\n"
						+ "Please re-enter it...");
			}else if(!Pattern.matches(this.dateOfBirth,dob)){
				System.out.println("Wrong date format see this format (MM/DD/YYYY).\n"
						+"And please try again");
			}else if(!Pattern.matches(this.passString, password)) {
				System.out.println("Your password format is incorrect (it must contain at least character @ or & and end with number):\n"
						+ "Please re-enter it...");
			}else if(!password.equals(re_password)) {
				System.out.println("Your passwords are not matching,\n"
						+ "Please start again.");
			}
			else {
				flag = false;
			}
		}
		System.out.println(name+" "+dob+" "+userName+" "+password);

		// writing the collected information to SignUp.txt
		try {
			BufferedWriter myWriter = new BufferedWriter(new FileWriter("SignUp.txt"));
			myWriter.append("{name: "+name+",userName: "+userName+",dob: "+dob+",password: "+password+"}");
			myWriter.newLine();
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public static void main(String[] args) {
		// creating new object with SignUp class
		SignUp pass = new SignUp();
		
		System.out.println("Hello there welcome to the AZA online.");
	
		while(true) {
			
			// taking first input from user
			System.out.println("\nPlease enter 1 for sign up."
					+"\nPlease enter 2 for Quit.");
			String in = sc.nextLine();
			
			// redirecting user to sign up 
			switch (in) {
			case "1":
				System.out.println("Proceeding to sign up...");
				pass.signUp();
				break;
			case "2":
				System.exit(0);
			}
		}
		
	}
}
