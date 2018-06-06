package findit;

import java.util.Scanner;

public class FindAVowel {
	public static void main(String[] args) {
		int all = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		for(int i=0; i < str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.print("string contains: ");
				System.out.println(str.charAt(i));
				all++;
			}
		}
		System.out.println("String has " + all + " vowels");
	}
}
