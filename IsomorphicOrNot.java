package com.te.logical.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicOrNot {

	public static boolean isIsomorphic(String str1, String str2) {

		Map<Character, Character> hm = new HashMap<Character, Character>();

		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			char original = str1.charAt(i);
			char replacemennt = str2.charAt(i);

			if (!hm.containsKey(original)) {
				if (!hm.containsValue(replacemennt)) {
					hm.put(original, replacemennt);
				} else
					return false;
			} else {
				Character mappedCh = hm.get(original);
				if (mappedCh != replacemennt)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "egg";
		String str2 = "add";

		boolean isomorphic = isIsomorphic(str1, str2);

		if (isomorphic) {
			System.out.println("isomorphic");
		} else {
			System.out.println("not a isomorphic");
		}

	}
}
