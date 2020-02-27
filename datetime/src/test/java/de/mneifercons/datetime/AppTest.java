package de.mneifercons.datetime;

/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */

import java.time.Duration;
import java.time.Instant;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests in this class are not really tests but usage examples for the Java 8 date / time API.
 */
public class AppTest extends TestCase
{
    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testDuration()
    {
        Instant start = Instant.parse("2020-02-05T10:47:54.526Z");
        Instant end   = Instant.parse("2020-02-05T10:49:25.446Z");
        long durationMillis = Duration.between(start, end).toMillis();
        System.out.println(String.format("Duration in seconds: %f", (double)durationMillis / 1000.0d));
        assertEquals(90920, durationMillis);
    }
}
