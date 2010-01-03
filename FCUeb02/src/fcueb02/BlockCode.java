package fcueb02;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian Rech, Tim Bartsch
 */
public class BlockCode {

    BitMatrix2D gMat;
    BitMatrix2D hMat;
    BitMatrix2D[] syndroms1Bit;
    BitMatrix2D[] syndroms2Bit;
    BitMatrix2D[] codewords;
    int minHemmingDist;

    public BlockCode(String generatorMatrix) {
        gMat = new BitMatrix2D(generatorMatrix);
        hMat = calcHMat(this.gMat);
        codewords = calcCodewords();
        syndroms1Bit = calcSyndroms1Bit(this.hMat);
        syndroms2Bit = calcSyndroms2Bit(this.hMat);
        minHemmingDist = calcMinHemmingDistance();
    }

    public BlockCode() {}

    /**
     * Überprüft ob word korrekt ist und nimmt falls nicht, eine
     * (1bit) fehlerkorrektur vor.
     */
    public String correctWord(String word) {
        BitMatrix2D syndroms[];

        BitMatrix2D checkWord = new BitMatrix2D(word);
        BitMatrix2D result = hMat.multiplyWith(checkWord.transpose());

        if (!this.checkWord(result)) {
            syndroms = calcSyndroms1Bit(hMat);

            for (int i = 0; i < syndroms.length; i++) {
                if (syndroms[i].equals(result.transpose())) {
                    checkWord.changeBit(i);
                    return checkWord.toString();
                }
            }
        }
        return null; //bei toString passiert nichts, weil Wert hier null ist
    }

    public boolean checkWord(BitMatrix2D result) {
        return result.isNullVector();
    }

    /**
     * Berechnet Kontrollmatrix von gMat
     */
    public static BitMatrix2D calcHMat(BitMatrix2D gMat) {
        BitMatrix2D matA = gMat.subMatrix(0, gMat.getROWS(), gMat.getROWS() - 1, gMat.getCOLUMNS() - 1);
        matA = matA.transpose();
        BitMatrix2D matB = new BitMatrix2D(matA.getROWS());
        return matA.concat(matB);
    }

    /**
     * Berechnet die Codewoerter zu einer Generatormatrix
     * @return
     */
    public BitMatrix2D[] calcCodewords() {
        final int ROWS = gMat.getROWS();
        final int COLS = gMat.getCOLUMNS();
        BitMatrix2D[] result = new BitMatrix2D[COLS];

        for (int i = 0; i < 15; i++) {
            BitMatrix2D bm = BitMatrix2D.createBinVector(i, ROWS);
            result[i] = bm.multiplyWith(gMat);
            System.out.println(result[i]);
        }

        return result;
    }

    /**
     * Berechnet alle 1bit syndrome von hMat
     * @param hMat
     * @return
     */
    public static BitMatrix2D[] calcSyndroms1Bit(BitMatrix2D hMat) {
        final int ROWS = hMat.getROWS();
        final int COLS = hMat.getCOLUMNS();
        BitMatrix2D[] syndroms = new BitMatrix2D[COLS];
        for (int i = 0; i < COLS; i++) {
            syndroms[i] = hMat.subMatrix(0, i, ROWS - 1, i).transpose();
        }
        return syndroms;
    }

    /**
     * Berechnet alle 2bit syndrome von hMat
     * @param hMat
     * @return
     */
    public static BitMatrix2D[] calcSyndroms2Bit(BitMatrix2D hMat) {
        final int COLS = hMat.getCOLUMNS();
        BitMatrix2D[] syndroms = new BitMatrix2D[MyMath.binCoeff(COLS, 2)];
        boolean[][] eVec = new boolean[COLS][1];
        BitMatrix2D eMat;
        int n = 0;
        for (int i = 0; i < COLS; i++) {
            for (int j = i + 1; j < COLS; j++) {
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

    /**
     * Berechnet die minimale Hemmingdistanz
     * @return
     */
    private int calcMinHemmingDistance() {
        int minDist = codewords[0].getCOLUMNS();
        int currentDist = 0;
        for (int i = 0; i < codewords.length - 1; i++) {
            for (int j = i + 1; j < codewords.length; j++) {
                try {
                    currentDist = codewords[i].hammingDistance(codewords[j]);
                    if(minDist > currentDist)
                        minDist = currentDist;
                } catch (IsNoVectorException ex) {
                    Logger.getLogger(BlockCode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return minDist;
    }

    public String getGMatAsString(){
        return gMat.toString();
    }

    public String getHMatAsString(){
        return hMat.toString();
    }

    public int getMinHemmingDist(){
        return minHemmingDist;
    }

    public String getSyndroms1BitAsString(){
        StringBuffer sb = new StringBuffer();
        for(BitMatrix2D syndrom : syndroms1Bit){
            sb.append(syndrom).append("\n");
        }
        return sb.toString();
    }

    public String getSyndroms2BitAsString(){
        StringBuffer sb = new StringBuffer();
        for(BitMatrix2D syndrom : syndroms2Bit){
            sb.append(syndrom).append("\n");
        }
        return sb.toString();
    }

    public String getCodewordsAsString(){
        StringBuffer sb = new StringBuffer();
        for(BitMatrix2D codeword : codewords){
            sb.append(codeword).append("\n");
        }
        return sb.toString();
    }
}
