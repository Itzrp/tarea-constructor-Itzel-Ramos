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
public class Comida {
    private boolean sabor;
    private boolean healthy;
    private float costo;

    public Comida() {
    }

    public Comida(boolean sabor, boolean healthy, float costo) {
        this.sabor = sabor;
        this.healthy = healthy;
        this.costo = costo;
    }

    public boolean isSabor() {
        return sabor;
    }

    public void setSabor(boolean sabor) {
        this.sabor = sabor;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
}
