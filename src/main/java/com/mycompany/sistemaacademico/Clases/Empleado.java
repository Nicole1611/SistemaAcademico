
package com.mycompany.sistemaacademico.Clases;

public abstract class Empleado extends PersonaInstitucional{
    //Atributos
    private double sueldo;
    
    //Constructor
    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    //Metodos
    public String agregarEmpleado(){
        return "";
    }
    public abstract boolean verificarCedula();
    @Override
    public String toString() {
        return "Empleado{" +super.toString() + "sueldo=" + sueldo + '}';
    }
    
    
}
    