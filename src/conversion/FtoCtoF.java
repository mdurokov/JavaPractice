package conversion;

import java.util.Scanner;

public class FtoCtoF {

	public static void main(String[] args) {
		double f, c;
		int p;
		boolean i = true;
		Scanner in = new Scanner(System.in);

		while (i) {
			System.out.println("pick a number for conversion: 1.F to C, 2. C to F");
			p = in.nextInt();
			if (p == 1) {
				System.out.println("Enter Farenheit: ");
				f = in.nextDouble();
				System.out.println("It's: " + Math.round(FtoC(f) * 100.0) / 100.0 + " Celsious");
				i = FtoCtoF.exit();
			} else if (p == 2) {
				System.out.println("Enter Celsious: ");
				c = in.nextDouble();
				System.out.println("It's: " + Math.round(CtoF(c) * 100.0) / 100.0 + " Farenheit");
				i = exit();
			} else {
				System.out.println("Not an option!");
				i = exit();
			}
		}
		in.close();

	}

	public static double FtoC(double f) {
		double c = (f - 32) * 5 / 9;
		return c;
	}

	public static double CtoF(double c) {
		double f = c * 9 / 5 + 32;
		return f;
	}

	public static boolean exit() {
		//String o;
		System.out.println("Do you want to do another convesation?  1. Yes, 2. No");
		Scanner in = new Scanner(System.in);
		String o = in.nextLine();
		in.close();
		if(o.equals("y") || o.equals("1") || o.equals("yes")) {
			return true;
		}else if(o.equals("n") || o.equals("2") || o.equals("no")){
			return false;
		}else {
			System.out.println("enter 1 or 2");
			return exit();
		}		
	}
}
