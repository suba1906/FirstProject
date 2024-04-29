package suba.sortingproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddSorting {

	public static void main(String[] args) {

		Integer arr[] = { 10, 50, 79, 13, 66, 21, 90, 43 };
		// List<Integer> arr = new ArrayList<>();

		Arrays.sort(arr, new EvenOddComparator());
		System.out.println(Arrays.toString(arr));

	}

}
