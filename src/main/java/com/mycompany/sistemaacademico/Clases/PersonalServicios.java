
package com.mycompany.sistemaacademico.Clases;

public class PersonalServicios extends Empleado{
    //Atributo
    private String gremio;
    
    //Constructor
    public PersonalServicios(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }
    //Get y Set
    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    //Metodos
    public String agregarPersonalServicios(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonalServicios{"+super.toString() + "gremio=" + gremio + '}';
    }
     public boolean verificarCedula(){
        return true;
    }
}
