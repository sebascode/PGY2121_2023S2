package cl.duoc.dinodino;

import cl.duoc.dinodino.DTO.DinosaurioDTO;
import cl.duoc.dinodino.DTO.EstegosaurioDTO;
import cl.duoc.dinodino.DTO.TiranosaurioDTO;
import cl.duoc.dinodino.DTO.VelociraptorDTO;

import cl.duoc.dinodino.Utils.DinosaurioUtils;

public class Dinodino {

    public static void main(String[] args) {
        /*
        DinosaurioDTO juanito = new DinosaurioDTO();
        juanito.setNombre("Juanito");
        juanito.setEpoca("Paleolítico");
        juanito.setColor("Cafe con manchitas");
        
        System.out.println(juanito);
        System.out.println("valida nombre: " + DinosaurioUtils.validaNombre(juanito));
        System.out.println("valida color: " + DinosaurioUtils.validaColor(juanito));
        */
        
        TiranosaurioDTO mirey = new TiranosaurioDTO();
        mirey.setNombre("Mi Rey");
        mirey.setEpoca("Antes de ayer");
        mirey.setColor("Cafe caca");
        mirey.setCantidadDientes(130);
        
        System.out.println(mirey);
        
        
        EstegosaurioDTO este = new EstegosaurioDTO();
        este.setNombre("Esteberto");
        este.setEpoca("Mesolítico");
        este.setColor("Amarillo con rombosman");
        este.setTamanio(30);
        
        System.out.println(este);
        
        VelociraptorDTO velo = new VelociraptorDTO();
        velo.setNombre("Flash");
        velo.setEpoca("Final");
        velo.setColor("Verde");
        
        System.out.println(velo.Rugir());
    }
}
