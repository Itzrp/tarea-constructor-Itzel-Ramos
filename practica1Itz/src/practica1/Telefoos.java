/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Alumno
 */
public class Telefoos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Telefono telefono1 = new Telefono();
        telefono1.setMarca("Iphone");
        telefono1.setColor("Rosa");
        telefono1.setUso(true);

        Telefono telefono2 = new Telefono("Samsung", "Verde", false);

        System.out.println(telefono1.getMarca());
        System.out.println(telefono2.getMarca());
    
    }
}
