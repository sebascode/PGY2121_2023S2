package cl.duoc.recursoshumanos.services;

import cl.duoc.recursoshumanos.DTO.PersonaDTO;

public class PersonaService {
    private PersonaDTO persona;
    
    public void CrearPersona(PersonaDTO persona){
        this.persona = persona;
    }
    
    public void ActualizarPersona(PersonaDTO persona){
        this.persona = persona;
    }
    
    public void EliminarPersona(){
        this.persona = null;
    }
    
    public PersonaDTO TraerPersona(){
        return this.persona;
    }
}
