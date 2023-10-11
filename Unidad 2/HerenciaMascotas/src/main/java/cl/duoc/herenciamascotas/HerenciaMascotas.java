package cl.duoc.herenciamascotas;

import cl.duoc.herenciamascotas.DTO.GatoDTO;
import cl.duoc.herenciamascotas.DTO.PerroDTO;

public class HerenciaMascotas {

    public static void main(String[] args) {
        PerroDTO cachupin = new PerroDTO();
        cachupin.setNombre("Cachupin");
        cachupin.setChip(250);
        cachupin.setAulla(true);
        
        GatoDTO misifu = new GatoDTO();
        misifu.setNombre("misifu");
        misifu.setColor("Naranjo");
        misifu.setFechaNacimiento(3, 5, 2018);
        misifu.setOrigen("Irak");
        misifu.setTamanio(30);
        
        
        System.out.println(cachupin);
        System.out.println(misifu);
    }
}
