package com.ejemplopoo.ejemplopoo;

public class Camion extends Vehiculo {
    private int cant_ejes;
    private boolean acoplado;

    public Camion() {
    }

    public Camion(int cant_ejes, boolean acoplado, int numero_registro, int cant_ruedas, String marca, String modelo) {
        super(numero_registro, cant_ruedas, marca, modelo);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }
       
}
