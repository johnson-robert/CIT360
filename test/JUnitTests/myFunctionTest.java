/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class myFunctionTest {
    
    public myFunctionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMyFunction1() {
        System.out.println("Hello, Harry.");
        System.out.println("It's your func!");
        System.out.println("This test should pass." + "\n");
        int a = 4;
        myFunction instance = new myFunction();
        int expResult = 1;
        int result = instance.func(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMyFunction2() {
        System.out.println("Hello, Harry.");
        System.out.println("Again, it's your func!");
        System.out.println("This test should pass." + "\n");
        int a = 0;
        myFunction instance = new myFunction();
        int expResult = 8;
        int result = instance.func(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMyFunction3() {
        System.out.println("Hello, Harry.");
        System.out.println("Yet again, it's your func!");
        System.out.println("This test should fail." + "\n");
        int a = 0;
        myFunction instance = new myFunction();
        int expResult = 7;
        int result = instance.func(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
