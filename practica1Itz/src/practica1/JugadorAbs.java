/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author chu_c
 */
abstract class JugadorAbs {
    
    public String entrenamiento(String lugar){
        System.out.println("El lugar es" + lugar);
        return lugar;
    }
    public String equipo(String nombreequipo){
        System.out.println("El equipo es " + nombreequipo);
        return nombreequipo;
    }
    
    public String juegos(String fecha){
        System.out.println("El día es " + fecha);
        return fecha;
    }
    
}
