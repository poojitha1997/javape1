package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class StringRepeatTest {

    StringRepeat strrep;
    @Before
    public void setUp() throws Exception
    {
        strrep= new StringRepeat();

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


    @After
    public void tearDown() throws Exception {
        strrep = null;
    }

    @Test
    public void testForRepeat()
    {
        String s = strrep.repeat("stack",2);
        assertEquals("stackck",s);
    }
    @Test
    public void testForNumber()
    {
        String s = strrep.repeat("123",3);
        assertEquals("it is a number",s);
    }

}