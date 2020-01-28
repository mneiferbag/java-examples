package com.example;

import java.util.StringJoiner;

/**
 * Technical Screening Exercise - Step 1.
 */
public class App {

    /**
     * Application entry point.
     *
     * @param args the command line arguments, two integers expected
     */
    public static void main(String[] args) {
	int start = Integer.parseInt(args[0]);
	int end = Integer.parseInt(args[1]);
	App app = new App();
	String string = app.getStringForRange(start, end);

	System.out.println(string);
    }

    /**
     * Get fizzbuzz words for range of integers.
     *
     * @param start the integer to start the range (inclusive)
     * @param end the integer to end the range (inclusive)
     * @return the string of fizzbuzz words for the range
     */
    public String getStringForRange(int start, int end) {
	StringJoiner sj = new StringJoiner(" ");

	for (int i = start; i <= end; ++i) {
	    sj.add(getStringForNumber(i));
	}
	return sj.toString();
    }

    /**
     * Get fizzbuzz word for single integer.
     *
     * @param number the integer to convert
     * @return the fizzbuzz word for the integer
     */
    public String getStringForNumber(int number) {
	if (number == 0) {
	    return "0";
	} else if (number % 15 == 0) {
	    return "fizzbuzz";
	} else if (number % 5 == 0) {
	    return "buzz";
	} else if (number % 3 == 0) {
	    return "fizz";
	}
	return Integer.toString(number);
    }
}
