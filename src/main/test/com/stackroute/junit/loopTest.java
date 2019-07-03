package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import java.com.stackroute.junit.loop;

public class loopTest {

    loop loopobj;
    @Before
    public void setUp() throws Exception
    {
         loopobj= new loop();
    }

    @After
    public void tearDown() throws Exception
    {
        loopobj=null;
    }
    @Test
    public void testForPattern()
    {
        String t=loopobj.print(3);
        assertEquals("122333",t);
    }

    @Test
    public void testForPatternWhenACharecterIsGiven() {
        String t=loopobj.print('A');
        assertEquals("Error",t);
    }



}