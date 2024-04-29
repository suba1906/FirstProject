package suba.stringproblem;

import java.util.ArrayList;
import java.util.List;

public class KMPAlgo {

	public static void main(String[] args) {

		String a = "abbabb";

		String pre = a.charAt(0) + "";
		int n = a.length();
		List<String> prefixList = new ArrayList<>();

		List<Integer> ans = new ArrayList<>();
		ans.add(0);

		/*
		 * for (int i = 1; i < a.length(); i++) {
		 * 
		 * pre += a.charAt(i); int k = 0; System.out.println("pre   " + pre); String b =
		 * "", c = ""; int maxi = 0; while (k < pre.length()) { if (k < pre.length() -
		 * 1) {
		 * 
		 * b = b + pre.charAt(k); prefixList.add(b); } c = pre.charAt(pre.length() - k -
		 * 1) + c; //System.out.println("b       " + b + "  c   " + c);
		 * 
		 * if (prefixList.contains(c)) { maxi = Math.max(maxi, c.length()); } k++; }
		 * 
		 * ans.add(maxi); }
		 */

		if (a.charAt(0) == a.charAt(1))
			ans.add(1);
		for (int i = 1; i < a.length(); i++) {

		}
		System.out.println("list" + ans);
	}

}
