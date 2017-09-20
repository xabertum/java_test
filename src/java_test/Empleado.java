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
public class Empleado {

    String nombre;
    int numEmpleado, sueldo;

    static private int contador = 0;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        numEmpleado = ++contador;

    }

    public void aumentarSueldo(int porcentaje) {
        sueldo += (int) (sueldo * porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Num. emplado" + numEmpleado + "Nombre - " + nombre + "Sueldo "
                + sueldo;

    }

}
