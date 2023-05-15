
package com.ejemplopoo.ejemplopoo;

public class EjemploPOO {

    public static void main(String[] args) {
        Auto auto1=new Auto();
        Auto auto2=new Auto(1,"AB357ZN",5,"gris",true,456,768,"volkswagen","gol");
        Moto moto1=new Moto (76,2,2,"yamaha","xr123");
        Camion camion=new Camion(34,false,3,2,"mercedes","unmodelo");
       
        auto2.encender();
        auto2.acelerar(80);
        auto2.frenar(20);
        auto2.apagar();
        
        System.out.println("el valor de la id es:"+ auto2.getId());
        auto2.setId(800);
        System.out.println("el nuevo valor de la id es: "+ auto2.getId());
        
        System.out.println("la id de auto1 es: " + auto1.getId());
        
        auto1.setId(2500);
        auto1.setPatente("NUO801");
        auto1.setCant_puertas(5);
        auto1.setColor("verde");
        auto1.setCaja_manual(false);
        
        System.out.println("la nueva id de auto1 es: "+auto1.getId());
        
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());
          }
}
