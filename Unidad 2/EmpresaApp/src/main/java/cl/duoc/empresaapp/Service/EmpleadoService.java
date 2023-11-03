package cl.duoc.empresaapp.Service;

import cl.duoc.empresaapp.DTO.EmpleadoDTO;
import cl.duoc.empresaapp.DTO.VendedorDTO;

public class EmpleadoService implements IEmpleadoService {

    @Override
    public void AsignarSupervisor(EmpleadoDTO emp, EmpleadoDTO supervisor){        
        // Supervisor debe ser clase Vendedor
        if(supervisor.getClass() == VendedorDTO.class ){
            emp.setSupervisor(supervisor);
            System.out.println("Guardado pulento");
        }else{
            System.out.println("No se puede crear asi po loco");
        }
    }
    
}
