/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fehlercodesclasses;

import java.util.Arrays;
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
public class BitMatrix2DTest {

    public BitMatrix2DTest() {
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
     * Test of multiplyWith method, of class BitMatrix2D.
     */
    @Test
    public void testMultiplyWith() {
        System.out.println("multiplyWith");
        BitMatrix2D multiMatrix = new BitMatrix2D("101\n111\n011");
        BitMatrix2D instance = new BitMatrix2D("110");
        BitMatrix2D expResult = new BitMatrix2D("010");
        BitMatrix2D result = instance.multiplyWith(multiMatrix);
        assertEquals(expResult, result);
    }

    /**
     * Test of concat method, of class BitMatrix2D.
     */
    @Test
    public void testConcat() {
        System.out.println("concat");
        BitMatrix2D m2 = null;
        BitMatrix2D instance = null;
        BitMatrix2D expResult = null;
        BitMatrix2D result = instance.concat(m2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transpose method, of class BitMatrix2D.
     */
    @Test
    public void testTranspose() {
        System.out.println("transpose");
        BitMatrix2D instance = null;
        BitMatrix2D expResult = null;
        BitMatrix2D result = instance.transpose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incVector method, of class BitMatrix2D.
     */
    @Test
    public void testIncVector() {
        System.out.println("incVector");
        boolean[] vector = {false,true,false};
        BitMatrix2D instance = new BitMatrix2D("100");
        boolean[] expResult = {false,true,true};
        boolean[] result = instance.incVector(vector);
        assertTrue(Arrays.equals(expResult, result));
    }

    /**
     * Test of toString method, of class BitMatrix2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BitMatrix2D instance = new BitMatrix2D("101\n111\n001");
        String expResult = "1,0,1\n1,1,1\n0,0,1";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCOLUMNS method, of class BitMatrix2D.
     */
    @Test
    public void testGetCOLUMNS() {
        System.out.println("getCOLUMNS");
        BitMatrix2D instance = new BitMatrix2D("10011\n11011");
        int expResult = 5;
        int result = instance.getCOLUMNS();
        assertEquals(expResult, result);
    }

    /**
     * Test of getROWS method, of class BitMatrix2D.
     */
    @Test
    public void testGetROWS() {
        System.out.println("getROWS");
        BitMatrix2D instance = new BitMatrix2D("10\n01\n11\n00");
        int expResult = 4;
        int result = instance.getROWS();
        assertEquals(expResult, result);
    }

}