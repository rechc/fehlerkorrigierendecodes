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
      //  Mult Test
//        boolean[] vector = {true, false, true, true};
//        boolean[][] matrix = {{true, true, false}, {true, false, true}, {true, true, true}, {false, true, true}};
//        System.out.println(BitMatOps.getString(BitMatOps.multiply(vector, matrix)));
//        System.out.println(BitMatOps.getString(matrix));

        //Inc Test
//        boolean[] vector = {false, false, false};
//        for(int i=0; i<8;i++){
//            vector = BitMatOps.incVector(vector);
//            System.out.println(BitMatOps.getString(vector));
//        }
//       boolean[][] matrix = {{true, true, false}, {true, false, true}, {true, true, true}, {false, true, true}};
//
//       BitMatrix2D.transpose(matrix);

         BitMatrix2D bm1 = new BitMatrix2D("0,1,1\n1,0,1\n0,0,1\n");
//         BitMatrix2D bm2 = new BitMatrix2D("0,1,1\n1,0,1\n0,0,1\n");
         BitMatrix2D bm2 = new BitMatrix2D("110");
            bm2 = bm2.transpose();
//        bm2 = bm.multiplyWith(bm2);
//         BitMatrix2D bm2  = new BitMatrix2D(3);
        


         BitMatrix2D bm3;
         bm3 = bm1.multiplyWith(bm2);
         System.out.println(bm1);
         System.out.println("-----------");
         System.out.println(bm3);
         System.out.println("-----------");
//         System.out.println(bm1.transpose());
    }
}
