package cl.duoc.interfazcrud.Service;

import cl.duoc.interfazcrud.DTO.PersonaDTO;
import java.util.List;

public interface IPersona {
    public void Guardar(PersonaDTO p);
    
    public List<PersonaDTO> Listar();
}
