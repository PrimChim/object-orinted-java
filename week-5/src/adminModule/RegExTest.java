package adminModule;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age = 0;
		System.out.println("Enter age");
		try {
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid age data- only numbers please");
		}
		System.out.println("entered age is "+ age);
		
		try {
			System.out.println(Long.parseLong("Ram"));
		} catch (NumberFormatException e) {
			System.out.println("String cannot be converted to Long type");
		}
		
		String regExForEmailId = "^[\\S]+@(heraldcollege\\.edu\\.np|heraldcollegekathmandu\\.com)$";
//		Cltrl +space
		System.out.println(Pattern.matches(regExForEmailId, "dilip@heraldcollege.edu.np"));
		System.out.println(Pattern.matches(regExForEmailId, "dilip_1234@heraldcollege.edu.np"));
		System.out.println(Pattern.matches(regExForEmailId, "dilip 1234@heraldcollege.edu.np"));
	}

}
