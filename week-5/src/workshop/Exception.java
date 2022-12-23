package workshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	void defined(int age) {
		if(age<5) {
			throw new ageNotMatched();
		}
	}
	public static void main(String[] args) {
		int a=-1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me an number:");
		try {
			a = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("There is error while taking input from you");
		}
		
		String b[]= {"apple", "ball","cat"};
		
		try {
			System.out.println(b[a]);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("the index of array couldn't reach to your given index");
		}
		
		Exception defined(4);
		System.out.println("End");

	}

}
