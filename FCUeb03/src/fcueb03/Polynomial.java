package fcueb03;

/**
 *
 * @author tim
 */
public class Polynomial {
    boolean[] bitVector;

    /**
     * Erstellt ein Polynom aus einem Bit Vector <br>
     * 1010 wird zu x^3 + x <br>
     * 0011 wird zu x + 1
     * @param bitVector
     */
    public Polynomial(String bitVector){
        if(!bitVector.matches("[01]+"))
            throw new IllegalArgumentException();
        bitVector = bitVector.trim();
        this.bitVector = new boolean[bitVector.length()];
        for (int i = 0; i < bitVector.length(); i++) {
            if (bitVector.charAt(i) == '1') {
                this.bitVector[i] = true;
            } else {
                this.bitVector[i] = false;
            }
        }
        this.bitVector = delLeftZeros(this.bitVector);
    }

    private Polynomial(boolean[] bitVector) {
        this.bitVector = bitVector;
    }

    /**
     * Löscht die führenden Nullen aus dem Polynom <br>
     * 00110 wird zu 110
     * @param vector
     * @return
     */
    private boolean[] delLeftZeros(boolean[] vector){
        boolean[] res;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == true){
                res = new boolean[vector.length - i];
                for (int j = i; j < vector.length; j++) {
                    res[j - i] = vector[j];
                }
                return res;
            }
        }
        res = new boolean[1];
        return res;
    }

    /**
     * Überprüft ob das Polynom nur aus Nullen besteht
     * @param vector
     * @return
     */
    private boolean isZeroVector(boolean[] vector){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == true)
                return false;
        }
        return true;
    }

    /**
     * Überprüft mithilfe der Polynomdivision <br>
     * ob this ein codewort von g ist <br>
     * (Die Methode rechnet den Rest der Polynomdivision aus <br>
     *  und überprüft ob dieser gleich 0 ist) <br>
     * @param g
     * @return
     */
    public boolean isCodeWordOf(Polynomial g){
        boolean[] codeWord = new boolean[this.bitVector.length];
        for (int i = 0; i < codeWord.length; i++) {
            codeWord[i] = this.bitVector[i];
        }
        while(codeWord.length >= g.bitVector.length){
            for (int i = 0; i < g.bitVector.length; i++)
                codeWord[i] = codeWord[i] ^ g.bitVector[i];
            codeWord = delLeftZeros(codeWord);
            if(isZeroVector(codeWord))
                return true;
        }
        return false;
    }
}
