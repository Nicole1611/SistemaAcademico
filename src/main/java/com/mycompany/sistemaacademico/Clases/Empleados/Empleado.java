
package com.mycompany.sistemaacademico.Clases.Empleados;

import com.mycompany.sistemaacademico.Clases.PersonaInstitucional;

public class Empleado extends PersonaInstitucional{
    //Atributos
    private double sueldo;
    
    //Constructor
    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }
    //Get y set

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodos
    public String agregarEmpleado(){
        return "";
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString() + "sueldo=" + sueldo + '}';
    }
    
    
}
    