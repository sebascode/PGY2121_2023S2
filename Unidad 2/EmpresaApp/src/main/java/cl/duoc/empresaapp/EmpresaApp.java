package cl.duoc.empresaapp;

import cl.duoc.empresaapp.DTO.JefeZonaDTO;
import cl.duoc.empresaapp.DTO.VendedorDTO;

public class EmpresaApp {

    public static void main(String[] args) {
        /* 
        EmpleadoDTO juanito = new EmpleadoDTO();
        EmpleadoDTO francisco = new EmpleadoDTO();
        
        juanito.setNombre("Juan");
        juanito.setApellidos("Rodriguez");
        juanito.setDireccion("Los presidentes 123");
        juanito.setDni("1-9");
        juanito.setSalario(90000);
        juanito.setSupervisor(francisco);
        juanito.setFechaIngreso(31, 10, 2010);
        System.out.println(juanito.getAntiguedad());
        juanito.Imprimir();
        */
        
        VendedorDTO ramirez = new VendedorDTO();
        ramirez.setNombre("Sebastian");
        ramirez.setApellidos("Contreras Ramirez");
        ramirez.darAlta("Francisco Mendez");
        ramirez.darAlta("David Portella");
        ramirez.darAlta("Cristian Barra");
        
        ramirez.Imprimir();
        
        System.out.println("----------------");
        ramirez.darBaja("David Portella");
        
        ramirez.Imprimir();
        
        
        JefeZonaDTO jf = new JefeZonaDTO();
        jf.darAlta(ramirez);
        jf.darAlta(ramirez);
        
        jf.Imprimir();
        
        System.out.println("----------------");
        
        jf.darBaja(ramirez);
        
        jf.Imprimir();
        
    }
}
