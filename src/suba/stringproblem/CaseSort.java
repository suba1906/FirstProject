package suba.stringproblem;

import java.util.Arrays;
import java.util.Collections;

public class CaseSort {

	public static void main(String[] args) {
		String str = "defRTSersUXI";
		Boolean[] boolArray = new Boolean[str.length()];
		Arrays.fill(boolArray, false);

		String lowerCase = "";
		String UpperCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				UpperCase = UpperCase + String.valueOf(ch);
			else {
				boolArray[i] = true;
				lowerCase = lowerCase + String.valueOf(ch);
			}

		}

		char upperArray[] = UpperCase.toCharArray();
		Arrays.sort(upperArray);
		// Collections.sort(lowerCase); instead of string if we added lower and upper
		// case in array list then u can sort using collection
		UpperCase = new String(upperArray);

		char lowerArray[] = lowerCase.toCharArray();
		Arrays.sort(lowerArray);
		lowerCase = new String(lowerArray);

		int n = 0, m = 0;

		String ans = "";
		for (int j = 0; j < str.length(); j++) {
			if (boolArray[j] && n < lowerCase.length()) {
				ans = ans + String.valueOf(lowerCase.charAt(n));
				n++;
			}

			else if (m < UpperCase.length()) {
				ans = ans + String.valueOf(UpperCase.charAt(m));
				m++;

			}

		}
		System.out.println(ans);
	}

}
