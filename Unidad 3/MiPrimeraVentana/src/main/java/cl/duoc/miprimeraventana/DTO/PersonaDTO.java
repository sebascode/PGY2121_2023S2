/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.miprimeraventana.DTO;

/**
 *
 * @author Cetecom
 */
public class PersonaDTO {
    private String nombre;
    private String apellido;
    private String colorFavorito;

    public PersonaDTO(String nombre, String apellido, String colorFavorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colorFavorito = colorFavorito;
    }
    public PersonaDTO() {
        this.nombre = "";
        this.apellido = "";
        this.colorFavorito = "";
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

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellido + ": " + this.colorFavorito;
    }
    
}
