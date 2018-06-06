package firstthingsfirst;

import javax.swing.JOptionPane;

public class FirstTry {
	public static void main(String[] args) {
		int i = 10, j;
		j = Integer.parseInt(JOptionPane.showInputDialog("Input number: "));
		System.out.println(i+j);
	}
}
