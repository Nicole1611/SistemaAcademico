
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Clases.Decano;
import com.mycompany.sistemaacademico.Clases.Empleado;
import com.mycompany.sistemaacademico.Clases.Estudiantes;
import com.mycompany.sistemaacademico.Clases.Persona;
import com.mycompany.sistemaacademico.Clases.PersonaInstitucional;
import com.mycompany.sistemaacademico.Clases.PersonalAcademico;
import com.mycompany.sistemaacademico.Clases.PersonalInvitado;
import com.mycompany.sistemaacademico.Clases.PersonalServicios;
import com.mycompany.sistemaacademico.Clases.Profesor;

public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println("DATOS DEL OBJETO PERSONA ");
        Persona persona = new Persona(1, "Jorge", "correoPersonal@gmail.com", "343432133-3");
        System.out.println(""+persona.toString());
        //Persona invitada
        System.out.println("DATOS DEL OBJETO PERSONA INVITADA");
        PersonalInvitado personaInvitada = new PersonalInvitado(2, "Jose", "jose@gmail.com", "234");
        System.out.println(""+personaInvitada.toString());
        //Persona Institucional
        System.out.println("DATOS DEL OBJETO PERSONA INSTITUCIONAL");
        PersonaInstitucional personaInstitucional = new PersonaInstitucional("maria@es.edu.ec", 3, "Maria", "maria@gmail.com", "343851589-0");
        System.out.println(""+personaInstitucional.toString());
        //Empleado
        System.out.println("DATOS DEL OBJETO EMPLEADO");
        Empleado empleado = new Empleado(400, "juan@esp.edu.ec", 4, "Juan", "juan@gmail.com", "357863567-3");
        System.out.println(""+empleado.toString());
        //Estudiante
        System.out.println("DATOS DEL OBJETO ESTUDIANTE");
        Estudiantes estudiante = new Estudiantes(344, "vicente@esp.ecu.ec", 5, "Vicente", "vicente@gmail.com", "454548946-1");
        System.out.println(""+estudiante.toString());
        //Personal Academico
        System.out.println("DATOS DEL OBJETO PERSONAL ACADEMICO");
        PersonalAcademico personalAcademico = new PersonalAcademico(644, "darwin@esp.edu.ec", 6, "Darwin", "darwin@gmail.com", "343589590-4");
        System.out.println(""+personalAcademico.toString());
        //Personal Servicios
        System.out.println("DATOS DEL OBJETO PERSONAL ACADEMICO");
        PersonalServicios personalServicios = new PersonalServicios("Tecnico", 200, "blanca@esp.edu.ec", 7, "Blanca", "blanca@gmail.com", "864524233-7");
        System.out.println(""+personalServicios.toString());

        //Profesor
        System.out.println("DATOS DEL OBJETO PROFESOR");
        Profesor profesor = new Profesor(8, 300, "Esther@esp.edu.ec", 8, "Esther", "Esther@gmail.com", "347963150-6");
        System.out.println(""+profesor.toString());
    }
}