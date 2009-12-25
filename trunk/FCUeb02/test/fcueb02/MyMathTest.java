/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fcueb02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tim
 */
public class MyMathTest {

    public MyMathTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of factorial method, of class MyMath.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int a = 4;
        int expResult = 24;
        int result = MyMath.factorial(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of binCoeff method, of class MyMath.
     */
    @Test
    public void testBinCoeff() {
        System.out.println("binCoeff");
        int n = 7;
        int k = 5;
        int expResult = 21;
        int result = MyMath.binCoeff(n, k);
        assertEquals(expResult, result);
    }
}