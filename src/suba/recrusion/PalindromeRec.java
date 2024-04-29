package suba.recrusion;

public class PalindromeRec {
	static boolean ans = true;

	public static void main(String[] args) {

		String a = "a";

		System.out.println(findpal(a, 0, a.length() - 1));

		//System.out.println(ans);
	}

	private static boolean findpal(String a, int start, int end) {

		if (start >= end)
			return true;
		if (a.charAt(start) != a.charAt(end)) {
			return false;

		} else
			return findpal(a, ++start, --end);

		// ans = a.charAt(start) == a.charAt(end);

	}

}
