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
public interface ComidaInterface {
    public String precio(boolean accesible);
    public String restaurante(boolean reconocido);
    public String platillo(String tipo);
    public String temporada(String fecha);
}
