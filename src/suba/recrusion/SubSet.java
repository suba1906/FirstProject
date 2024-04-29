package suba.recrusion;

import java.util.Arrays;

public class SubSet {

	public static void main(String[] args) {
		// all possible subsets

		String ans = "abc";
		String p = "";
		// ans.substring(1) --> To remove first value
		// ASSIC of char ans.charAt(0) + 0
		findSubset(p, ans);

		int arr[] = { 3, 5, 9 };
		int newArr[] = new int[arr.length];

		findSubsetArray(newArr, arr, 0);

	}

	private static void findSubsetArray(int[] newArr, int[] arr, int index) {

		if (index >= arr.length) {
			System.out.println(Arrays.toString(newArr));
			return;
		}
	}

	private static void findSubset(String p, String ans) {

		if (ans.length() == 0) {
			System.out.println(p);
			return;
		}

		findSubset(p + ans.charAt(0), ans.substring(1));
		findSubset(p + (ans.charAt(0) + 0), ans.substring(1));

		findSubset(p, ans.substring(1));

	}

}
