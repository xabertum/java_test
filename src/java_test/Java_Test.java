/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;

import java.util.Date;
import java.util.Scanner;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola a todos");
        System.out.println(new Date());

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        sc.nextInt();

        Java_Test jt = new Java_Test(3, 5);

        System.out.println(cuantosObjetos());

        System.out.println("Fin del programa");
    }

}
