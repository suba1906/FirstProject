package suba.stringproblem;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	private final static int CHAR = 256;

	public static void main(String[] args) {

		String a = "listen";
		String b = "silent";

		boolean ans = findAnagram(a, b);
		System.out.println(ans);

	}

	private static boolean findAnagram(String a, String b) {

		// Base condition
		if (a.length() != b.length()) {

			System.out.println("Not Anagram");
			return false;
		}

		int count[] = new int[CHAR];

		// Map<Character, Integer> map1 = new HashMap<>();
		// Map<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {

			count[a.charAt(i)]++;
			count[b.charAt(i)]--;

			/*
			 * map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
			 * map2.put(b.charAt(i), map2.getOrDefault(b.charAt(i), 0) + 1);
			 */

		}

		for (int j = 0; j < CHAR; j++) {
			if (count[j] != 0)
				return false;
		}
		/*
		 * System.out.println(map1); System.out.println(map2);
		 * 
		 * return map1.equals(map2);
		 */

		return true;
	}

}
