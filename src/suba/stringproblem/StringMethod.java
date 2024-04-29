package suba.stringproblem;

public class StringMethod {

	public static void main(String[] args) {

		String s1 = "suba";
		String s2 = new String("suba");
		System.out.println("equals" + s1.equals(s2));
		System.out.println("=" + s1 == s2);
		System.out.println("contains 1 " + s1.contains("subas"));
		System.out.println("contains 2" + s1.contains("suba"));
		System.out.println("index of" + s1.indexOf("ub"));

	}

}
