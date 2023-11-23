package cl.duoc.prueba.Service;

import cl.duoc.prueba.DTO.PasajeDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scode
 */
public class PasajeService implements IPasajeService, IPrueba {

    private List<PasajeDTO> list;
    
    public PasajeService(){
        list = new ArrayList<>();
    }
    
    @Override
    public void Guardar(PasajeDTO obj) {
        list.add(obj);
    }

    @Override
    public void Gritar() {
        System.out.println("AAAAAAAAAHHH");
    }
    
}
