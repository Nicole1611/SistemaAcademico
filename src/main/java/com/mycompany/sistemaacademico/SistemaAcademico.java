
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Clases.Decanos.Decano;
import com.mycompany.sistemaacademico.Clases.Estudiantes;
import com.mycompany.sistemaacademico.Clases.PersonasExternas.PersonaExterna;
import com.mycompany.sistemaacademico.Clases.PersonalServicios;
import com.mycompany.sistemaacademico.Clases.Profesores.EnumeracionEscalafon;
import com.mycompany.sistemaacademico.Clases.Profesores.Profesor;
//import com.mycompany.sistemaacademico.Clases.EnumeracionEscalafon;

public class SistemaAcademico {

    public static void main(String[] args) {
        
        //Persona invitada
        System.out.println("DATOS DEL OBJETO PERSONA INVITADA");
        PersonaExterna personaInvitada = new PersonaExterna("Familia",2, "Jose", "jose@gmail.com", "234");
        System.out.println(""+personaInvitada.toString());
        //Estudiante
        System.out.println("DATOS DEL OBJETO ESTUDIANTE");
        Estudiantes estudiante = new Estudiantes(344, "vicente@esp.ecu.ec", 5, "Vicente", "vicente@gmail.com", "454548946-1");
        System.out.println(""+estudiante.toString());
        //Personal Servicios
        System.out.println("DATOS DEL OBJETO PERSONAL SERVICIOS");
        PersonalServicios personalServicios = new PersonalServicios("Tecnico", 200, "blanca@esp.edu.ec", 7, "Blanca", "blanca@gmail.com", "864524233-7");
        System.out.println(""+personalServicios.toString());

        //Profesor
        System.out.println("DATOS DEL OBJETO PROFESOR");
        Profesor profesor = new Profesor(EnumeracionEscalafon.PRINCIPAL, 300, "Esther@esp.edu.ec", 8, "Esther", "Esther@gmail.com", "347963150-6");
        System.out.println(""+profesor.toString());
        // Decano
        System.out.println("DATOS DE DECANO ");
        Decano decano= new Decano("presidente", 1,"Luis@gmail.com ", 3,"LUIS","luis@gmail.com", "123456789");
        System.out.println(""+decano.toString());
    }
}