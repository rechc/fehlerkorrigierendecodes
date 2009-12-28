/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fehlercodesclasses;

/**
 *
 * @author Christian
 */
public class Manager {
    //
    //
    //macht es Sinn die Klasse Manager statisch zu machen ??????????
    //
    //

    public Manager(){}

    public String codewoerter(BitMatrix2D matrix){
        String result = "";

        for(int i = 0; i < 16; i++){
            //System.out.println((vector.createBinVector(i, 4)));
            result = result + "\n" + matrix.multiplyWith(((BitMatrix2D.createBinVector(i, 4)).transpose()));
        }

        return result;
    }

    public String syndrome(BitMatrix2D matrix){
        String result = "";
        BitMatrix2D H = matrix.createKontrollmatrix();
        
        for (int i = 0; i < 6;i++)
           for ( int j = i + 1; j < 7; j++){
            BitMatrix2D e = BitMatrix2D.createErrorVector(i, 7);
            result = result + "\n" + ((H.multiplyWith(e.transpose())).transpose());
        }

        return result;
    }
    
}
