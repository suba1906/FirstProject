package suba.stringproblem;

import java.util.ArrayList;

public class BoyerMoreAlg {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		String text = "AABAACAADAABAABA";

		String pattern = "AABA";

		int n = pattern.length();
		// int skip = 0;

		System.out.println("text.length()- pattern.length()" + (text.length() - pattern.length()));
		for (int i = 0; i <= text.length() - pattern.length(); i++) {
			// System.out.print(i);

			String word = text.substring(i, i + pattern.length());

			if (pattern.charAt(n - 1) != word.charAt(n - 1)) {
				System.out.println("last word not match" + pattern.charAt(n - 1) + " " + word.charAt(n - 1));
				if (pattern.contains(word.charAt(n - 1) + "")) {
					System.out.println("word contains in pattern" + pattern + " " + word);
					i = i + n - 2;
				} else {
					System.out.println("word not contains in pattern" + pattern + " " + word);

					i = i + n - 1;
				}

				System.out.println("Skipping" + i);

			} else {
				System.out.println("last word match" + pattern.charAt(n - 1) + " " + word.charAt(n - 1));

				if (pattern.equals(word)) {
					System.out.println("word eqauls to pattern" + pattern + " " + word);

					list.add(i + 1);
				} else {
					System.out.println("word not eqauls to pattern" + pattern + " " + word);

					i = i + n - 2;
				}
				System.out.println("Skipping else" + i);

			}

		}
		System.out.println(list);
	}

}
