package suba.stringproblem;

import java.util.ArrayList;

public class NaivePattern {

	public static void main(String[] args) {

		String a = "ABADBADBAA";
		String b = "DBA";

		System.out.println(a.indexOf(b));
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length(); i++) {
			
			int val =a.indexOf(b);
			System.out.println(val);
			a=a.substring(val);
			i=val;
			System.out.println(a);
			list.add(val);
		}

		System.out.println(list);

	}

}
