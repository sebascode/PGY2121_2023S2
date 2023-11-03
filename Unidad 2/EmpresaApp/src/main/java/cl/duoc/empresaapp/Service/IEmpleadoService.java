package cl.duoc.empresaapp.Service;

import cl.duoc.empresaapp.DTO.EmpleadoDTO;

public interface IEmpleadoService {
    public void AsignarSupervisor(EmpleadoDTO emp, EmpleadoDTO supervisor);
}
