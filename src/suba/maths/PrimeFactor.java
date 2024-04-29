package suba.maths;

public class PrimeFactor {

	public static void main(String[] args) {

		int n = 315;

		for (int i = 2; i * i < n; i++) { // square root

			System.out.println("outer  loop" + i);
			/*
			 * if (isprime(i)) { int x = i;
			 */
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}

			// }
		}
		
	
		
		if(n <= 1)
			return ;
		
		
	}

	private static boolean isprime(int num) {

		if (num == 1)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;

		for (int i = 5; i < num; i = i + 6) {

			if (num % i == 0 || num % (i + 2) == 0) {
				return false;

			}
		}

		return true;
	}

}
