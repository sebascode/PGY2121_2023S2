/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.interfazgrafica.DTO;

/**
 *
 * @author scode
 */
public class PersonaDTO {
    private String nombre;
    private String color;

    public PersonaDTO(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public PersonaDTO() {
        this.nombre = "";
        this.color = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return this.nombre + " - " + this.color;
    }
    
}
