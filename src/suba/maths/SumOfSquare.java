package suba.maths;

public class SumOfSquare {

	public static void main(String[] args) {

		int a = 10, b = 15;
		
		int sum =0;
		while(a <=b)
		{
			
			sum += Math.pow(a,2);
			a++;
		}
		
		System.out.println(sum);
	}

}
