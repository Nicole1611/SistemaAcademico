
package com.mycompany.sistemaacademico.Clases;


public class PersonaInstitucional extends Persona{
    //Atributo
    private String correoInstitucional;
    //Constructor
    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }
    //Get set

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    //metodos
    public String agregarPersonaInstitucion(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString()+ "correoInstitucional=" + correoInstitucional + '}';
   }
}
