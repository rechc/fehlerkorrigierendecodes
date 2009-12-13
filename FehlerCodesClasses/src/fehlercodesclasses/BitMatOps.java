/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fehlercodesclasses;

/**
 *
 * @author tim
 */
public class BitMatOps {

    public static boolean[] multiply(boolean[] vector, boolean[][] matrix) {
        if (vector.length != matrix.length) {
            throw new IllegalArgumentException();
        }
        boolean[] resVec = new boolean[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resVec[i] = resVec[i] ^ (vector[j] && matrix[j][i]);
            }
        }
        return resVec;
    }

    public static String getString(boolean[] vector) {
        StringBuffer sb = new StringBuffer("(");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]) {
                sb.append("1,");
            } else {
                sb.append("0,");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }

    public static String getString(boolean[][] matrix) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]) {
                    sb.append("1,");
                } else {
                    sb.append("0,");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static boolean[] incVector(boolean[] vector) {
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
}
