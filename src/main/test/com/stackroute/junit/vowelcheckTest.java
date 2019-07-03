package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class vowelcheckTest {

    vowelcheck ch;
    @Before
    public void setUp() throws Exception
    {
        ch = new vowelcheck();
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }


    @Test
    public void testForVowel()
    {
        String s = ch.check("stack");
        assertEquals("ccvcc",s);

    }
    @Test
    public void testForConsonant()
    {
        String s = ch.check("route");
        assertEquals("cvvcv",s);
    }
    @After
    public void tearDown() throws Exception
    {
        ch= null;
    }

}