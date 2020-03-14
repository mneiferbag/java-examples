package de.mneifercons.regexp;

/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testSimple() {
        Pattern pattern = Pattern.compile(".*cheese.*");
        Matcher matcher = pattern.matcher("I like cheese, not!");

        assertTrue(matcher.matches());
    }

}
