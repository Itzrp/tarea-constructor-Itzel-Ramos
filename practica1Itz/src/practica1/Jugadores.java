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
public class Jugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugador1 = new Jugador();
        jugador1.setVeloz(false);
        jugador1.setInteligente(true);
        jugador1.setAstuto(true);
        jugador1.setAlto(false);
        jugador1.setNumero(4);

        Jugador jugador2 = new Jugador(true, false, false, true, 10);
		
		System.out.println("Es Veloz? " + jugador1.isVeloz());
		System.out.println("Es inteligente? " + jugador1.isInteligente());
		System.out.println("Es astuto? " + jugador1.isAstuto());
		System.out.println("Es alto? " + jugador1.isAlto());
		System.out.println("Cual es su numero? " + jugador1.getNumero());
    }
    
}
