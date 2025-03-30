package org.example;

public class Palindrome {
// here the Push() stores the all char vales in reverse order
// pop() compare them with original character

	public static boolean isPalindrome(String x) {
		String str1 = x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		CharStackImpl stark = new CharStackImpl();

		//step 1 push all character:
		for (int i = 0; i < str1.length(); i++) {
			stark.push(str1.charAt(i));
		}
		//Step2: Pop character and compare with original
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != stark.pop()){
				return false; //the character does not match its not a palindrome
			}
		}
		return true; //all character match

	}


}
