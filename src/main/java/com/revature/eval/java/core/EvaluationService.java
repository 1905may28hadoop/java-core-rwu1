package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EvaluationService {

	/**
	 * 1. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String acronym = phrase.substring(0,1);
		for (int i=0;i<phrase.length();i++) {
			if (phrase.charAt(i) == ' ') {
				acronym = acronym + phrase.substring(i+1, i+2);
			}
		}
		acronym = acronym.toUpperCase();
		System.out.println(acronym);
		return acronym;
	}

	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int score = 0;
		for (int i=0;i<string.length();i++) {
			if ((string.charAt(i) == 'a') || (string.charAt(i) == 'A')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'e') || (string.charAt(i) == 'E')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'i') || (string.charAt(i) == 'I')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'o') || (string.charAt(i) == 'O')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'u') || (string.charAt(i) == 'U')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'l') || (string.charAt(i) == 'L')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'n') || (string.charAt(i) == 'N')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'r') || (string.charAt(i) == 'R')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 's') || (string.charAt(i) == 'S')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 't') || (string.charAt(i) == 'T')) {
				score = score + 1;
			}
			if ((string.charAt(i) == 'd') || (string.charAt(i) == 'D')) {
				score = score + 2;
			}
			if ((string.charAt(i) == 'g') || (string.charAt(i) == 'G')) {
				score = score + 2;
			}
			if ((string.charAt(i) == 'b') || (string.charAt(i) == 'B')) {
				score = score + 3;
			}
			if ((string.charAt(i) == 'c') || (string.charAt(i) == 'C')) {
				score = score + 3;
			}
			if ((string.charAt(i) == 'm') || (string.charAt(i) == 'M')) {
				score = score + 3;
			}
			if ((string.charAt(i) == 'p') || (string.charAt(i) == 'P')) {
				score = score + 3;
			}
			if ((string.charAt(i) == 'h') || (string.charAt(i) == 'H')) {
				score = score + 4;
			}
			if ((string.charAt(i) == 'v') || (string.charAt(i) == 'V')) {
				score = score + 4;
			}
			if ((string.charAt(i) == 'f') || (string.charAt(i) == 'F')) {
				score = score + 4;
			}
			if ((string.charAt(i) == 'w') || (string.charAt(i) == 'W')) {
				score = score + 4;
			}
			if ((string.charAt(i) == 'y') || (string.charAt(i) == 'Y')) {
				score = score + 4;
			}
			if ((string.charAt(i) == 'k') || (string.charAt(i) == 'K')) {
				score = score + 5;
			}
			if ((string.charAt(i) == 'j') || (string.charAt(i) == 'J')) {
				score = score + 8;
			}
			if ((string.charAt(i) == 'x') || (string.charAt(i) == 'X')) {
				score = score + 8;
			}
			if ((string.charAt(i) == 'q') || (string.charAt(i) == 'Q')) {
				score = score + 10;
			}
			if ((string.charAt(i) == 'z') || (string.charAt(i) == 'Z')) {
				score = score + 10;
			}
		}
		System.out.println(score);
		return score;
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		
		// Strings in java are immutable, so let's use String to create a character array and be able to manipulate them
		String str = string;
		
		String cleanstr;
		
		cleanstr = str.replaceAll("\\.|-","")
						.replaceAll("\\s", "")
						.replaceAll("\\(", "")
						.replaceAll("\\)", "");

		
		// Print the string
		System.out.println(cleanstr);
		
		// while the phone number is more than 10 digits and the first digit is one then...
		while ((cleanstr.length())>10) {
			System.err.println("IllegalArgumentException: Over ten digits");
			throw new IllegalArgumentException();
		}

		return cleanstr;
	}

	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		
		// Put each word into a string array
		String strArray[] = string.split(" |,");
//		String strArray[] = string.split(",\n");
//		System.out.println("String converted to String Array");
		
		// Map
		Map<String, Integer> map = new HashMap<>();
		
		int count = 0;
		// Loop through the string array
		for(int i=0;i<strArray.length;i++) {
			String word = strArray[i];
//			System.out.println(word);
			int freq = map.getOrDefault(word, count);
			map.put(word, ++freq);
		}
        for (Entry<String, Integer> result : map.entrySet()) {
            System.out.println(result.getKey() + " " + result.getValue());
        }
//		System.out.println(map);
		
		return map;
	}

	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			
			// define our left and right positions
//			int left = 0;
//			int right = (sortedList.size() - 1);
			
			// Cast Type T to an object then to an int or string
			if (t instanceof Integer) {
//				
				int a = (Integer)t;
				System.out.println("Input: " + a);
				
				int left = 0;
				int right = (sortedList.size() - 1);
				
				while(left<=right) {
					// define our midpoint
					int mid = left + ((right - left) / 2);
					if (sortedList.get(mid).equals(a)) {
						System.out.println("Found it! The index is: " + mid );
						return mid;
					}
					if (a < (Integer)sortedList.get(mid) ) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				}
			}
			else if (t instanceof String) {
//				T objT = t;
				String b = (String)t;
				int c = (Integer.parseInt(b));
				System.out.println("Input: " + b);
				
				int left = 0;
				int right = (sortedList.size() - 1);
				
				while(left<=right) {
					// define our midpoint
					int mid = left + ((right - left) / 2);
					if (sortedList.get(mid).equals(b)) {
						System.out.println("Found it! The index is: " + mid );
						return mid;
					}
					if (c < (Integer)sortedList.get(mid) ) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				}
			}
			
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 6. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		
		int number = input;
		System.out.println("Input: " + number);
		// store the input integer into an array
		ArrayList<Integer> intArray = new ArrayList<>();
		ArrayList<Integer> expArray = new ArrayList<>();
		
//		// split the input integer into individual digits
		while (number > 0) {
			intArray.add(number % 10);
			number = number / 10;
		}
//		
		System.out.println("Array:" + intArray);
		System.out.println("Array size: "+ intArray.size());
//		 loop through the integer array
		for(int i=0; i<intArray.size(); i++) {
			int a = intArray.get(i);
			int b = intArray.size();
//			// exponentiation each element by the array size
			int exp = (int) (Math.pow(a, b));
//			System.out.println("Exponent: " + exp);
			expArray.add(exp);
		}
		System.out.println("Array after Exponentiation: " + expArray);
		// sum the elements in the array
		int sum = 0;
		for (int j=0;j<expArray.size();j++) {
			sum += expArray.get(j);
		}
		System.out.println("Sum: " + sum);
		
		// if the sum equals the input then it is a armstrong number else false
		if (input == sum) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}
	
	}

	/**
	 * 7. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		
		// store input number into a variable
		long number = l;
		// store prime factors in an array
		ArrayList<Long> primeFactorArray = new ArrayList<>();
		
		while (number % 2 == 0) {
			primeFactorArray.add(2L);
			number = number / 2;
		}
		while (number % 3 == 0) {
			primeFactorArray.add(3L);
			number = number / 3;
		}
//		while (number % 5 == 0) {
//			primeFactorArray.add(5);
//			number = number / 5;
//		}
		
		for (long i=3;i<=Math.sqrt(number);i+=2) {
			while (number % i == 0) {
				primeFactorArray.add(i);
				number = number / i;
			}
		}
		
		System.out.println(primeFactorArray);
		
		
		return primeFactorArray;
	}


	/**
	 * 8-9. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 8
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			
			// Make input string lowercase
			String lowercase = string.toLowerCase();
			
			// create an alphabet character array
			char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			System.out.println(Arrays.toString(alphabet));
			
			// create a cipher character array
			char[] cipher = new char[] {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
			System.out.println(Arrays.toString(cipher));
			
			// create input character array
			char[] input = lowercase.toCharArray();
			System.out.println("Input: " + Arrays.toString(input));
			
			// create output character array
			ArrayList<Character> outputArray = new ArrayList<>();	
			
			// loop through the input
			for(int i=0;i<input.length;i++) {
				// loop through the alphabet while looping through the input
				for (int j=0;j<alphabet.length;j++) {
					// store the alphabet element into a char variable
					char element = alphabet[j];
					// if the input element matches the alphabet element then...
					while (input[i] == element) {
						// set the alphabet element equal to the cipher element (keeping the same index in both arrays)
						element = cipher[j];
						// append the cipher element to the output array
						outputArray.add(element);
						}
				}
			}
			// for every 5th element in the output array insert a space
			for (int k=5;k<outputArray.size();k+=6) {
				outputArray.add(k, ' ');
			}
			System.out.println("Output: " + outputArray);
			// convert character array to string
			StringBuilder output = new StringBuilder();
			for (char ch: outputArray) {
				output.append(ch);
			}
			String str = output.toString();
			System.out.println(str);
			
			return str;
		}

		/**
		 * Question 9
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			
//			// Make input string lowercase
//			String lowercase = string.toLowerCase();
			
			// create an alphabet character array
			char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			System.out.println(Arrays.toString(alphabet));
			
			// create a cipher character array
			char[] cipher = new char[] {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
			System.out.println(Arrays.toString(cipher));
			
//			// create input character array
			char[] input = string.toCharArray();
			System.out.println("Input: " + Arrays.toString(input));	
			
			// create output character array
			ArrayList<Character> outputArray = new ArrayList<>();
			
//			// for every 5th element in the input array remove a space
//			for (int k=5;k<inputArray.size();k+=6) {
//				inputArray.remove(k);
//			}
			
			// loop through the input
			for(int i=0;i<input.length;i++) {
				// loop through the cipher while looping through the input
				for (int j=0;j<cipher.length;j++) {
					// store the cipher element into a char variable
					char element = cipher[j];
					// if the input element matches the cipher element then...
					while (input[i] == element) {
						// set the cipher element equal to the alphabet element (keeping the same index in both arrays)
						element = alphabet[j];
						// append the alphabet element to the output array
						outputArray.add(element);
						}
				}
			}
			System.out.println("Output: " + outputArray);
			// convert character array to string
			StringBuilder output = new StringBuilder();
			for (char ch: outputArray) {
				output.append(ch);
			}
			String str = output.toString();
			System.out.println(str);
			
			
			
			return str;
		}
	}

	/**
	 * 10. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration

		// Remove the question mark
		String cleanString = string.replace("?", "");
		// Split string into words array
		String wordArray[] = cleanString.split(" ");
		System.out.println(Arrays.toString(wordArray));
		
		// declare variables for the operators
		String plus = "plus";
		String minus = "minus";
		String multiply = "multiplied";
		String divide = "divided";
		
		// loop through the word array
		for (int i=0;i<wordArray.length;i++) {
			// if the words array contains an operator then do the math
			if (wordArray[i].equals(plus)){
				int a = Integer.parseInt(wordArray[i-1]);
				System.out.println("a = " + a);
				int b = Integer.parseInt(wordArray[i+1]);
				System.out.println("b = " + b);
				int result = a + b;
				System.out.println("a + b = " + result);
				return result;
			}
			if (wordArray[i].equals(minus)){
				int a = Integer.parseInt(wordArray[i-1]);
				System.out.println("a = " + a);
				int b = Integer.parseInt(wordArray[i+1]);
				System.out.println("b = " + b);
				int result = a - b;
				System.out.println("a - b = " + result);
				return result;
			}
			if (wordArray[i].equals(multiply)){
				int a = Integer.parseInt(wordArray[i-1]);
				System.out.println("a = " + a);
				int b = Integer.parseInt(wordArray[i+2]);
				System.out.println("b = " + b);
				int result = a * b;
				System.out.println("a * b = " + result);
				return result;
			}
			if (wordArray[i].equals(divide)){
				int a = Integer.parseInt(wordArray[i-1]);
				System.out.println("a = " + a);
				int b = Integer.parseInt(wordArray[i+2]);
				System.out.println("b = " + b);
				int result = a / b;
				System.out.println("a / b = " + result);
				return result;
			}
		}
		
		
		return 0;
	}

}
