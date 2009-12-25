/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fcueb02;

/**
 *
 * @author tim
 */
public class MyMath {

    private MyMath() {
    }

    
    public static int factorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        if (a == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static int binCoeff(int n, int k){
        if(n < 0 || k <0 )
            throw  new IllegalArgumentException();
        if(k > n)
            return 0;
        if(k == 0 || n == k)
            return 1;
        return factorial(n) / (factorial(k) * factorial(n-k));
    }
}
