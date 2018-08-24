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
public class Comidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comida comida1 = new Comida();
        comida1.setSabor(true);
        comida1.setHealthy(false);
        comida1.setCosto(150);

        Comida comida2 = new Comida(true, true, 360);
		
		System.out.println("Tenía un buen sabor? " + comida1.isSabor());
		System.out.println("Era saludable?  " + comida1.isHealthy());
		System.out.println("Cuál fue su costo? " + comida1.getCosto());
    }
    
}
