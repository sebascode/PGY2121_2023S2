package cl.duoc.scannertest.models;

import java.time.LocalDate;

public class Persona {
    private static int privateId = 100;
    
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    
    // constructor

    public Persona() {
        this.id = privateId;
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.nacimiento = LocalDate.now();
        
        privateId++;
        // privateId = privateId+1;
    }

    public Persona(String nombre, String apellido, LocalDate nacimiento) {
        this.id = privateId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        privateId++;
    }
    

    public int getId() {
        return id;
    }
    
    /*
    public void setId(int id) {
        this.id = id;
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public void setNacimientoFecha(int day, int month, int year){
        this.nacimiento = LocalDate.of(year, month, day);
    }
    
    public void setNacimientoDefault(){
        this.nacimiento = LocalDate.of(2022, 05, 05);
    }
    
}
