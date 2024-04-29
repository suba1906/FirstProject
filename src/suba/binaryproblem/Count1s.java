package suba.binaryproblem;

public class Count1s {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };

		// similar to first occurrence

		int start = 0, end = arr.length - 1;

		int ans = countones(arr, start, end);
		System.out.println(ans);
	}

	private static int countones(int[] arr, int start, int end) {

		while (start <= end)

		{
			int mid = start + (end - start) / 2;

			if (/* mid != arr.length - 1 && */arr[mid] == 0) // start +1 anyway which is going to greater than end, so loop will break, so no need to keep mid != arr.length - 1  
				start = mid + 1;

			/* if (arr[mid] == 1) */ // you can put this in else block instead of if condition
			else{ 
				if (mid != 0 && arr[mid - 1] == arr[mid])
					end = mid - 1;
				else
					return arr.length - mid;
			}

		}
		return 0;
	}

}
