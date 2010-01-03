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

    @Test
    public void testCorrectWord(){
        System.out.println("correctWord");
        BlockCode instance = new BlockCode("1000011\n0100101\n0010110\n0001111");
        String result = instance.correctWord("1101010");
        String expResult = "0101010";
        assertEquals(expResult, result);
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

    /**
     * Test of checkWord method, of class BlockCode.
     */
    @Test
    public void testCheckWord() {
        System.out.println("checkWord");
        BitMatrix2D result_2 = null;
        BlockCode instance = new BlockCode();
        boolean expResult = false;
        boolean result = instance.checkWord(result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcCodewords method, of class BlockCode.
     */
    @Test
    public void testCalcCodewords() {
        System.out.println("calcCodewords");
        BlockCode instance = new BlockCode("1000011\n0100101\n0010110\n0001111");
        BitMatrix2D[] expResult = { new BitMatrix2D("0000000"),
                                new BitMatrix2D("0000000"),
                                new BitMatrix2D("0001111"),
                                new BitMatrix2D("0010110"),
                                new BitMatrix2D("0011001"),
                                new BitMatrix2D("0101010"),
                                new BitMatrix2D("0110011"),
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("1010101"),
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("0000000"),//<-- muss noch berechnet werden
                                new BitMatrix2D("1111111")};
        BitMatrix2D[] result = instance.calcCodewords();
        assertTrue(expResult.length == result.length);
        for(int i=0; i < expResult.length;i++)
            assertEquals(expResult[i],result[i]);
    }

    /**
     * Test of getMinHemmingDist method, of class BlockCode.
     */
    @Test
    public void testGetMinHemmingDist() {
        System.out.println("getMinHemmingDist");
        BlockCode instance = new BlockCode("1000011\n0100101\n0010110\n0001111");
        int expResult = 4711; // 4711 is fakewert
        int result = instance.getMinHemmingDist();
        assertEquals(expResult, result);
    }
}