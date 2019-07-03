package com.stackroute.junit;
//import java.com.stackroute.junit;



import org.junit.*;

import static junit.framework.TestCase.assertEquals;


public class AddNumbersTest {

    AddNumbers loop;
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
        loop=new AddNumbers();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        loop=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");

    }
    @Test
    public void givenNumberShouldDisplayLoop() {
        String result= loop.printLoop(2);
        assertEquals("122",result);

    }
    @Test
    public void givenNumberShouldDisplay() {
        String result= loop.printLoop(5);
        assertEquals("122333444455555",result);

    }

}