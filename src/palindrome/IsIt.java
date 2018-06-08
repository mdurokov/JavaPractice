package palindrome;

import java.util.Scanner;

public class IsIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		scan.close();
		String rev = new StringBuilder(str).reverse().toString();
		if(str.equals(rev)) {
			System.out.println("Your string " + str + " is a Palindrome!");
		}else {
			System.out.println("Your string " + str + " is NOT a Palindrome!");
		}
	}
}
