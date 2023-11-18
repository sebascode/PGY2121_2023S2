/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.interfazgrafica.Service;

import cl.duoc.interfazgrafica.DTO.PersonaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scode
 */
public class PersonaService implements IPersona {

    List<PersonaDTO> lista;
    
    public PersonaService(){
        this.lista = new ArrayList<>();
        
        this.lista.add(new PersonaDTO("Joaquin","Amarillo"));
        this.lista.add(new PersonaDTO("Sebastian","Negro como ex"));
    }
    
    @Override
    public void Guardar(PersonaDTO p) {
        this.lista.add(p);
    }

    @Override
    public void Editar(int i, PersonaDTO p) {
        this.lista.add(i, p);
    }

    @Override
    public List<PersonaDTO> listar() {
        return this.lista;
    }

    @Override
    public void Eliminar(PersonaDTO p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO BuscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PersonaDTO BuscarPorColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
