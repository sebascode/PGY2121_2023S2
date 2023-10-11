package cl.duoc.dinodino.Utils;

import cl.duoc.dinodino.DTO.DinosaurioDTO;

public class DinosaurioUtils {
    
    public static boolean validaNombre(DinosaurioDTO dino){
        return (dino.getNombre().length() > 3);
    }
    
    public static boolean validaColor(DinosaurioDTO dino){
        if(dino.getColor().contains("Amarillo") || 
                dino.getColor().contains("Rojo") ||
                dino.getColor().contains("Azul")){
            return true;
        }
        else{
            return false;
        }
    }
}
