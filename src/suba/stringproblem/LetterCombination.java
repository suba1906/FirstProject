package suba.stringproblem;

import java.util.HashMap;
import java.util.Map;

public class LetterCombination {

	public static void main(String[] args) {

		String digit = "23";

		Map<Character, String> map = new HashMap<>();

		setDigitInMap(map);

	
	}

	private static void setDigitInMap(Map<Character, String> map) {

		map.put('2', "abc");
		map.put('3', "def");

		map.put('4', "ghi");

		map.put('5', "jkl");

		map.put('6', "mno");

		map.put('7', "pqrs");

		map.put('8', "tuv");
		map.put('9', "wxyz");

	}

}
