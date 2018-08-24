package practica1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chu_c
 */
public class Cancion {
    private String genero;
    private String nombre;
    private String artista;

    public Cancion() {
        
    }
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    
    public Cancion(String genero, String nombre, String artista) {
        this.genero= genero;
        this.nombre= nombre;
        this.artista= artista;
    }
}
