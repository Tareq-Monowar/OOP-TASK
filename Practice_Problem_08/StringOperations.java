package Practice_Problem_08;

import java.util.Scanner;

public class StringOperations {

    // Method to reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    // Method to count occurrence of a character
    public static int countCharacter(String input, char target) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Reverse string
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);

        // Palindrome check
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        // Count character occurrence
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = countCharacter(str, ch);
        System.out.println("Character '" + ch + "' occurs " + count + " times.");

        scanner.close();
    }
}

