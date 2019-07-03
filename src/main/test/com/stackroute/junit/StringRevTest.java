package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class StringRevTest
{
    StringRev sr;

    @Before
    public void setUp() {
        sr=new StringRev();
    }

    @After
    public void tearDown() {
        sr=null;
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
    public void testForOdd()
    {
        String t=sr.reverse("pooh");
        assertEquals(" hoop",t);
    }

}