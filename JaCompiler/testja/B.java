/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo
 */
public class B extends A {

    private int f() {
        m(3);
        printA();
        return 3;
    }


    public int m(byte b1, byte b2) { return 0; }
    public int m(int i, double d) { return 0; }
    public int m(double d, int i) { return 0; }
   // public int m(int b, int s) { return 0; }
    public int m(byte b) { return 0; }
}
