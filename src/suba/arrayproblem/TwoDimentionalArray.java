package suba.arrayproblem;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		int arr[][] = { { 2, 3, 5 }, { 8, 9 }, { 7, 8, 5, 2 }

		};

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				// System.out.println("arr[" + i + "][" + j + "] " + arr[i][j]);
			}
		}

		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[3][2];
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("Please enter value");

				arr1[i][j] = sc.nextInt();
				System.out.println("arr[" + i + "][" + j + "]   " + arr1[i][j]);

			}
		}

		// For Loop
		for (int i = 0; i < arr1.length; i++) {

			System.out.println(Arrays.toString(arr1[i]));

		}

		System.out.println("###########");
		// Enhanced for loop
		for (int[] a : arr1) {

			System.out.println(Arrays.toString(a));

		}
	}

}
