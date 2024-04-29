package suba.stringproblem;

public class PalindromeProblem {

	public static void main(String[] args) {

		String name = "yaaAy";
		name = name.toLowerCase();
		int start = 0;
		int end = name.length() - 1;

		// for (int i = 0; i < name.length() / 2; i++) {

		while (start < end) {
			if (name.charAt(start) != name.charAt(end))
				System.out.println("not palindrome");

			start++;
			end--;
		}
		System.out.println("Palindrome");
	}

}
