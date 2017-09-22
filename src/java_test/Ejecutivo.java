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
public class Ejecutivo extends Empleado {

    int presupuesto;
    int categoriaEjecutiva;

    public void asignarPresupuesto(int p) {
        presupuesto = p;
        
        categoriaEjecutiva=(p>1000)?0:1;
        
        
    }
   
    
}
