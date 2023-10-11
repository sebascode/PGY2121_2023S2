package cl.duoc.registroclinico.Service.impl;

import cl.duoc.registroclinico.DTO.PacienteDTO;
import cl.duoc.registroclinico.Service.IPacienteService;
import java.util.ArrayList;
import java.util.List;

public class PacienteServiceImpl implements IPacienteService {

    List<PacienteDTO> baseDatos;
    
    public PacienteServiceImpl(){
        baseDatos = new ArrayList<>();
    }
    
    @Override
    public void CrearPaciente(PacienteDTO obj) {
        baseDatos.add(obj);
    }

    @Override
    public void ActualizarPaciente(int indice, PacienteDTO obj) {
        baseDatos.set(indice, obj);
    }

    @Override
    public PacienteDTO obtenerPaciente(int indice) {
        return baseDatos.get(indice);
    }

    @Override
    public void EliminarPaciente(int indice) {
        baseDatos.remove(indice);
    }

    @Override
    public List<PacienteDTO> listarPacientes() {
        
        int i = 0;
        for (PacienteDTO elemento : baseDatos) {
            System.out.println(i + ": "+ elemento);
            i++;
        }
        
        return baseDatos;
    }
    
}
