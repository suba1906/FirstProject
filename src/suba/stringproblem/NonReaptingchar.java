package suba.stringproblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonReaptingchar {

	public static void main(String[] args) {

		String a = "appssale";

		int ans = nonrepeating(a);
		System.out.println(ans);
	}

	private static int nonrepeating(String a) {

		Map<Character, Integer> mapval = new LinkedHashMap<>();
		for (int i = 0; i < a.length(); i++) {

			if (mapval.containsKey(a.charAt(i)))
				mapval.put(a.charAt(i), -2);
			else
				mapval.put(a.charAt(i), i);
		}

		Integer entry = mapval.entrySet().stream()
				.filter(m -> m.getValue() != -2)
				.map(m -> m.getValue())
				.findFirst()
				.orElse(null);

		return entry == null ? -1 : entry;
	}

}
