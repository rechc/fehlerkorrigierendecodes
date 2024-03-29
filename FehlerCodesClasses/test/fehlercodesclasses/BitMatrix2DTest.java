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
        BitMatrix2D bm = new BitMatrix2D("1000\n0100\n0010\n0001");
        BitMatrix2D instance = new BitMatrix2D("101\n110\n001\n011");
        BitMatrix2D expResult = new BitMatrix2D("1011000\n1100100\n0010010\n0110001");
        BitMatrix2D result = instance.concat(bm);
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateEinheitsmatrix(){
        System.out.println("createEinheitsMatrix");
        BitMatrix2D instance = new BitMatrix2D("1000\n0100\n0010\n0001");
        BitMatrix2D expResult = new BitMatrix2D("1000\n0100\n0010\n0001");
        BitMatrix2D result = instance.createEinheitsMatrix(instance.getROWS());
        assertEquals(expResult, result);
    }

    @Test
    public void testCreateKontrollMatrix(){
        System.out.println("createKontrollMatrix");
        BitMatrix2D generatorMatrix = new BitMatrix2D("1001101\n0101010\n0010010");
        BitMatrix2D expResult = new BitMatrix2D("1101000\n1000100\n0110010\n1000001");
        BitMatrix2D result =  generatorMatrix.createKontrollmatrix();
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
}