package array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr = {1,9,3,4,8,6,5};
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int i:arr) {
			System.out.println(i);
		}
		}
		}


