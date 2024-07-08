package com.te.logical.string;


//A string is said to be an Isogram, if all the letters in the string, occur only once in it.
public class IsogramicOrNot {

	private static boolean isIsogram(String str) {
		
		int freq[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				int index = ch - 'a';
				freq[index]++;
			}
		}
		
		 // Check if any character has a frequency greater than 1
        for (int count : freq) {
            if (count > 1) {
                return false; // Not an isogram
            }
        }

        return true; // It's an isogram
    }
		
		
	
	public static void main(String[] args) {
		String str = "cinemaaa".toLowerCase();
		boolean isogram = isIsogram(str);
		if(isogram) {
			System.out.println("Isogram");
		}else {
			System.out.println("Not a Isogram");
		}
		
	}
}
