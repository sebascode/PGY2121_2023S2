package cl.duoc.herenciamascotas.DTO;

import java.time.LocalDate;

public class MascotaDTO {
    private String nombre;
    private String raza;
    private String color;
    private int chip;
    private LocalDate fechaNacimiento;

    public MascotaDTO(String nombre, String raza, String color, int chip, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.chip = chip;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public MascotaDTO() {
        this.nombre = "";
        this.raza = "";
        this.color = "";
        this.chip = -1;
        this.fechaNacimiento = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // CUSTOM
    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }
    
    @Override
    public String toString(){
        return this.nombre + " ("+this.chip+") ";
    }
}
