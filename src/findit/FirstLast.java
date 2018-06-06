package findit;

public class FirstLast {
	public static void main(String[] args) {
		int[] arr = {10,23,43,234,52,10};
		int last = arr.length - 1;	
		if(arr[0] == arr[last]) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
