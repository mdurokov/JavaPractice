package calculator;

import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {
		int i, j, choose;
		i = Integer.parseInt(JOptionPane.showInputDialog("Insert first number:"));
		j = Integer.parseInt(JOptionPane.showInputDialog("Insert second number:"));
		choose = Integer.parseInt(JOptionPane.showInputDialog("Choose operation by number: 1.+ 2.- 3./ 4.* 5.%"));
		switch (choose) {
		case 1:
			System.out.println(i+j);
			break;
		case 2:
			System.out.println(i-j);
			break;
		case 3:
			if(j==0) {
				System.out.println("Can't divide with zero!");
			}else {
				System.out.println(i/j);
			}
			break;
		case 4:
			System.out.println(i*j);
			break;
		case 5:
			if(j==0) {
				System.out.println("Can't divide with zero!");
			}else {
				System.out.println(i%j);
			}
			break;
		default:
			System.out.println("No operation like that");
			break;
		}
	}
}
