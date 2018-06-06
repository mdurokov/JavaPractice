package counter;

public class DontRepeat {
	public static void main(String[] args) {
		int[] arr = {10,29,310,41,10};	
		System.out.println(find(arr));
	}
	
	public static boolean find(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
