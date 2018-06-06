package division;

import java.util.Scanner;

public class DivideInRange {
	private static Scanner in;

	public static void main(String[] args) {
		int[] input = new int[2];
		int rev, division;
		in = new Scanner(System.in);
		
		System.out.println("Enter from what num range starts: ");
		input[0] = in.nextInt();
		System.out.println("Enter where range stops: ");
		input[1] = in.nextInt();
		System.out.println("Division with: ");
		division = in.nextInt();
		
		if(input[0] > input[1]) {
			System.out.println("Ending num is larger than start, reversing range variables! ");
			rev = input[1];
			input[1] = input[0];
			input[0] = rev;
		}
		
		for(int i = input[0]; i <= input[1]; i++) {
			if(i%division == 0) {
				System.out.println(i);
			}
		}
		
	}
}
