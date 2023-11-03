package cl.duoc.empresaapp;

import cl.duoc.empresaapp.DTO.CocheDTO;
import cl.duoc.empresaapp.DTO.EmpleadoDTO;
import cl.duoc.empresaapp.DTO.NoVendedorDTO;
import cl.duoc.empresaapp.DTO.VendedorDTO;
import cl.duoc.empresaapp.Service.EmpleadoService;
import cl.duoc.empresaapp.Service.IEmpleadoService;
import java.util.ArrayList;
import java.util.List;

public class EmpresaApp {

    public static void main(String[] args) {
        /*
        EmpleadoDTO emp = new EmpleadoDTO();
        
        emp.setNombre("Sebastian");
        emp.setApellidos("Contreras el bacano");
        emp.setDni("1-9");
        emp.setDireccion("Tu perrito 123");
        emp.setFechaContrato(31, 8, 2020);
        emp.setSalario(100000);
        
        emp.Imprimir();
        */
        VendedorDTO v = new VendedorDTO();
        v.setNombre("David");
        v.setApellidos("El Vendedor");
        v.setCoche(new CocheDTO("ASDF","FDSA","FDSA"));

        v.DarAlta("Cencosud");
        v.DarAlta("Prosegur");
        v.Imprimir();
        System.out.println("==============");
        v.DarBaja("Prosegur");
        v.Imprimir();
        
        VendedorDTO su = new VendedorDTO();
        
        IEmpleadoService app = new EmpleadoService();
        app.AsignarSupervisor(v, su);
    }
}
