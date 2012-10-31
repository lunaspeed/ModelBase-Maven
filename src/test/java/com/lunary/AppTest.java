package com.lunary;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.lunary.util.StringUtil;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
      
      String csv = "123,466,abc,,,,";
      String[] values = StringUtil.split(csv, ',');
      assertTrue(Arrays.equals(values, new String[] {"123", "466", "abc", "", "", "", ""}));
    }
}
