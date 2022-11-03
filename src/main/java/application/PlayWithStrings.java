package application;

import java.util.Objects;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");

		printIntitials("Oliver", "Fucec");

		System.out.println(areAnagrams("parliament".replaceAll("\\s+",""), "partial men".replaceAll("\\s+",""))); 

		System.out.println(isPalindrome("Eva can I see bees in a cave".replaceAll("\\s+","")));
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {

		StringBuilder builder = new StringBuilder();
		builder.append(firstname);
		builder.append(" ");
		builder.append(lastname);
		System.out.println(builder);
		return;
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {
		return sumOfCharCodes(value1) == sumOfCharCodes(value2);
	}

	
    public static int sumOfCharCodes(String string) {
        return (Objects.nonNull(string) ? (string.matches("(?i)[a-z]*+") ? string.toUpperCase() : "") : "").chars().sum();
    }

	/**
	 * TODO: palindrome checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		char[] ch = new char[value.length()];
		boolean returnValue = false;
		for(int i = 0; i < value.length(); i++){
			ch[i] = value.charAt(i);
		}
		for(int i = 0; i < ch.length; i++){
			for(int j = ch.length - 1; j > i; j--){
				if(ch[i] == ch[j - 1])	returnValue = true;
				else returnValue = false;
			}
		}
		return returnValue;
	}
}
