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
public class BlockCodeTest {

    public BlockCodeTest() {
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
     * Test of checkWord method, of class BlockCode.
     */
    @Test
    public void testCheckWord() {
        System.out.println("checkWord");
        String word = "";
        BlockCode instance = null;
        String expResult = "";
        String result = instance.checkWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcHMat method, of class BlockCode.
     */
    @Test
    public void testCalcHMat() {
        System.out.println("calcHMat");
        BitMatrix2D gMat = new BitMatrix2D("1000011\n0100101\n0010110\n0001111");
        BitMatrix2D expResult = new BitMatrix2D("0111100\n1011010\n1101001");
        BitMatrix2D result = BlockCode.calcHMat(gMat);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcSyndroms1Bit method, of class BlockCode.
     */
    @Test
    public void testCalcSyndroms1Bit() {
        System.out.println("calcSyndroms1Bit");
        BitMatrix2D hMat = new BitMatrix2D("0111100\n1011010\n1101001");
        BitMatrix2D[] expResult = { new BitMatrix2D("011"),
                                    new BitMatrix2D("101"),
                                    new BitMatrix2D("110"),
                                    new BitMatrix2D("111"),
                                    new BitMatrix2D("100"),
                                    new BitMatrix2D("010"),
                                    new BitMatrix2D("001")};
        BitMatrix2D[] result = BlockCode.calcSyndroms1Bit(hMat);
        assertTrue(expResult.length == result.length);
        for(int i=0; i<expResult.length;i++)
            assertEquals(expResult[i],result[i]);
    }

    /**
     * Test of calcSyndroms2Bit method, of class BlockCode.
     */
    @Test
    public void testCalcSyndroms2Bit() {
        System.out.println("calcSyndroms2Bit");
        BitMatrix2D hMat = new BitMatrix2D("0111100\n1011010\n1101001");
        BitMatrix2D[] expResult = { new BitMatrix2D("110"),
                                    new BitMatrix2D("101"),
                                    new BitMatrix2D("100"),
                                    new BitMatrix2D("111"),
                                    new BitMatrix2D("001"),
                                    new BitMatrix2D("010"),

                                    new BitMatrix2D("011"),
                                    new BitMatrix2D("010"),
                                    new BitMatrix2D("001"),
                                    new BitMatrix2D("111"),
                                    new BitMatrix2D("100"),

                                    new BitMatrix2D("001"),
                                    new BitMatrix2D("010"),
                                    new BitMatrix2D("100"),
                                    new BitMatrix2D("111"),

                                    new BitMatrix2D("011"),
                                    new BitMatrix2D("101"),
                                    new BitMatrix2D("110"),

                                    new BitMatrix2D("110"),
                                    new BitMatrix2D("101"),

                                    new BitMatrix2D("011")};
        BitMatrix2D[] result = BlockCode.calcSyndroms2Bit(hMat);
        assertTrue(expResult.length == result.length);
        for(int i=0; i<expResult.length;i++)
            assertEquals(expResult[i],result[i]);
    }
}