package cl.duoc.scannertest;

import cl.duoc.scannertest.models.Persona;
import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Sebastian");
        p1.setApellido("Contreras");
        p1.setBirthday(1992, 05, 03);
        
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        System.out.println(p1.getId());
        System.out.println(p2.getId());
        System.out.println(p3.getId());
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre+", welcome!");
    }
}
