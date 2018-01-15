/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;

/**
 *
 * @author Javier Delgado
 */
public class Coche {

    int ruedas;
    private double velocidad = 0;
    String nombre;

    /**
     * Aumenta  la velocidad. 
     * @param cantidad 
     */

    public void acelerar(double cantidad) {
        velocidad += cantidad;
    }

    /**
     * Disminuye la velocidad. 
     * @param cantidad 
     */
    public void frenar(double cantidad) {
        velocidad -= cantidad;
    }

    /**
     * Devuelve el valor de velocidad. 
     * @return 
     */
    public double obtenerVelocidad() {
        return velocidad;
    }
}
