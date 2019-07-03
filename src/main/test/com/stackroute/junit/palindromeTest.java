package com.stackroute.junit;

import org.junit.*;
//import java.com.stackroute.junit.palindrome;

//mport com.stackroute.junit.palindrome;

import static org.junit.Assert.*;

public class palindromeTest
{
    palindrome p;

    @Before
    public void setUp() {
        p=new palindrome();
    }

    @After
    public void tearDown() {
        p=null;
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
    public void testForSumLessThan25()
    {
        String t=p. checkpalindrome(121);
        assertEquals("is a palindrome and the sum is not greater than 25",t);
    }
    @Test
    public void testForSumGreaterThan25()
    {
        String t=p. checkpalindrome(2468642);
        assertEquals("is a palindrome and the sum is greater than 25",t);
    }
    @Test
    public void testForNotPalindrome()
    {
        String t=p. checkpalindrome(12345);
        assertEquals("is not a palindrome",t);
    }

}