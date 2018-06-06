package calculator;

import java.util.Scanner;

public class Calculations {
	private static Scanner in;

	public static void main(String[] args) {
		int n;
		in = new Scanner(System.in);
		System.out.println("Insert n: ");
		n = in.nextInt();
		while (n != 1) {
			if (n == 0) {
				System.out.println("n can't be 0!");
				n = 1; 
			}else if (n % 2 == 0) {
				n = n / 2;
				System.out.println(n + ", ");
			}else {
				n = (n * 3) + 1;
				System.out.println(n + ", ");
			}
		}
	}
}
