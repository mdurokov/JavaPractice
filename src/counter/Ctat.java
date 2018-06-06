package counter;

public class Ctat {
	public static void main(String[] args) {
		int[] arr = {12, 10, 13, 10, 20, 15, 10, 20, 20, 20};
		int count10 = 0, count20 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 10) {
				count10++;
			}
			if(arr[i] == 20) {
				count20++;
			}
		}
		if(count10 < count20) {
			System.out.println("There is more 20's, " + count20);
		}else if(count10 == count20) {
			System.out.println("There is " + count10 + " of both");
		}else {
			System.out.println("There is more 10's, " + count10);
		}
	}
}
