package suba.maths;

public class GcmLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 15;

		int gcm = calculateGCM(a, b);

		int lcm = calculateLCM(a, b);

	}

	private static int calculateLCM(int a, int b) {

		int max = Math.max(a, b);
		
		
		return 0;
	}

	private static int calculateGCM(int a, int b) {
		int gap = Math.abs(a - b);
		// int gap = Math.min(a, b);

		while (gap > 0) {
			if (a % gap == 0 && b % gap == 0) {

				System.out.println(gap);
				break;

			}
			gap--;
		}
		return gap;
	}

}
