package suba.stringproblem;

import java.util.Arrays;

public class ZohoStringQues {

	public static void main(String[] args) {

		int arr[] = new int[1000];

		for (int i = 1; i < 26; i++) {
			arr['a' + i] = i;
		}

		String s = "zz";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			// sum += arr[s.charAt(i)] + 1); // here we can do in another way

			sum += s.charAt(i) - 96; // happening like assic value starts from 97 from tht char we minus 96 so tht
										// blce will come
			// ie char is a , assic value 97 ....minus 97 from 96 = 1
		}

		System.out.println(sum);
	}

}
