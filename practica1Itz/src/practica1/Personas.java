/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Alumno
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona persona1 = new Persona();
        persona1.setNombre("Marco");
        persona1.setApellido("Bautista");

        Persona persona2 = new Persona("Luis", "Veliz");

        System.out.println("El nombre de la primera persona es:" + persona1.getNombre());
        System.out.println("El nombre de la segunda persona es:" + persona2.getNombre());
    
    }
    
}


       