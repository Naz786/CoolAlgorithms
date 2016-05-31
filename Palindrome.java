import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String wordEntered;
		Scanner input;

		while (true) {
			input = new Scanner(System.in);

			System.out.println("Enter a word:");
			wordEntered = input.nextLine();

			isWordPalindrome(wordEntered);

		}
	}

	public static boolean isWordPalindrome(String word) {

		// This string will hold the input word in reverse.
		String reverse = "";

		/*
		 * This flag will be used to check if the input is a Palindrome, and
		 * will return true if so.
		 */
		Boolean isPalindrome = false;

		/*
		 * This filters the word from any non-white space punctuation and
		 * converts the input word to all lower case characters.
		 */
		word = (word.replaceAll("[\\W]", "")).toLowerCase();

		// This will reverse a the input string and store in Strreverse.
		for (int i = word.length()-1; i >= 0; i--){
			reverse = reverse + word.charAt(i);
		}
		
//		// This is a function that automatically reverses a String.
//		reverse = new StringBuilder(word).reverse().toString();

		// This will check the new reversed word is equal to the original 
		// word.
		if (reverse.equals(word)) {
			isPalindrome = true;
			System.out.println("is");
			return isPalindrome;
		} else {
			isPalindrome = false;
			System.out.println("not");
			return isPalindrome;
		}
	}
}
