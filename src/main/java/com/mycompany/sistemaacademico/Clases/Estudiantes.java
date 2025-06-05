
package com.mycompany.sistemaacademico.Clases;

public class Estudiantes extends PersonaInstitucional{
    //Atributo
    private int codigo;
    
    //Constructor
    public Estudiantes(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }   
    //Get y set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Metodos
    public  String agregarEstudiante(){
        return "";
    }

    @Override
    public String toString() {
        return "Estudiantes{" + super.toString()+ "codigo=" + codigo + '}';
    }
    
    
}
