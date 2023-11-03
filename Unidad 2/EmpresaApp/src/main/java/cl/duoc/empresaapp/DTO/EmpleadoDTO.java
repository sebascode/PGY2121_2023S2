package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;
import java.time.Period;

public abstract class EmpleadoDTO {
    /*
    nombre, apellidos, DNI, dirección
    antigüedad, teléfono de contacto
    salario. 
    
    Incluye también información de quién es el empleado que lo supervisa (Empleado *). Tendrá, al menos, las siguientes funciones miembro:
Constructores para definir correctamente un empleado, a partir de su nombre, apellidos, DNI, dirección, teléfono y salario.
Imprimir (A través de los operadores de E/S redefinidos)
Cambiar supervisor
Incrementar salario
    */
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int telefono;
    private float salario;
    private LocalDate fechaContrato;
    
    private EmpleadoDTO supervisor;

    public EmpleadoDTO(String nombre, String apellidos, String dni, String direccion, int telefono, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public EmpleadoDTO(String nombre, String apellidos, String dni, String direccion, int telefono, float salario, LocalDate fechaContrato, EmpleadoDTO supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
        this.supervisor = supervisor;
    }
    
    
    public EmpleadoDTO() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = 0;
        this.salario = 0f;
        this.fechaContrato = LocalDate.now();
        this.supervisor = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public EmpleadoDTO getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(EmpleadoDTO supervisor) {
        this.supervisor = supervisor;
    }
    
    // custom
    
    // antiguedad
    public void setFechaContrato(int dia, int mes, int anio){
        this.fechaContrato = LocalDate.of(anio, mes, dia);
    }
    
    public int getAntiguedad(){
        Period p = Period.between(fechaContrato, LocalDate.now());
        return p.getYears();
    }
    
    // Imprimir (A través de los operadores de E/S redefinidos)
    public void Imprimir(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellidos
                 + " ("+ this.dni + ") \n";
    }
    
    public abstract void IncrementarSalario();
}
