package cl.duoc.registroclinico;

import cl.duoc.registroclinico.DTO.PacienteDTO;
import cl.duoc.registroclinico.Service.IPacienteService;
import cl.duoc.registroclinico.Service.impl.PacienteServiceImpl;

public class RegistroClinico {

    public static void main(String[] args) {
        PacienteDTO p = new PacienteDTO();
        p.setId(10);
        p.setFechaNacimiento(3,5,1992);
        p.setNombreCompleto("David de la Cruz Manolito");
        
        System.out.println(p);
        
        PacienteDTO p2 = new PacienteDTO();
        p2.setId(11);
        p2.setNombreCompleto("asdfasdf");
        p2.setFechaNacimiento(3, 10, 2000);
        
        IPacienteService servicio = new PacienteServiceImpl();
        servicio.CrearPaciente(p);
        servicio.CrearPaciente(p2);
        
        servicio.listarPacientes();
        
        // eliminamos
        servicio.EliminarPaciente(0);
        System.out.println("Eliminado el 0");
         servicio.listarPacientes();
         
        servicio.CrearPaciente(p);
        servicio.listarPacientes();
    }
}