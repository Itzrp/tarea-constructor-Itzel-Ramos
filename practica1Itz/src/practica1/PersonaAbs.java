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
abstract class PersonaAbs {
    
    public String conocer(boolean ver){
        System.out.println("Conocer a" + ver);
        return null;
    }
    
    abstract String salir();
    
    abstract String jugar();
    
    public String platicar(boolean hablar){
        System.out.println("Hablar " + hablar);
        return null;
    }
    
}
