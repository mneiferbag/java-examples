/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */
package de.mneifercons.examples.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RegExpTest extends TestCase {

    public RegExpTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(RegExpTest.class);
    }

    public void testContains() {
        Pattern pattern = Pattern.compile(".*cheese.*");
        Matcher matcher = pattern.matcher("I like cheese, not!");

        assertTrue(matcher.matches());
    }

    public void testPatternMatches() {
        assertTrue("start", Pattern.matches(".*cheese.*", "want cheese"));
        assertTrue("end",   Pattern.matches(".*cheese.*", "cheese I want"));
    }

}
