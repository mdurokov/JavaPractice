package findit;

import java.util.Arrays;

public class MakeNew {
	public static void main(String[] args) {
		int pointer = 0, counter = 0;
		int[] arr1 = {23,34,61,10,31,20,10,32,432,54,56};
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == 10) {
				pointer = i + 1;
			}
		}
		int max = arr1.length - pointer;
		int[] arr2 = new int[max];
		for(int i = pointer; i < arr1.length; i++) {
			arr2[counter] = arr1[i];
			counter++;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
