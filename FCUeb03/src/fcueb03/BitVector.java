/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fcueb03;

/**
 *
 * @author Christian Rech, Tim Bartsch
 */
public class BitVector {
    
    //attribute
    boolean[] vector;
    int n;
    int k;

    /**
     * Konstruktor - erstellt leeres boolean array
     * @param k
     */
    public BitVector(int k){
        //k muss hier noch berechnet werden
        this.vector = new boolean[k];
    }

    /**
     * Dient zum addieren von zwei BitVectoren
     * @param bv
     * @return
     */
    //Methode wird glaube ich nicht benoetigt
    public BitVector addition(BitVector bv){
        for (int i = 0; i < vector.length; i++) {
           ;
        }
        return null;
    }


    /**
     * Dient zum dividieren von zwei BitVectoren
     * @param bv
     * @return
     */
    public BitVector divide(BitVector bv){
        BitVector result = this;
        int width = result.vector.length - bv.vector.length;

	for (int i = 0; i <= width; i++)
		if (result.vector[i])
                     for (int j = 0; j < bv.vector.length; j++)
                        result.vector[i + j] ^= bv.vector[j];

        return result;
    }

    /**
     * Test ob Vector ein Codewort ist
     * @return
     */
    public boolean isCodeword(BitVector bv){
        return isDivisible(bv);
    }


    /**
     * Test auf teilbarkeit
     * @param bv
     * @return
     */
    private  boolean isDivisible(BitVector bv){
        BitVector result = divide(bv);

	for (int i = 0; i < result.vector.length; i++)
            if (result.vector[i])
			return false;

	return true;
   }
    

    /**
     * Dient zum multiplizieren von zwei BitVectoren
     * @param bv
     * @return
     */
    public BitVector multiply(BitVector bv){
        //this.vector und bv.vector muessen gleich lange sein
        //habs weggelassen, da noch nciht bekannt ist ob funktion wirklich benoetigtwird
        BitVector result = null;
        for (int i = 0; i < vector.length; i++)
           result.vector[i] = this.vector[i] && bv.vector[i];

        return result;
    }

    /**
     * Test ob Codewort zyklisch ist
     * @return
     */
    public boolean isCyclic() {
        return true; //isDivisible
    }

    /**
     * toString Methode
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polynom:\n");

        for (int i = vector.length - 1; i >= 0; i--)
            if (vector[i]) {
                sb.append('x');
                sb.append("^" + i); //<-- i darf nur werte von aufgewählten checkboxen bekommen.
            }

        sb.append(" erzeugt ");

        if (!isCyclic())
            sb.append('k');

        sb.append("einen zyklischen Code");

        return sb.toString();
    }

    //------------------[getter & setter]---------->

    /**
     * Setter um vector mit werten zu fuellen
     */
    public void setVector(boolean[] vec){
        // sollte noch getestet werden ob vec genausolange wie vector
        for (int i = 0; i < vec.length; i++)
           vector[i] = vec[i];
    }

    public int getK(){
        return k;
    }

    public int getN(){
        return n;
    }

}
