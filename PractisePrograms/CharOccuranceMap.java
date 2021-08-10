package PractisePrograms;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceMap {

	static void characterCount(String inputString) {

		HashMap<Integer, Character> charCountMap = new HashMap<Integer, Character>();

		char[] strArray = inputString.toCharArray();

		for (int i = 0; i < strArray.length; i++) {

			charCountMap.put(i, strArray[i]);
		}
		System.out.println(charCountMap);

		for (int i = 0; i < charCountMap.size(); i++) {

			if (charCountMap.get(i).equals('e')) {

				System.out.println("e is present in map :" + i);

			} else {
				System.out.println("e is not present in map");
			}
		}
	}

	public static void main(String[] args) {
		String str = "Most Welcome";
		characterCount(str);
	}
}