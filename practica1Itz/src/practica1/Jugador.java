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
public class Jugador {
    private boolean veloz=false;
    private boolean inteligente=false;
    private boolean astuto=false;
    private boolean alto=false;
    private int numero=0;
    
    

    public Jugador() {
    }
    
    public Jugador(boolean veloz, boolean inteligente, boolean astuto, boolean alto, int numero ) {
        this.veloz = veloz;
        this.inteligente = inteligente;
        this.astuto = astuto;
        this.alto= alto;
        this.numero= numero;
    }

    public boolean isVeloz() {
        return veloz;
    }

    public void setVeloz(boolean veloz) {
        this.veloz = veloz;
    }

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public boolean isAstuto() {
        return astuto;
    }

    public void setAstuto(boolean astuto) {
        this.astuto = astuto;
    }

    public boolean isAlto() {
        return alto;
    }

    public void setAlto(boolean alto) {
        this.alto = alto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
