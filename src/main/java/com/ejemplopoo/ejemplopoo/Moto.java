
package com.ejemplopoo.ejemplopoo;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int numero_registro, int cant_ruedas, String marca, String modelo) {
        super(numero_registro, cant_ruedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
     
}
