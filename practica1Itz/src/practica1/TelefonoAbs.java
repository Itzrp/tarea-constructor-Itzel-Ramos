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
abstract class TelefonoAbs {
    
    abstract String encender(boolean encender);
    
    public String fotos(boolean tomarfoto){
        System.out.println("fotografía " + tomarfoto);
        return null;
    }
    
    abstract String apps(boolean usar);
    
    public String llamadas(boolean llamar){
        System.out.println("Hablar" + llamar);
        return null;
    }
    
    public String mensajes(boolean mensajear){
        System.out.println("Mensajes? "+ mensajear);
        return null;
    }
    
}
