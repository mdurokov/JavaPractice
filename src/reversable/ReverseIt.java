package reversable;

import java.util.Scanner;

public class ReverseIt {
	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter new string:");
		str = input.next();
		input.close();
		System.out.println(new StringBuilder(str).reverse().toString());
		
	}
}
