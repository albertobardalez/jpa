
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;


public class Controladora {
    
    ControladoraPersistencia controlPersit = new ControladoraPersistencia();

    public void crearAlumno(String dni, String nombre, String apellido, String edad) {
      
        Alumno alu = new Alumno();
        alu.setDni(dni);
        alu.setNombre(nombre);
        alu.setApellido(apellido);
        alu.setFechaNac(new Date());
        
        controlPersit.crearAlumno(alu);   
        
    }

 
    public void editarAlumno(String dni) {
       
        Alumno alu = new Alumno();
        
        alu.setDni(dni);
        
        controlPersit.editarAlumno(alu);
    
    }

   
    
}
