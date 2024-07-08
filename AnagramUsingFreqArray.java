package com.te.logical.string;

public class AnagramUsingFreqArray {
	private static boolean isAnagram(String str1, String str2) {

		// Array to count the frequency of each letter in the first string
		int freq1[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);

			// Consider only lowercase alphabet characters
			if (ch >= 'a' && ch <= 'z') {
				int index = ch - 'a';
				freq1[index]++;
			}
		}

		// Array to count the frequency of each letter in the second string
		int freq2[] = new int[26];

		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);

			// Consider only lowercase alphabet characters
			if (ch >= 'a' && ch <= 'z') {
				int index = ch - 'a';
				freq2[index]++;
			}
		}

		// Compare the frequency arrays
		for (int i = 0; i < 26; i++) {
			if (freq1[i] != freq2[i]) {
				// If any frequency does not match, the strings are not anagrams
				return false;
			}
		}

		// If all frequencies match, the strings are anagrams
		return true;
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "Silesnt";

		String lowerCase1 = str1.toLowerCase();
		String lowerCase2 = str2.toLowerCase();

		boolean anagram = isAnagram(lowerCase1, lowerCase2);

		if (anagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not a anagram");
		}
	}
}
