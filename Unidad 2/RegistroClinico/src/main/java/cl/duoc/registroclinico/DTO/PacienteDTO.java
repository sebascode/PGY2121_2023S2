package cl.duoc.registroclinico.DTO;

import java.time.LocalDate;

public class PacienteDTO {
    private int id;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;

    public PacienteDTO(int id, String nombreCompleto, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public PacienteDTO(int id){
        this.id = id;
        this.nombreCompleto = "";
        this.fechaNacimiento = LocalDate.now();
    }

    public PacienteDTO(){
        this.id = -1;
        this.nombreCompleto = "";
        this.fechaNacimiento = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
    
    @Override
    public String toString(){
        return this.nombreCompleto + " "
                + this.fechaNacimiento.toString() + " "
                + this.id;
    }
}
