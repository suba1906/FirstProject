package suba.maths;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give value to check palindrome");
		int x = sc.nextInt();
		// int n = x;

		// count digit x/10 --> reminder

		int reverse = reversethedidgit(x);

		if (reverse == x)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	private static int reversethedidgit(int x) {

		int sum = 0;

		while (x > 0) {
			int rev = x % 10;

			sum = sum * 10 + rev;

			x = x / 10;
		}
		return sum;
	}

}
