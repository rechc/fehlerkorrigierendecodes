/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fcueb02;

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
        BitMatrix2D bm = new BitMatrix2D("100\n010\n001");
        BitMatrix2D instance = new BitMatrix2D("0111\n1011\n1101");
        BitMatrix2D expResult = new BitMatrix2D("0111100\n1011010\n1101001");
        BitMatrix2D result = instance.concat(bm);
        assertEquals(expResult, result);
    }

    /**
     * Test of transpose method, of class BitMatrix2D.
     */
    @Test
    public void testTranspose() {
        System.out.println("transpose");
        BitMatrix2D instance = new BitMatrix2D("101\n111\n100");
        BitMatrix2D expResult = new BitMatrix2D("111\n010\n110");
        BitMatrix2D result = instance.transpose();
        assertEquals(expResult, result);
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

    /**
     * Test of equals method, of class BitMatrix2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new BitMatrix2D("1011\n1101\n1011");
        BitMatrix2D instance = new BitMatrix2D("1011\n1101\n1011");
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        o = new BitMatrix2D("101");
        instance = new BitMatrix2D("101");
        result = instance.equals(o);
       assertEquals(result, expResult);
    }

    /**
     * Test of createBinVector method, of class BitMatrix2D.
     */
    @Test
    public void testCreateBinVector() {
        System.out.println("createBinVector");
        int number = 7;
        int bitLength = 3;
        BitMatrix2D instance = BitMatrix2D.createBinVector(number, bitLength);
        BitMatrix2D expResult = new BitMatrix2D("111");
        BitMatrix2D result = instance.createBinVector(number, bitLength);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class BitMatrix2D.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BitMatrix2D instance = new BitMatrix2D("1");
        int expResult = 1478;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of createErrorVector method, of class BitMatrix2D.
     */
    @Test
    public void testCreateErrorVector() {
        System.out.println("createErrorVector");
        int bitPos = 2;
        int bitLength = 4;
        BitMatrix2D expResult = new BitMatrix2D("0010");
        BitMatrix2D result = BitMatrix2D.createErrorVector(bitPos, bitLength);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNullVector method, of class BitMatrix2D.
     */
    @Test
    public void testIsNullVektor() {
        System.out.println("isNullVektor");
        BitMatrix2D instance = new BitMatrix2D("0000");
        boolean expResult = true;
        boolean result = instance.isNullVector();
        assertEquals(expResult, result);
        instance = new BitMatrix2D("0\n0\n0\n0");
        expResult = true;
        result = instance.isNullVector();
        assertEquals(expResult, result);
    }

    /**
     * Test of subMatrix method, of class BitMatrix2D.
     */
    @Test
    public void testSubMatrix() {
        System.out.println("subMatrix");
        int beginR = 0;
        int beginL = 4;
        int endR = 3;
        int endL = 6;
        BitMatrix2D instance = new BitMatrix2D("1000011\n0100101\n0010110\n0001111");
        BitMatrix2D expResult = new BitMatrix2D("011\n101\n110\n111");
        BitMatrix2D result = instance.subMatrix(beginR, beginL, endR, endL);
        assertEquals(expResult, result);
    }
}