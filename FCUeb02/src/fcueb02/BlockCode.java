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
    BitMatrix2D[] syndroms2Bit;
    int hemmingdist;

    public BlockCode(String generatorMatrix) {
        gMat = new BitMatrix2D(generatorMatrix);
        hMat = calcHMat(this.gMat);
        syndroms1Bit = calcSyndroms1Bit(this.hMat);
        syndroms2Bit = calcSyndroms2Bit(this.hMat);
        hemmingdist = calcHemmingdistance();
    }

    public String checkWord(String word) {
        //TODO implement
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static BitMatrix2D calcHMat(BitMatrix2D gMat) {
        BitMatrix2D matA = gMat.subMatrix(0, gMat.getROWS(), gMat.getROWS()-1, gMat.getCOLUMNS()-1);
        matA = matA.transpose();
        BitMatrix2D matB = new BitMatrix2D(matA.getROWS());
        return matA.concat(matB);
    }

    public static BitMatrix2D[] calcSyndroms1Bit(BitMatrix2D hMat) {
        final int ROWS = hMat.getROWS();
        final int COLS = hMat.getCOLUMNS();
        BitMatrix2D[] syndroms = new BitMatrix2D[COLS];
        for (int i = 0; i < COLS; i++) {
            syndroms[i] = hMat.subMatrix(0, i, ROWS-1, i).transpose();
        }
        return syndroms;
    }

    public static BitMatrix2D[] calcSyndroms2Bit(BitMatrix2D hMat) {
        final int COLS = hMat.getCOLUMNS();
        BitMatrix2D[] syndroms = new BitMatrix2D[MyMath.binCoeff(COLS, 2)];
        boolean[][] eVec = new boolean[COLS][1];
        BitMatrix2D eMat;
        int n=0;
        for (int i = 0; i < COLS; i++) {
            for (int j = i+1; j < COLS; j++) {
                eVec[i][0] = true;
                eVec[j][0] = true;
                eMat = new BitMatrix2D(eVec);
                syndroms[n++] = hMat.multiplyWith(eMat).transpose();
                eVec[i][0] = false;
                eVec[j][0] = false;
            }
        }
        return syndroms;
    }

    private int calcHemmingdistance() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
