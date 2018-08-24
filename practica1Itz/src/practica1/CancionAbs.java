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
abstract class CancionAbs {
    abstract String reproducir (boolean reproduciendo);
    
    abstract String pausar(boolean pausa);
    
    public String siguiente(boolean next){
        System.out.println("Cambia canción" + next);
        return null;
    }
    public String letra(String lyrics){
        System.out.println("Con letra" + lyrics);
        return lyrics;
    }
    
    public String volumen(boolean subir){
        System.out.println("Volumen" + subir);
        return null;
    }
    
    public String volumen2(boolean bajar){
        System.out.println("volumen" + bajar);
        return null;
    }
}
