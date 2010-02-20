/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fcueb03;

/**
 *
 * @author Christian, Tim
 */
public class calculation {

    BitVector polynom;
    BitVector code;

    public void nkCreate(int n, int k){
        if (n > k){ //muss noch mit Exception geprueft werden
            kPolynom(k);
            nCode(n);
        }
    }

    private void kPolynom(int k){
        polynom = new BitVector(k + 1);
    }

    private void nCode(int n){
        code = new BitVector(n + 1);
    }

    public void setKPolynom(String word){
        boolean[] vec = null;
        for (int i = 0; i < word.length(); i++) {
            char bit = word.charAt(i);
            //vec[i] = (boolean) bit;
        } 
        polynom.setVector(vec);
    }

    public void setNCode(String word){

    }


}
