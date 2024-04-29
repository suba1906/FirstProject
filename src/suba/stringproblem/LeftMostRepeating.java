package suba.stringproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeftMostRepeating {

	private final static int CHAR = 256;

	public static void main(String[] args) {

		String a = "heheloo";
		// String a = "geeksfoegeeks";

		int result = firstEfficientWay(a);
		System.out.println("firstEfficientWay" + result);

		int result1 = secondEfficientWay(a);
		System.out.println("secondEfficientWay" + result1);

		int result2 = thirdEffiecientWay(a);
		System.out.println("thirdEffiecientWay" + result2);

		/*
		 * char val = nonrepating(a); System.out.println("nonrepating" + val);
		 */

	}

	

	private static int thirdEffiecientWay(String a) {

		Map<Character, Integer> map = new HashMap<>();
		int val = -1;
		for (int i = a.length() - 1; i >= 0; i--) {
			if (map.containsKey(a.charAt(i)))
				val = i;
			else
				map.put(a.charAt(i), i);

		}

		return val;
	}

	private static int secondEfficientWay(String a) {
		int arr[] = new int[CHAR];
		Arrays.fill(arr, -1); // to store the default value in array
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < a.length(); i++) {

			if (arr[a.charAt(i)] == -1)
				arr[a.charAt(i)] = i; // storing index value
			else
				res = Math.min(res, arr[a.charAt(i)]);
		}
		return res == Integer.MAX_VALUE ? -1 : res;
	}

	private static int firstEfficientWay(String a) {
		int val = -1;
		int arr[] = new int[CHAR];
		for (int i = 0; i < a.length(); i++) {

			arr[a.charAt(i) - 'a']++;

		}

		// System.out.println(arr.toString());
		for (int j = 0; j < a.length(); j++) {

			// System.out.println("arr[j]" + arr[a.charAt(j) - 'a']);
			if (arr[a.charAt(j) - 'a'] > 1) {
				System.out.println("asd");
				val = j;
				break;
			}
		}

		return val;
	}

}
