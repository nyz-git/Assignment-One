package com.assignment.one.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.assignment.one.Assignment1;

public class AssignmentOneTestCases {

	static Assignment1 assignment1;

	@BeforeClass
	public static void init() {
		assignment1 = new Assignment1();
	}

	@Test
	public void ascendingSorting() {
		int sorted = assignment1.sort(7637);
		assertEquals(3677, sorted);
	}

	@Test
	public void sumOfEven() {
		int even = assignment1.sumOfEvenNumber("12564");
		assertEquals(12, even);
	}

	@Test
	public void sumOfOdd() {
		int odd = assignment1.sumOfOddNumber("12564");
		assertEquals(6, odd);
	}

	@Test
	public void spacesInNumber(){
		String result = assignment1.spacesInBetweenNumber(2345);
		assertEquals("2   3   4   5", result);
	}
}
