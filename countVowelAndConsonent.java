package com.te.logical.string;

public class countVowelAndConsonent {

	public static void main(String[] args) {

		String str = "java is awesome";
		String lowerCaseStr = str.toLowerCase();

		int countOfVowel = 0, countOfConsonent = 0;
		for (int i = 0; i < lowerCaseStr.length(); i++) {
			char ch = lowerCaseStr.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countOfVowel++;
			} else {
				countOfConsonent++;
			}
		}
		System.out.println("count of vowels are " + countOfVowel);

		System.out.println("count of consonent are " + countOfConsonent);
	}
}
