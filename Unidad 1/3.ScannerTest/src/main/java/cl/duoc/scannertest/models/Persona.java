package cl.duoc.scannertest.models;

import java.util.Date;

public class Persona {
    private static int privadoID = 10;
    
    private int id;
    private String nombre;
    private String apellido;
    private Date birthday;
    private String rut;
    private String direccion;
    private boolean casado;

    public Persona(){
        this.id = privadoID;
        this.nombre = "";
        this.apellido = "";
        this.birthday = new Date();
        this.rut = "";
        this.direccion = "";
        this.casado = false;
        
        // incrementamos el valor del id estático
        privadoID = privadoID+1;
    }
    public Persona(String nombre, String apellido, Date birthday, String rut, String direccion, boolean casado) {
        this.id = privadoID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.birthday = birthday;
        this.rut = rut;
        this.direccion = direccion;
        this.casado = casado;
        
        // incrementamos el valor del id estático
        privadoID = privadoID+1;
    }    

    public int getId() {
        return id;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public void setBirthday(int year, int month, int day) {
        this.birthday = new Date(year, month, day);
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    
    
    
}
