package suba.arrayproblem;

public class Maxelement {

	public static void main(String[] args) {

		int arr[] = { 8, 8, 4, 8, 8, 7, 4 };

		int maxcount = arr.length / 2;
		int max = arr[0], count = 1, index = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
				count = 1;
				index = i;
			} else if (arr[i] == max) {
				count++;
				index = i;
			}

		}

		if (count > maxcount)
			System.out.println("max element " + max + " number of count" + count + " and index is " + index);
		else
			System.out.println("count doesnot exceed max count");
	}

}
