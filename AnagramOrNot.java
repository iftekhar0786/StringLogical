package com.te.logical.string;

import java.util.Arrays;

//Two Strings are called the anagram if they contain the same characters. 
//However, the order or sequence of the characters can be different.
public class AnagramOrNot {

	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			char[] charArray2 = str2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			return Arrays.equals(charArray1, charArray2);

		}
	}

	public static void main(String[] args) {
		String str1 = "brag";
		String str2 = "gjab";

		boolean anagram = isAnagram(str1, str2);
		if (anagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not a anagram");
		}
		
		
	}
}
