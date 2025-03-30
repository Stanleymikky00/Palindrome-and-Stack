package exercise01.src.test.java;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
	@Test
	void testPalindrome() {
		String[] xs = {
				"a",
				"aba",
				"BaaB",
				"Ana",
				"Anna",
				"Regallager",
				"Eine güldne gute Tugend Lüge nie"
		};

		for (String s : xs) {
			System.err.println(s);
			assertTrue(Palindrome.isPalindrome(s));
		}

		String[] zs = {
				"Ba",
				"abac",
				"hansdampf",
				"peter pan",
				"quatsch mit sosse",
				"ab"
		};

		for (String s : zs) {
			System.err.println(s);
			assertFalse(Palindrome.isPalindrome(s));
		}
	}
}