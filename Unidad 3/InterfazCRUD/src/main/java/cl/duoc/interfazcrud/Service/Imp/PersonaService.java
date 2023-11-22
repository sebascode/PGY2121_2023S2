package cl.duoc.interfazcrud.Service.Imp;

import cl.duoc.interfazcrud.DTO.PersonaDTO;
import cl.duoc.interfazcrud.Service.IPersona;
import java.util.ArrayList;
import java.util.List;

public class PersonaService implements IPersona {

    List<PersonaDTO> lista = new ArrayList<>();
    
    @Override
    public void Guardar(PersonaDTO p) {
        this.lista.add(p);
    }

    @Override
    public List<PersonaDTO> Listar() {
        return this.lista;
    }
    
}
