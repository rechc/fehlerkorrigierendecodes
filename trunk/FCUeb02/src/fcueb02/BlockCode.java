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

    BitMatrix2D gMat;
    BitMatrix2D hMat;
    BitMatrix2D[] syndroms1Bit;
    BitMatrix2D[] sysndroms2Bit;
    int hemmingdist;

    public BlockCode(String generatorMatrix) {
        gMat = new BitMatrix2D(generatorMatrix);
        hMat = calcHMat(this.gMat);
        syndroms1Bit = calcSyndroms1Bit(this.hMat);
        syndroms1Bit = calcSyndroms2Bit();
        hemmingdist = calcHemmingdistance();
    }

    public String checkWord(String word) {
        //TODO implement
        return null;
    }

    public static BitMatrix2D calcHMat(BitMatrix2D gMat) {
        BitMatrix2D matA = gMat.subMatrix(0, gMat.getROWS(), gMat.getROWS()-1, gMat.getCOLUMNS()-1);
        matA = matA.transpose();
        BitMatrix2D matB = new BitMatrix2D(matA.getROWS());
        return matA.concat(matB);
    }

    public static BitMatrix2D[] calcSyndroms1Bit(BitMatrix2D hMat) {
        BitMatrix2D[] syndroms = new BitMatrix2D[hMat.getCOLUMNS()];
        boolean[][] eVector = new boolean[hMat.getCOLUMNS()][1];
        for(int i=0; i<hMat.getCOLUMNS();i++){
            eVector[i][0] = true;
            syndroms[i] = hMat.multiplyWith(new BitMatrix2D(eVector));
            eVector[i][0] = false;
        }
        return syndroms;
    }

    private BitMatrix2D[] calcSyndroms2Bit() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private int calcHemmingdistance() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
