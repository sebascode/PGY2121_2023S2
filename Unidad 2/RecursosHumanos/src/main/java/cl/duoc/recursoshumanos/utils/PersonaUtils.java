package cl.duoc.recursoshumanos.utils;

public class PersonaUtils {
    public static boolean validaNombre(String nombre){
        // nombre debe contener más de 5 caracteres.
        return (nombre.length() >= 5);
    }
}
