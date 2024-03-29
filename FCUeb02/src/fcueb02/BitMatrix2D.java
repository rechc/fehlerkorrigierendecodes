package fcueb02;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Tim Bartsch, Christian Rech
 */
public class BitMatrix2D {

    //Attribute
    private final boolean array[][];
    private final int ROWS;
    private final int COLUMNS;
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
        if (!binMatrix.matches("[01\n]+")) {
            throw new IllegalArgumentException();
        }
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
        this.array = new boolean[ROWS][1];
        int i = 0;
        for (boolean[] vector : rowList) {
            this.array[i] = vector;
            i++;
        }
    }

    /**
     * Erstellt Matrix in Dimension n*m
     * und füllt alle Felder mit false
     * @param n
     * @param m
     */
    public BitMatrix2D(int n, int m) {
        this.COLUMNS = m;
        this.ROWS = n;
        this.array = new boolean[n][m];
    }

    /**
     * Bildet Einheitsmatrix mit der Bitlänge bitLength
     * @param bitLength
     */
    public BitMatrix2D(int bitLength) {
        ROWS = COLUMNS = bitLength;
        array = new boolean[ROWS][COLUMNS];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = true;
        }
    }

    /**
     * Erstellt ein BitMatrix2D Object aus einer 2D boolean matrix
     */
    public BitMatrix2D(boolean[][] matrix) {
        this.ROWS = matrix.length;
        this.COLUMNS = matrix[0].length;
        this.array = new boolean[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                this.array[i][j] = matrix[i][j];
            }
        }
    }

    /**
     * Wandelt eine decimalValue in eine binärzahl mit der länge bitlength um
     * @param decimalValue
     * @param bitLength
     * @return
     */
    public static BitMatrix2D createBinVector(int decimalValue, int bitLength) {
        if (decimalValue < 0 || bitLength < 1) {
            throw new IllegalArgumentException();
        }
        BitMatrix2D bm = new BitMatrix2D(1, bitLength);
        int remainder = 0;
        int i = bitLength - 1;
        while (decimalValue != 0) {
            remainder = decimalValue % 2;
            decimalValue = decimalValue / 2;
            if (remainder == 0) {
                bm.array[0][i] = false;
            } else {
                bm.array[0][i] = true;
            }
            i--;
        }
        return bm;
    }

    /**
     * Erstellt einen 1bit fehlervektor mit der 1 an der stelle bitPos
     * @param bitPos
     * @param bitLength
     * @return
     */
    public static BitMatrix2D createErrorVector(int bitPos, int bitLength) {
        if (bitPos < 0 || bitLength < 1 || bitPos >= bitLength) {
            throw new IllegalArgumentException();
        }
        BitMatrix2D bm = new BitMatrix2D(1, bitLength);
        bm.array[0][bitPos] = true;
        return bm;
    }

    /**
     * Erstellt einen binaeren Vektor
     * @param binVector
     * @return
     */
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

    /**
     * Multipliziert Matrix mit einer anderen
     * @param bm
     * @return
     */
    public BitMatrix2D multiplyWith(BitMatrix2D bm) {
        if (this.getCOLUMNS() != bm.getROWS()) {
            throw new IllegalArgumentException();
        }
        boolean[][] resMat = new boolean[this.getROWS()][bm.getCOLUMNS()];
        for (int i = 0; i < this.getROWS(); i++) {
            for (int j = 0; j < bm.getCOLUMNS(); j++) {
                for (int k = 0; k < this.getCOLUMNS(); k++) {
                    resMat[i][j] ^= this.array[i][k] && bm.array[k][j];
                }
            }
        }
        return new BitMatrix2D(resMat);
    }

    /**
     * Setzt zwei Matrizen zusammen
     * @param m
     * @return
     */
    public BitMatrix2D concat(BitMatrix2D bm) {
        if (ROWS != bm.ROWS) {
            throw new IllegalArgumentException();
        }
        boolean[][] resMat = new boolean[this.ROWS][bm.COLUMNS + this.COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                resMat[i][j] = this.array[i][j];
            }
        }
        for (int i = 0; i < bm.ROWS; i++) {
            for (int j = 0; j < bm.COLUMNS; j++) {
                resMat[i][j + COLUMNS] = bm.array[i][j];
            }
        }
        return new BitMatrix2D(resMat);
    }

    /**
     * Liefert eine Untermatrix zurück
     */
    public BitMatrix2D subMatrix(int beginR, int beginC, int endR, int endC) {
        if ((beginR < 0 || beginC < 0) || (endR < beginR) || (endC < beginC)
                || (endR >= this.array.length) || (endC >= this.array[0].length)) {
            throw new IllegalArgumentException();
        }
        boolean[][] resMat = new boolean[endR - beginR + 1][endC - beginC + 1];
        for (int i = beginR; i <= endR; i++) {
            for (int j = beginC; j <= endC; j++) {
                resMat[i - beginR][j - beginC] = this.array[i][j];
            }
        }
        return new BitMatrix2D(resMat);
    }

    /**
     * Methode um eine Matix zu transponieren
     * @param matrix
     * @return transponierte Matrix
     */
    public BitMatrix2D transpose() {
        int n = this.getROWS();
        int m = this.getCOLUMNS();

        BitMatrix2D t_matrix = new BitMatrix2D(m, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t_matrix.array[j][i] = this.array[i][j];
            }
        }
        return t_matrix;
    }

    /**
     * Zaehlt binär von 0...0 bis 1...1
     * @param vector
     * @return
     */
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
    public boolean equals(Object o) {
        if (!(o instanceof BitMatrix2D)) {
            return false;
        }
        BitMatrix2D bm = (BitMatrix2D) o;
        if (bm.getROWS() != this.getROWS()) {
            return false;
        }
        if (bm.getCOLUMNS() != this.getCOLUMNS()) {
            return false;
        }
        for (int i = 0; i < bm.getROWS(); i++) {
            for (int j = 0; j < bm.getCOLUMNS(); j++) {
                if (bm.array[i][j] != this.array[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Gibt wahrheitswert zurück ob Objekt ein Spaltenvektor ist
     * @return
     */
    public boolean isColumnVector(){
        return COLUMNS == 1;
    }

    /**
     * ist this ein Zeilen Vektor?
     * @return
     */
    public boolean isRowVector(){
        return ROWS == 1;
    }

    /**
     * Dreht ein Bit an der Stelle n
     * @param n
     */
    public void changeBit(int n){
        if (this.isRowVector())
            if (this.array[0][n] == false)
                this.array[0][n] = true;
            else
                this.array[0][n] = false;
        else
            if (this.array[n][0] == false)
                this.array[n][0] = true;
            else
                this.array[n][0] = false;
    }

    public boolean isNullVector() {
        if (ROWS == 1) {
            for (int i = 0; i < COLUMNS; i++) {
                if (array[0][i] == true) {
                    return false;
                }
            }
            return true;
        }
        if (COLUMNS == 1) {
            for (int i = 0; i < ROWS; i++) {
                if (array[i][0] == true) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Arrays.deepHashCode(this.array);
        return hash;
    }

    /**
     * Berechnet die hemmingdistanz zwischen this und bm
     * @param bm
     * @return
     * @throws IsNoVectorException
     */
    public int hammingDistance(BitMatrix2D bm) throws IsNoVectorException{
        if((this.isColumnVector() && bm.isColumnVector()) || (this.isRowVector() && bm.isRowVector()))
            throw new IsNoVectorException();
        
        int res = 0;
        if(this.isRowVector()){
            for (int i = 0; i < this.COLUMNS; i++) {
                if(this.array[0][i] != bm.array[0][i])
                    res++;
            }
        }else{
            for (int i = 0; i < this.ROWS; i++) {
                if(this.array[i][0] != bm.array[i][0])
                    res++;
            }
        }
        return res;
    }

    /**
     * Berechnet das vector gewicht
     * @return
     * @throws IsNoVectorException
     */
    public int getVectorWeight() throws IsNoVectorException {
        if (!(this.isColumnVector() || this.isRowVector()))
            throw new IsNoVectorException();

        int high = 0;
        if(this.isRowVector()){
            for (int i = 0; i < this.COLUMNS; i++) {
                if(this.array[0][i] == true)
                     high++;
            }
        }else{
            for (int i = 0; i < this.ROWS; i++) {
                if(this.array[i][0] == true)
                     high++;
            }
        }
        return  high;
    }

    /**
     * toString Methode - gibt Matrix als String aus
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (array[i][j]) {
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
