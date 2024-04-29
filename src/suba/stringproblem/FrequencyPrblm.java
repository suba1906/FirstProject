package suba.stringproblem;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyPrblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String step = "12";
		System.out.println((step.charAt(step.length() - 1) - '0') + 1);

		String a = "geeks for geeks";
		Map<Character, Integer> map = new TreeMap<>();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ')
				map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
		}

		System.out.println(map);
	}

}
