package suba.stringproblem;

public class KeyPadPrblm {

	public static void main(String[] args) {

		int arr[] = new int[200];

		int n = 3, i = 2;

		for (int k = 0; k < 26;) {
			int j = 0;
			if (i == 9 || i == 7)
				n = 4;
			else
				n = 3;
			while (k < 26 && j < n) {
				arr['a' + k] = i;
				System.out.println(arr['a' + k]);

				j++;
				k++;

			}
			i++;

		}

		String s = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs\r\n";
		String ans = "";

		for (int l = 0; l < s.length(); l++) {
			//System.out.println(Character.toUpperCase('a') + 1);

			ans += arr[s.charAt(l) + 0];

		}

		System.out.println("ans " + ans);

	}

}
