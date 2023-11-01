package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;
import java.time.Period;

public abstract class EmpleadoDTO {
    /*1. Empleado

    Incluye sus datos (nombre, apellidos, DNI, dirección)
    y algunos datos tales como los años de antigüedad,
    teléfono de contacto y su salario.
    
    Incluye también información de quién es el empleado
    que lo supervisa (Empleado *).
    Tendrá, al menos, las siguientes funciones miembro:
        Constructores para definir correctamente un empleado, a partir de su nombre, apellidos, DNI, dirección, teléfono y salario.
        Imprimir (A través de los operadores de E/S redefinidos)
        Cambiar supervisor
        Incrementar salario

    */
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private LocalDate fechaIngreso;
    private int telefono;
    private float salario;
    
    private EmpleadoDTO supervisor;

    public EmpleadoDTO(String nombre, String apellidos, String dni, String direccion, LocalDate fechaIngreso, int telefono, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaIngreso = fechaIngreso;
        this.telefono = telefono;
        this.salario = salario;
    }
    
    public EmpleadoDTO() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.direccion = "";
        this.fechaIngreso = LocalDate.now();
        this.telefono = 0;
        this.salario = 0f;
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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

    public EmpleadoDTO getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(EmpleadoDTO supervisor) {
        this.supervisor = supervisor;
    }
    
    // Imprimir (A través de los operadores de E/S redefinidos)
    @Override
    public String toString(){
        // devuelve el objeto como una cadena de texto.
        return this.nombre + " " + this.apellidos + " ("+ this.dni+") $" + this.salario;
    }
    
    public abstract void Imprimir(); /*{
        // busca el objeto como cadena de texto y lo imprime en consola.
        System.out.println(this.toString());
    }*/
    
    public void setFechaIngreso(int dia, int mes, int anio){
        this.fechaIngreso = LocalDate.of(anio, mes, dia);
    }
    
    public int getAntiguedad(){
        Period p = Period.between(fechaIngreso, LocalDate.now());
        return p.getYears();
    }
    
    // Incrementar salario
    public abstract void IncrementarSalario();
}
