/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

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
public class myOtherFuncTest {
    
    public myOtherFuncTest() {
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

    /**
     * Test of func1 method, of class myOtherFunc.
     */
    @Test
    public void testFunc1_1() {
        System.out.println("func1");
        int a = 0;
        myOtherFunc instance = new myOtherFunc();
        int expResult = 8;
        int result = instance.func1(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of func1 method, of class myOtherFunc.
     */
    @Test
    public void testFunc1_2() {
        System.out.println("func1");
        int a = 4;
        myOtherFunc instance = new myOtherFunc();
        int expResult = 1;
        int result = instance.func1(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of func2 method, of class myOtherFunc.
     */
    @Test
    public void testFunc2_1() {
        System.out.println("func2");
        String letter = "a";
        myOtherFunc instance = new myOtherFunc();
        int expResult = 1;
        int result = instance.func2(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of func2 method, of class myOtherFunc.
     */
    @Test
    public void testFunc2_2() {
        System.out.println("func2");
        String letter = "b";
        myOtherFunc instance = new myOtherFunc();
        int expResult = 2;
        int result = instance.func2(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
         /**
     * Test of func2 method, of class myOtherFunc.
     */
    @Test
    public void testFunc2_3() {
        System.out.println("func2");
        String letter = "z";
        myOtherFunc instance = new myOtherFunc();
        int expResult = 26;
        int result = instance.func2(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of func3 method, of class myOtherFunc.
     */
    @Test
    public void testFunc3_1() {
        System.out.println("func3");
        myOtherFunc instance = new myOtherFunc();
        int expResult = 4;
        int result = instance.func3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
