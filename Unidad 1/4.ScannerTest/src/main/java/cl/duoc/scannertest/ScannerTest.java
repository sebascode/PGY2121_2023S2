package cl.duoc.scannertest;

import cl.duoc.scannertest.models.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] params){
        Persona juan = new Persona("Juan", "Menezes", LocalDate.now());
        juan.setNombre("Juan");
        juan.setApellido("Juan");
        juan.setNacimientoFecha(05, 05, 1992);
        
        System.out.println("Juan: "+ juan.getId());
        
        Persona francisco = new Persona();
        
        System.out.println("Francisco: "+ francisco.getId());
        
        Scanner sc = new Scanner(System.in);
        francisco.setNombre(sc.nextLine());
        System.out.println("variable nombre: " +francisco.getNombre());
    }
    
}
