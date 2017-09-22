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
public class Matematicas {
    public double factorial (int n) {
        double resultado;
        for (resultado = n; n>1; n--) {
            resultado *=n;
        }
        return resultado;
    }
       
}
