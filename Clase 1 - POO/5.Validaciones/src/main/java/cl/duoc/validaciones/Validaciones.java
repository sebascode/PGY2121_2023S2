package cl.duoc.validaciones;

import cl.duoc.validaciones.models.Usuario;

public class Validaciones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int edad = (int)32.8f;
        String nombre = ""+32.7f;
        
        // tipo nombre = nuevoValor;
        boolean verdadero = false;
        float numero = 32f;
        Usuario user = new Usuario("Seba", "a1234");
        
        System.out.println(user);
        System.out.println(new Usuario());
        System.out.println(new Usuario("david", "prueba123"));
        System.out.println(new Usuario("francisco", "test004"));
    }
}
