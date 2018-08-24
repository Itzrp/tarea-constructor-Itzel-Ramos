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
public interface CancionesInterface {
    public String reproducir (boolean reproduciendo);
    public String pausar(boolean pausa);
    public String siguiente(boolean next);
    public String letra(String lyrics);
    public String volumen(boolean subir);
    public String volumen2(boolean bajar);
}
