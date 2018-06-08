package calculator;

import java.util.Scanner;

public class CalcWithScanner {
	public static void main(String[] args) {
		int i, j;
		String operation;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		i = input.nextInt();
		System.out.println("Enter second number");
		j = input.nextInt();
		System.out.println("Enter operation");
		operation = input.next();
		input.close();
		switch (operation) {
		case "+":
			System.out.println("Your result is: " + (i+j));
			break;
		case "-":
			System.out.println("Your result is: " + (i-j));
			break;
		case "*":
			System.out.println("Your result is: " + (i*j));
			break;
		case "/":
			if (j==0) {
				System.out.println("Can't divide with zero!");
			}else {
				System.out.println("Your result is: " + (i/j));
			}
			break;
		case "%":
			if (j==0) {
				System.out.println("Can't divide with zero!");
			}else {
				System.out.println("Your result is: " + (i%j));
			}
			break;
		default:
			break;
		}
	}
}
