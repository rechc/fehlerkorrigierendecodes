/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fehlercodesclasses;

/**
 *
 * @author tim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Mult Test
//        boolean[] vector = {true, false, true, true};
//        boolean[][] matrix = {{true, true, false}, {true, false, true}, {true, true, true}, {false, true, true}};
//        System.out.println(BitMatOps.getString(BitMatOps.multiply(vector, matrix)));
//        System.out.println(BitMatOps.getString(matrix));

        //Inc Test
        boolean[] vector = {false, false, false};
        for(int i=0; i<8;i++){
            vector = BitMatOps.incVector(vector);
            System.out.println(BitMatOps.getString(vector));
        }
       
    }
}
