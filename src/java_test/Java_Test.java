/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;

/**
 *
 * @author xabertum
 */
public class Java_Test {

    int x, y;
    static int numObjetosJava_Test = 0;

    Java_Test(int a, int b) {
        x = a;
        y = b;
        numObjetosJava_Test++;
    }

    public static int cuantosObjetos() {
        return numObjetosJava_Test;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] b = new int[2][2];
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = count;
                count++;
            }

        }

        System.out.println(count);
    }

}
