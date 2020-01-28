package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for fizz buzz programming exercise.
 *
 * TODO: add test for range with end < start.
 */
public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testStringForRange_2_16() {
	App app = new App();
	String string = app.getStringForRange(2, 16);

        assertEquals("2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16",
		     string);
    }

    public void testStringForRange_minus3_minus1() {
	App app = new App();
	String string = app.getStringForRange(-3, -1);

        assertEquals("fizz -2 -1", string);
    }

    public void testStringForSingleNumbers() {
	App app = new App();
        assertEquals("-16",      app.getStringForNumber(-16));
        assertEquals("fizzbuzz", app.getStringForNumber(-15));
        assertEquals("buzz",     app.getStringForNumber(-5));
        assertEquals("fizz",     app.getStringForNumber(-3));
        assertEquals("-1",       app.getStringForNumber(-1));
        assertEquals("0",        app.getStringForNumber(0));
        assertEquals("1",        app.getStringForNumber(1));
        assertEquals("fizz",     app.getStringForNumber(3));
        assertEquals("buzz",     app.getStringForNumber(5));
        assertEquals("fizzbuzz", app.getStringForNumber(15));
        assertEquals("16",       app.getStringForNumber(16));
    }
}
