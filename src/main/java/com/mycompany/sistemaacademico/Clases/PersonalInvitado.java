
package com.mycompany.sistemaacademico.Clases;


public class PersonalInvitado extends Persona{
//Constructor
    public PersonalInvitado(int id, String nombre, String correoPersonal, String cedula){
        super(id, nombre, correoPersonal, cedula);
    }

//Metodo
    public String agregarPersonaInvitada() {
        return "";
    }

    @Override
    public String toString() {
        return "PersonalInvitado{" +super.toString()+ '}';
    }
    
    
}
