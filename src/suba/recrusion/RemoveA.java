package suba.recrusion;

public class RemoveA {

	public static void main(String[] args) {

		String qns = "baccad";
		int i = 0;
		// baccad

		char quit = 'a';
		String ans = "";
		remove(qns, i, quit, ans);

		qns = "baccad";
		System.out.println(remove1(qns, i, quit));
	}

	private static void remove(String qns, int index, char quit, String ans) {
		//System.out.println(ans);

		if (index >= qns.length()) {
			System.out.println(ans);
			return;
		}
		if (qns.charAt(index) != quit) {

			remove(qns, index + 1, quit, ans + qns.charAt(index));
		} else {
			remove(qns, index + 1, quit, ans);

		}

	}

	private static String remove1(String qns, int index, char quit) {

		String ans = "";
		if (index >= qns.length())
			return ans;

		if (qns.charAt(index) != quit) {
			ans = ans + qns.charAt(index);
		}

		String val = remove1(qns, index + 1, quit);

		ans = ans + val;
		return ans;

	}

}
