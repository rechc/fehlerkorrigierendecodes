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


    //------------------[getter & setter]---------->

    /**
     * Setter um vector mit werten zu fuellen
     */
    public void setVector(){

    }

}
