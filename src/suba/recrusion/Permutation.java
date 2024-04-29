package suba.recrusion;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {

		String a = "abc";

		findPermutation("", a);

		ArrayList<String> answer = findPermutationList("", a);
		System.out.println("answer" + answer);
	}

	private static void findPermutation(String temp, String a) {

		if (a.isEmpty()) {
			System.out.println(temp);
			return;
		}

		for (int i = 0; i <= temp.length(); i++) {
			// System.out.println(temp.substring(0, i)+" "+ temp.substring(i,
			// temp.length()));
			String f = temp.substring(0, i);
			String l = temp.substring(i, temp.length());
			findPermutation(f + a.charAt(0) + l, a.substring(1));

		}
//		findPermutation(temp, a.substring(1));

	}

	private static ArrayList findPermutationList(String temp, String a) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < a.length(); i++) {

			char val = a.charAt(i);
			System.out.println("val " + val);
			System.out.println("temp " + temp);

			for (int j = 0; j <= temp.length(); j++) {
				// System.out.println(temp.substring(0, i)+" "+ temp.substring(i,
				// temp.length()));
				String f = temp.substring(0, i);
				String l = temp.substring(i, temp.length());
				System.out.println("loop " + f + val + l);
				list.add(f + val + l);

			}
			temp += val + "";
//		findPermutation(temp, a.substring(1));
		}
		return list;

	}

}
