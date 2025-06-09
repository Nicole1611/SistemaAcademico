/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Clases;


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
    
    
}
