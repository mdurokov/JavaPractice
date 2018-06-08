package counter;

import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		in.close();
		count(input);
	}
	
	public static void count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0, space = 0, num = 0, other = 0;
		for(int i=0; i < x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter ++;	
			}
			else if(Character.isDigit(ch[i])) {
				num ++;	
			}
			else if(Character.isSpaceChar(ch[i])) {
				space ++;	
			}else {
				other ++;
			}
		}
		System.out.println("Given string is: " + x);
		System.out.println("total: " + x.length());
		System.out.println("Letter: " + letter);
		System.out.println("Number: " + num);
		System.out.println("Space: " + space);
		System.out.println("Other: " + other);
	}
}
