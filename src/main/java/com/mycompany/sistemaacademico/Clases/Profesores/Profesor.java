
package com.mycompany.sistemaacademico.Clases.Profesores;

import com.mycompany.sistemaacademico.Clases.PersonalAcademico;


public class Profesor extends PersonalAcademico{
    //Atributos
    private EnumeracionEscalafon escalafon  ;
    //Constructor

    public Profesor(EnumeracionEscalafon escalafon, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
    }
     
    //Get set

    public EnumeracionEscalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(EnumeracionEscalafon escalafon) {
        this.escalafon = escalafon;
    }
    
    
    

    @Override
    public String toString() {
        return "Profesor{" +super.toString()+ "escalafon=" + escalafon + '}';
    }
     public boolean verificarCedula(){
        return true;
    }
    
}
