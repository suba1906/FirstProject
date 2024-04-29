package suba.recrusion;

import java.util.ArrayList;

public class FindArraySorted {

	public static void main(String[] args) {

		int arr[] = { 8, 6, 2, 1, 0, 1, 1, 1, 2 };

		boolean ans = isSorted(arr, 1);
		System.out.println(ans);

		System.out.println(findTarget(arr, 0, 5));

		System.out.println(findTargetIndexes(arr, 0, 1, new ArrayList<>()));

		System.out.println(findTargetIndexes1(arr, 0, 1));
	}

	private static ArrayList findTargetIndexes1(int[] arr, int i, int target) {

		ArrayList<Integer> list = new ArrayList<>();

		if (i >= arr.length)
			return list;

		if (arr[i] == target) {
			list.add(i);
		}
		ArrayList list1 = findTargetIndexes1(arr, ++i, target);
		System.out.println("list1 " + list1);
		System.out.println("list " + list);

		list.addAll(list1);

		return list;
	}

	private static ArrayList findTargetIndexes(int[] arr, int i, int target, ArrayList arrayList) {

		if (i >= arr.length)
			return arrayList;

		if (arr[i] == target)
			arrayList.add(i);

		return findTargetIndexes(arr, ++i, target, arrayList);

	}

	private static boolean isSorted(int[] arr, int i) {

		if (i >= arr.length) {
			return true;
		}

		if (arr[i - 1] < arr[i])
			return isSorted(arr, ++i);
		else
			return false;

		// arr[i - 1] < arr[i] && isSorted(arr,++i) --> In single line also we can solve
		// , instead of if else
	}

	private static int findTarget(int[] arr, int i, int target) {

		if (i >= arr.length) {
			return -1;
		}

		if (arr[i] == target)
			return i;
		else
			return findTarget(arr, ++i, target);

		// arr[i] == target || findTarget(arr,++i) --> In single line also we can solve
		// instead of if else ->> for boolean return type
	}

}
