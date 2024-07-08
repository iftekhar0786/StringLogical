package com.te.logical.string;

public class IsPallindrome {

	public static boolean isPallindrome(String str) {

		int start = 0, end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			} else {
				start++;
				end--;

			}

		}
		return true;

	}

	public static void main(String[] args) {

		String str = "MALAYLAM";
		boolean pallindrome = isPallindrome(str);
		System.out.println(pallindrome);
	}
}
