package suba.sortingproblem;

public class MergeMaxGuest {

	public static void main(String[] args) {

		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

		int index = 0;
		int ppl = 1, maxppl = 1;

		for (int i = 1; i < arr.length; i++) {
			if (index != i) {
				if (dep[index] > dep[i] && arr[index] < dep[i]) {
					// System.out.println("incerea in if comdition " + dep[index] + " " + dep[i]);

					ppl++;
				} else if (dep[index] < dep[i] && dep[index] > arr[i]) {
					// System.out.println("incerea in else if comdition " + dep[index] + " " +
					// dep[i]);

					index = i;
					ppl++;

				} else {
					index = i;
					maxppl = Math.max(ppl, maxppl);
					ppl = 1;
				}
			}

		}
		System.out.println(maxppl);
	}

}
