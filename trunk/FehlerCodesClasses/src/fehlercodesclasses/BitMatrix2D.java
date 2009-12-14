/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fehlercodesclasses;

import java.util.LinkedList;

/**
 *
 * @author tim
 */
public class BitMatrix2D {

    private boolean[][] matrix;
    private int ROWS;
    private int COLUMNS;
    //int HEMMINGDISTANCE;
    /**
     * Nimmt strings mit folgendem schema:
     * 101          1,0,1
     * 111  oder    1,1,1
     * 101          1,0,1
     * @param binMatrix
     */
    public BitMatrix2D(String binMatrix) {
        binMatrix = binMatrix.trim();
        binMatrix = binMatrix.replace(",", "");
        String row;
        LinkedList<boolean[]> rowList = new LinkedList<boolean[]>();
        if (!binMatrix.matches("[01\n]+")) 
            throw new IllegalArgumentException();
        binMatrix += "\n";  //damit er auch immer ein ende findet
        int beginIndex = 0;
        int endIndex = binMatrix.indexOf("\n");
        row = binMatrix.substring(beginIndex, endIndex);
        this.COLUMNS = row.length();
        rowList.add(createBinVector(row));
        while (binMatrix.indexOf("\n", endIndex + 1) > 0) {
            beginIndex = endIndex + 1;
            endIndex = binMatrix.indexOf("\n", beginIndex);
            row = binMatrix.substring(beginIndex, endIndex);
            if (row.length() != this.COLUMNS) {
                throw new IllegalArgumentException();
            }
            rowList.add(createBinVector(row));
        }
        this.ROWS = rowList.size();
        this.matrix = new boolean[ROWS][1];
        int i = 0;
        for (boolean[] vector : rowList) {
            this.matrix[i] = vector;
            i++;
        }
    }


    public BitMatrix2D(int n, int m){
        this.COLUMNS = m;
        this.ROWS = n;
        this.matrix = new boolean[n][m];
    }

    public BitMatrix2D(int bitLength) {
        ROWS = (int)Math.pow(2, bitLength);
        COLUMNS = bitLength;
        this.matrix = new boolean[ROWS][COLUMNS];
        boolean[] vector = new boolean[COLUMNS];
        for(int i=0; i<ROWS; i++){
            this.matrix[i] = vector.clone();
            vector = incVector(vector);
        }
    }

    private boolean[] createBinVector(String binVector) {
        binVector = binVector.trim();
        boolean[] returnVec = new boolean[binVector.length()];
        for (int i = 0; i < binVector.length(); i++) {
            if (binVector.charAt(i) == '1') {
                returnVec[i] = true;
            } else {
                returnVec[i] = false;
            }
        }
        return returnVec;
    }

    public BitMatrix2D multiplyWith(BitMatrix2D multiMatrix) {
        int l = this.getROWS();
        int n = multiMatrix.getROWS();
        int m = this.getCOLUMNS();

        BitMatrix2D resMatrix = new BitMatrix2D(this.ROWS, this.COLUMNS);

        for (int i = 0; i < m; i++)
          for (int j = 0; j < n; j++)
            for (int k = 0; k < l; k++)
              resMatrix[i][j] ^= this.matrix[i][k] && multiMatrix[k][j];

          return resMatrix;
    }

    public BitMatrix2D concat(BitMatrix2D m){
        return null;
    }

    /**
     * Methode um eine Matix zu transponieren
     * @param matrix
     * @return transponierte Matrix
     */
    public BitMatrix2D transpose() {
           BitMatrix2D t_matrix = new BitMatrix2D(this.ROWS, this.COLUMNS);
           for (int i = 0; i < ROWS; i++) {
             for (int j = 0; j < COLUMNS; j++) {
                t_matrix[j][i] = this.matrix[i][j];
             }
          }
       return t_matrix;
    }

    public boolean[] incVector(boolean[] vector) {
        final boolean CARRYOVER = true;
        int n = vector.length - 1; //von hinten anfangen zu prüfen
        while ((n >= 0) && (CARRYOVER && vector[n])) { //reihenfolge der prüfung ist wichtig
            vector[n] = false;
            n--;
        }
        if (n >= 0) {
            vector[n] = CARRYOVER;
        }
        return vector;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (matrix[i][j]) {
                    sb.append("1,");
                } else {
                    sb.append("0,");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


//-----------------------( GET + SET)------------->

    public int getCOLUMNS() {
        return COLUMNS;
    }

    public int getROWS() {
        return ROWS;
    }

}
