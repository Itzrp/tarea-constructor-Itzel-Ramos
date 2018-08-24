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
abstract class ComidaAbs {
    
    abstract String precio(boolean accesible);
    
    abstract String restaurante(boolean reconocido);
    
    public String platillo(String tipo){
        System.out.println("Tipo de comida" + tipo);
        return tipo;
    }
    
    public String temporada(String fecha){
        System.out.println("Fecha de consumo" + fecha);
        return fecha;
    }
}