package cl.duoc.ejerciciomenuusuario.models;

public class Usuario {
    private String nombre;
    private String email;
    private String rut;
    private String password;

    public Usuario(){
        this.nombre = "Sin nombre";
        this.email = "Sin email";
        this.rut = "0-0";
        this.password = "Sin password";
    }
    
    public Usuario(String nombre, String email, String rut, String password) {
        this.nombre = nombre;
        this.email = email;
        this.rut = rut;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return this.nombre+ " (" + this.rut + ") " + " " + this.email + " " + this.password;
    }
}
