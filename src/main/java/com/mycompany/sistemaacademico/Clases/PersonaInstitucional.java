
package com.mycompany.sistemaacademico.Clases;

import com.mycompany.sistemaacademico.Clases.Persona.Persona;


public abstract class PersonaInstitucional extends Persona{
    //Atributo
    private String correoInstitucional;
    //Constructor
    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }
   
    //metodos
    public String agregarPersonaInstitucion(){
        return "";
    }
    public abstract boolean verificarCedula();
    
    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString()+ "correoInstitucional=" + correoInstitucional + '}';
   }
}
