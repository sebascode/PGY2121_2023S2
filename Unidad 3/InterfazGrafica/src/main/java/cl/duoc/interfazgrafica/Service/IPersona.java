/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.interfazgrafica.Service;

import cl.duoc.interfazgrafica.DTO.PersonaDTO;
import java.util.List;

/**
 *
 * @author scode
 */
public interface IPersona {
    public void Guardar(PersonaDTO p);
    public void Editar(int i, PersonaDTO p);
    public List<PersonaDTO> listar();
    public void Eliminar(PersonaDTO p);
    public PersonaDTO BuscarPorNombre(String nombre);
    public PersonaDTO BuscarPorColor(String color);
}
