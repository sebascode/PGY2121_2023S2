package cl.duoc.veterinaria;

import cl.duoc.veterinaria.models.Mascota;

public class Veterinaria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Creamos un objeto Mascota
        Mascota obj = new Mascota();
        
        obj.setNroChip(1000);
        
        System.out.print("El número de chip de la mascota es: ");
        System.out.println(obj.getNroChip());
    }
}
