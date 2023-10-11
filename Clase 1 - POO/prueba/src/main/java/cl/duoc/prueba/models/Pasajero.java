package cl.duoc.prueba.models;

import java.time.LocalDate;

public class Pasajero {
    private String rut;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Pasajero(String rut, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Pasajero(){
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = LocalDate.now();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setFechaNacimiento(int dia, int mes, int anio){
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }
    
    // CUSTOM
    public boolean isValid(){
        int validacion = 0;
        if(this.nombre.isEmpty()){
            validacion++;
        }
        if(this.apellido.isEmpty()){
            validacion++;
        }
        if(this.rut.isEmpty()){
            validacion++;
        }
        if(this.fechaNacimiento.equals(LocalDate.now())){
            validacion++;
        }
        return validacion == 0;
    }
    
    public int getEdad(){
        int edad = LocalDate.now().getYear() - this.fechaNacimiento.getYear();
        return edad;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellido + "("+ this.rut +")";
    }
}
