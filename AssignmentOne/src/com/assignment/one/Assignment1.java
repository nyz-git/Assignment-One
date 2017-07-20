package com.assignment.one;

public class Assignment1 {
	public int sort(int number) {
		// TODO Auto-generated method stub
		int sorted = 1;
		int digits = 10;
		int sortedDigits = 1;
		boolean first = true;

		while (number > 0) {
			int digit = number % 10;

			if (!first) {

				int tmp = sorted;
				int toDivide = 1;
				for (int i = 0; i < sortedDigits; i++) {
					int tmpDigit = tmp % 10;
					if (digit >= tmpDigit) {
						sorted = sorted / toDivide * toDivide * 10 + digit * toDivide + sorted % toDivide;
						break;
					} else if (i == sortedDigits - 1) {
						sorted = digit * digits + sorted;
					}
					tmp /= 10;
					toDivide *= 10;
				}
				digits *= 10;
				sortedDigits += 1;
			} else {
				sorted = digit;
			}

			first = false;
			number = number / 10;
		}
		// System.out.println(sorted);
		return sorted;
	}

	public static int sumOfEvenNumber(String num) {
		String stringNumber = num;

		// Find the length of String
		int length = stringNumber.length();

		// Convert data type String into int
		int number = Integer.parseInt(stringNumber);

		int mod; // Modulus
		int odd = 0, even = 0;

		for (int i = 0; i < length; i++) {
			// Separates each digit from given number
			mod = number % 10;
			number = number / 10;

			if (mod % 2 == 0) { // Determines if the number is odd or even
				even = even + mod; // Addition of even numbers
			}
		}
		return even;
	}

	public static int sumOfOddNumber(String num) {
		String stringNumber = num;

		// Find the length of String
		int length = stringNumber.length();

		// Convert data type String into int
		int number = Integer.parseInt(stringNumber);

		int mod; // Modulus
		int odd = 0, even = 0;

		for (int i = 0; i < length; i++) {
			// Separates each digit from given number
			mod = number % 10;
			number = number / 10;

			if (mod % 2 != 0) { // Determines if the number is odd or even
				odd = odd + mod; // Addition of odd numbers
			}
		}
		return odd;

	}
}
