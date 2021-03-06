package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			
			if (kilometersPerHour < 0) {
				return -1;
			}else {
				return Math.round(kilometersPerHour * 0.62137119223733 );
			}
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			if (kilometersPerHour < 0) {
				return ("Invalid Value");
			} else {
				long miles = Math.round(kilometersPerHour * 0.62137119223733);
				return (kilometersPerHour + " km/h = " + miles + " mi/h");
			}
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		if (XX < 0) {
			return "Invalid Value";
		}else {
			int ZZ = (XX % 1024);
			int YY = ((XX - ZZ)/1024);
			return (XX + " KB = " + YY + " MB and " + ZZ + " KB");
		}
		
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		
		
		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		}else {
			if (isBarking == true && (hourOfDay < 8 || hourOfDay > 22)) {
				return true;
			}else {
				return false;
			}
			
		}
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	
	
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		
		
		// Use DecimalFormat and set it to round down to determine if the values are equal up to three decimal places
		DecimalFormat df = new DecimalFormat("#.000");
		df.setRoundingMode(RoundingMode.DOWN);
		
		String a1 = df.format((firstNum));
		String b1 = df.format((secondNum));
		
		double a2 = Double.parseDouble(a1);
		double b2 = Double.parseDouble(b1);
		
		if (a2 == b2) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			
			if (isTeen(x) == true || isTeen(y) == true || isTeen(z) == true) {
				return true;
			}else {
				return false;
			}
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method
		
		// Use isTeen method to find if the value is a teen and then implement this in hasTeen

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			if (number >= 13 && number <= 19) {
				return true;
			}else {
				return false;
			}
		}
		
		}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
		
		if (minutes < 0) {
			return ("Invalid Value");
		}else {
			// calculate number of days and years from minutes
			Long XX = minutes;
			Long ZZ = (minutes % 525600)/1440;
			Long YY = ((minutes - ZZ) / 525600);
			
			return (XX + " min = " + YY + " y and " + ZZ + " d");
		}
	}
	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		
		// using a switch statement
		
		switch(number) {
		case 0 : return("ZERO");
		
		case 1 : return ("ONE");
		
		case 2 : return ("TWO");
		
		case 3 : return ("THREE");
		
		case 4 : return ("FOUR");
		
		case 5 : return ("FIVE");
		
		case 6 : return ("SIX");
		
		case 7 : return ("SEVEN");
		
		case 8 : return ("EIGHT");
		
		case 9 : return ("NINE");
		
		default : return ("OTHER");
		
		}
		
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		
		// First check if values are less than 10
		if (first < 10 || second < 10) {
			return (-1);
		}else {
			// Initialize variables and lists
			int a;
			int b;
			int c;
			List<Integer> arr1 = new ArrayList<Integer>();
			List<Integer> arr2 = new ArrayList<Integer>();
			List<Integer> arr3 = new ArrayList<Integer>();
			
			// Assign "a" to the larger of the two integers and assign "c" to the value of "a" so that a can be used later
			// and will not be subtracted from
			
			if (first > second) {
				a = first;
				b = second;
			}else {
				a = second;
				b = first;
			}
			c = a;
			
			// Create Lists that store values needed to find the GCD
			while (c > 0) {
				arr1.add(c);
				c--;	
			}
				
			for (Integer n : arr1) {
				if (a % n == 0 && n != a) {
					arr2.add(n);
				}
			}
			
			for (Integer nums : arr2 ) {
				if (b % nums == 0) {
					arr3.add(nums);	
				}
			}
			// Find the max of the possible divisors
				int max = Collections.max(arr3);
				return max;		
		}
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		
		if (num < 0) {
			return (-1);
		}else {
			// Convert the integer into a String and then into an Array
			String numStr = Integer.toString(num);
			String arr[] = numStr.split("");
			int first =  Integer.parseInt(arr[0]);
			int second = Integer.parseInt(arr[arr.length - 1]);
			return (first + second);
			
		}
		
		
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		
		// Initialize List and String Array then iterate through Array and add to List
		List<String> reversedString = new ArrayList<String>();
		String arr[] = string.split("");
		
		for (int i = (arr.length - 1); i >= 0; i--) {
			reversedString.add(arr[i]);
		}
		
		return String.join("", reversedString);
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		
		// Create an Array List and a Regular Expression that matches whitespace and hyphens
		List<String> finAcronym = new ArrayList<String>();
		String regex = "\s+|-+";
		
		// Split the given String twice to create an Array within an Array and then add the first letter
		// of each Array into the list
		
		String cutAcro[] = phrase.split(regex);
		
		for (int i = 0; i < cutAcro.length; i++) {
			String cutAcroAgain[] = cutAcro[i].split("");
			
			finAcronym.add(cutAcroAgain[0]);
		}
		
		// Join the final List Array and capitalize all of the letters within it
		return(String.join("", finAcronym).toUpperCase());
		
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			
			if (getSideOne() == getSideTwo() && getSideTwo() == getSideThree()) {
				return true;
			}else {
				return false;
			}
		}

		public boolean isIsosceles() {
			
			double a = getSideOne();
			double b = getSideTwo();
			double c = getSideThree();
			
			if (a == b && c != b) {
				return true;
			} else if (a == c && b != c) {
				return true;
			}else if (b == c && a != c) {
				return true;
			}else {
				return false;
			}
		}

		public boolean isScalene() {
			
			if (getSideOne() != getSideTwo() && getSideTwo() != getSideThree() && getSideOne() != getSideThree()) {
				return true;
			}else {
				return false;
			}
		}

	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		
		// create score counter and create one Array for the possible values and another from the given String
		int counter = 0;
		
		String[][] letters = {
				{"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"}, 
				{"D", "G"},
				{"B", "C", "M", "P"},
				{"F", "H", "V", "W", "Y"}, 
				{"K"}, 
				{"J", "X"}, 
				{"Q", "Z"}
				};
		
		
		String arr[] = string.toUpperCase().split("");
		
		// Use nested for loops to iterate through the Arrays and use counter to keep track of score
		for (int i = 0; i < arr.length; i++) {
			
			for (int k = 0; k < letters.length; k++) {
				
				for (int j = 0; j < letters[k].length; j++) {
					if (arr[i].equals(letters[k][j]) && k == 0) {
						counter++;
					}else if (arr[i].equals(letters[k][j]) && k == 1) {
						counter += 2;
					}else if (arr[i].equals(letters[k][j]) && k == 2) {
						counter += 3;
					}else if (arr[i].equals(letters[k][j]) && k == 3) {
						counter += 4;
					}else if (arr[i].equals(letters[k][j]) && k == 4) {
						counter += 5;
					}else if (arr[i].equals(letters[k][j]) && k == 5) {
						counter += 8;
					}else if (arr[i].equals(letters[k][j]) && k == 6) {
						counter += 10;
					}
				
				}
			}
		}
		return counter;
	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
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
		String regex = "\\s+|-+|\\.+|\\(+|\\)+|\\++";
		String regexTwo = "[0-9]";
		String correctPhone = string.replaceAll(regex,"");
		
		String arr[] = correctPhone.split("");
		
		for (int k = 0; k < arr.length; k++) {
			if (!arr[k].matches(regexTwo)) {
				throw new IllegalArgumentException("Only Numbers");
			}
		}
		
		List<String> numbers = new ArrayList<String>();
		
		 if (arr.length == 11) {
			for (int i = 1; i < arr.length; i++) {
				numbers.add(arr[i]);
			}
		}else if (arr.length == 10){
			for (int j = 0; j < arr.length; j++) {
				numbers.add(arr[j]);
			}
		}else {
			throw new IllegalArgumentException("Number too long or too short");
		}
		return (String.join("", numbers));
		
	}
	

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		
HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		// Use Regular Expressions to adjust for conditions
		String newString = string.replaceAll("\\,+", " ").replaceAll("\\n+", "");
		
		// Create Arrays to iterate through
		String arr[] = newString.split(" ");
		int counter[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].matches(arr[j])) {
					counter[i]++;
				}
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			for (int d = 1; d < arr.length; d++) {
			if (counter[k] == d) {
				wordCount.put(arr[k], d);		
			
			}
		
			}
			wordCount.put(arr[0], 1);
		
		}	
	return (wordCount);
	
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
String strInput = Integer.toString(input);
		
		String[] arr = strInput.split("");
		
		int exponent = arr.length;
		
		int newArr[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = (int) Math.pow(Integer.parseInt(arr[i]), exponent);
		}
		
		int armstrongCheck = 0;
		
		for (int j = 0; j < newArr.length; j++) {
			armstrongCheck += newArr[j];
		}
		
		return (armstrongCheck == input);
		
		
		
		}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		
		// I am sorry this code is so bad looking. I am still thinking of ways
		// to revise it.
		long copy = l;
		
		List<Long> arr = new ArrayList<Long>();
		List<Long> arrTwo = new ArrayList<Long>();
		
		while (copy > 0) {
			arr.add(copy);
			copy--;
		}
		
		for (Long n : arr) {
			if (l % n == 0) {
				arrTwo.add(n);
			}
		}
		
		
		long[] counter = new long[arrTwo.size()];
		
		
		for (int i = 0; i < arrTwo.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (arrTwo.get(i) % arr.get(j) == 0) {
					counter[i]++;
					
				}
			}
		}
		
		List<Long> arrThree = new ArrayList<Long>();
		
		for (int k = 0; k < arrTwo.size(); k++) {
			if (counter[k] == 2) {
				arrThree.add(arrTwo.get(k));
			}
		}
		
		List<Long> arrFour = new ArrayList<Long>();
		

		int g = arrThree.size() - 1;
		
		while (l != 1 && g >= 0) {
			arrFour.add(arrThree.get(g));
			l = l / arrThree.get(g);
			if (l % arrThree.get(g) != 0) {
			g--;
			
			}			
			}
	
		return arrFour;
		
	
	}
	

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		
		int b = 2;
		int counter;
		
		List<Integer> arr = new ArrayList<Integer>();
		
		if (k <= 0) {
			throw new IllegalArgumentException("Must be greater than zero");
		}
		
		while (arr.size() < k) {
			counter = 0;
			for (int i = 2; i <= b/2; i++) {
				if (b % i == 0) {
					counter = 1;
					
				} 
				
			}
			if (counter == 0) {
				arr.add(b);
				
			}
			b++;
			}
		
		return (arr.get(arr.size() - 1));
		}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		
		int counter = 0;
		String[] alphabet = {
				"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"
				};
		
		
		for (int i = 0; i < alphabet.length; i++) {
			if (string.indexOf(alphabet[i]) < 0) {
				counter++;
			}
		}
		
		return(counter == 0);
		
	

	}

	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {
		List<Integer> arr = new ArrayList<Integer>();
		
		
		for (int j = 0; j < set.length; j++) {
			int c = 0;
			for (int k = 1; k < i; k++) {
				c = (set[j] * k);
				if (c < i && arr.indexOf(c) < 0) {	
					arr.add(c);		
				}
			}
		}
		int total = 0;
		
		for (int a = 0; a < arr.size(); a++) {
			total += arr.get(a);		
			}
		
		return (total);
	}
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		Random magicNumber = new Random(); 
        
        int[] slotArray = new int[3];
        
        for (int i = 0; i < slotArray.length; i++) {
        	if (slotArray[i] == 0) {
        		slotArray[i] = magicNumber.nextInt(100);
        	}
        }
        
        return slotArray;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
Random randomize = new Random();
		
		int randNum = randomize.nextInt(y);
		
		int c = 0;
	
		if (randNum >= x) {
				c = randNum;
				
		}else {
				c = randNum + x;
		}
		
		return (c);
		}
		}

