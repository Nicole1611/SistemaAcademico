
package com.mycompany.sistemaacademico.Clases.PersonasExternas;

import com.mycompany.sistemaacademico.Clases.Persona.Persona;


public class PersonaExterna extends Persona{
    private String descripcion;
    
//Constructor
    public PersonaExterna(String descripcion, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.descripcion = descripcion;
    }
    
//Get y Set
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean verificarCedula(){
        return true;
    }
    
//Metodo
    @Override
    public String toString() {
        return "PersonalInvitado{" +super.toString()+ '}';
    }
    
    
}
