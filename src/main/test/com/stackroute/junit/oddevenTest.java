package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;
//import java.com.stackroute.junit.oddeven;

public class oddevenTest
{
    oddeven eo;

    @Before
    public void setUp()  {
        eo=new oddeven();
    }

    @After
    public void tearDown()  {
        eo=null;
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
    public void testForEven()
    {
        String t=eo.oddevencheck(22);
        assertEquals("Jerry",t);
    }
    @Test
    public void testForOdd()
    {
        String t=eo.oddevencheck(27);
        assertEquals("Tom",t);
    }
    @Test
    public void testForNumberInTheRange()
    {
        String t=eo.oddevencheck(58);
        assertEquals("Error",t);
    }

}