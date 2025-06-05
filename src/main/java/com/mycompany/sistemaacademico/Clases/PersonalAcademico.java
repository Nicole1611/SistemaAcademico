
package com.mycompany.sistemaacademico.Clases;

public class PersonalAcademico extends Empleado{
    //Constructor
    public PersonalAcademico(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
    }
    //Metodos
    public String agregarPersonalAcademico(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + super.toString()+ '}';
    }
    
    
}
