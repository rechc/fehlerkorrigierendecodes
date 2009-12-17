/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fcueb02;

/**
 *
 * @author tim
 */
public class BlockCode {

    BitMatrix2D generator;
    BitMatrix2D korrektur;
    BitMatrix2D[] syndroms1Bit;
    BitMatrix2D[] sysndroms2Bit;
    int hemmingdist;

    public BlockCode(String generatorMatrix) {
        generator = new BitMatrix2D(generatorMatrix);
        korrektur = calcKorrektur();
        syndroms1Bit = calcSyndroms1Bit();
        syndroms1Bit = calcSyndroms2Bit();
        hemmingdist = calcHemmingdistance();
    }

    public String checkWord(String word) {
        //TODO implement
        return null;
    }
}
