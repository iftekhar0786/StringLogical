package com.te.logical.string;

public class PanagramOrNot {

	private static boolean isPanagram(String s) {

		// If the length of the string is less than 26, it cannot be a pangram
		if (s.length() < 26) {
			return false;
		} else {
			// Iterate over each character from 'a' to 'z'
			for (char ch = 'a'; ch <= 'z'; ch++) {
				// Check if the character 'ch' is present in the string 's'
				if (s.indexOf(ch) < 0) {
					// If any character is not found, the string is not a pangram
					return false;
				}
			}
		}
		// If all characters from 'a' to 'z' are found, the string is a pangram
		return true;
	}

	public static void main(String[] args) {

		String str = "the quick brown fox jumps over the lazy dog";
		boolean panagram = isPanagram(str.toLowerCase());
		if (panagram) {
			System.out.println("panagram");
		} else {
			System.out.println("not a panagram");
		}
	}
}
