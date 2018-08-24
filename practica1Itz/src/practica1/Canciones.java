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
public class Canciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion();
        cancion1.setGenero("salsa");
        cancion1.setNombre("Día tras día");
        cancion1.setArtista("Cheo Andujar");

        Cancion cancion2 = new Cancion("", "", "");
		
		System.out.println("El género es: " + cancion1.getGenero());
		System.out.println("El nombre de la canción es:  " + cancion1.getNombre());
		System.out.println("El artista es: " + cancion1.getArtista());
    }
}
