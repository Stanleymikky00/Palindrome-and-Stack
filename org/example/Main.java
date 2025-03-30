package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an word to check if it is Palindrome: ");
        String word = input.nextLine();
        PalindromeS(word);

    }
    public static void PalindromeS(String s1) {
        System.out.println("Is" + "<"+s1+">" + "a Palindrome: " + Palindrome.isPalindrome(s1)  );
    }
}