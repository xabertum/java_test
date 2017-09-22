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
        System.out.println("Hola a todos");
        System.out.println(new Date());

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        sc.nextInt();

        Java_Test jt = new Java_Test(3, 5);

        System.out.println(cuantosObjetos());

        System.out.println("Fin del programa");

        System.out.println(jt.x + jt.y);
        
        Ejecutivo jefe = new Ejecutivo();
        Empleado empleado = new Empleado("j",36);
        
        System.err.println("Numero de empleado: " + jefe.numEmpleado);
        System.err.println("Numero de empleado: " + empleado.numEmpleado);
        
        System.out.println(empleado.nombre);
        jefe.asignarPresupuesto(2000);
        System.err.println("Categoria Ejecutiva: " + jefe.categoriaEjecutiva);
        
        System.out.println("Introduzca la palabra: ");
        String testString = sc.next();
        
        String testString1 = "Hola";
        
        if (testString.equals(testString1)) {
            System.err.println("Acierto!");
        
        } else {
            System.err.println("ERROR!");
        }
        
        //_-------------------------------_//
        Coche vehiculo1 = new Coche();
        vehiculo1.acelerar(50);
        vehiculo1.frenar(34);
        System.err.println(vehiculo1.obtenerVelocidad());
        
        
        //--------------------------------------//
        
        Matematicas m1 = new Matematicas();
        double x = m1.factorial(5);
        System.out.println(x);
        
        
        

    }

}
