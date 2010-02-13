/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fcueb03;

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
public class PolynomialTest {

    public PolynomialTest() {
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
     * Test of isCodeWordOf method, of class Polynomial.
     */
    @Test
    public void testIsCodeWordOf() {
        System.out.println("isCodeWordOf");
        Polynomial g = new Polynomial("1011");
        Polynomial instance = new Polynomial("11101");
        boolean expResult = true;
        boolean result = instance.isCodeWordOf(g);
        assertEquals(expResult, result);
        g = new Polynomial("001011");
        instance = new Polynomial("100100");
        expResult = false;
        result = instance.isCodeWordOf(g);
        assertEquals(expResult, result);
        g = new Polynomial("110101");
        instance = new Polynomial("1101100101");
        expResult = true;
        result = instance.isCodeWordOf(g);
        assertEquals(expResult, result);

    }

}