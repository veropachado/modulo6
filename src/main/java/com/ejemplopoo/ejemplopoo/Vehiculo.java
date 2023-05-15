
package com.ejemplopoo.ejemplopoo;

public class Vehiculo {
   private int numero_registro;
   private int cant_ruedas;
   private String marca;
   private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(int numero_registro, int cant_ruedas, String marca, String modelo) {
        this.numero_registro = numero_registro;
        this.cant_ruedas = cant_ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public int getNumero_registro() {
        return numero_registro;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void estacionar(){
        System.out.println("Estoy estacionando");
    }
}
