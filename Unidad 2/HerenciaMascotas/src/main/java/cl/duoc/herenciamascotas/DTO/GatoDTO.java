package cl.duoc.herenciamascotas.DTO;

import java.time.LocalDate;

public class GatoDTO extends MascotaDTO {
    private int tamanio;
    private String origen;

    public GatoDTO(int tamanio, String origen, String nombre, String raza, String color, int chip, LocalDate fechaNacimiento) {
        super(nombre, raza, color, chip, fechaNacimiento);
        this.tamanio = tamanio;
        this.origen = origen;
    }

    public GatoDTO(int tamanio, String origen) {
        super();
        this.tamanio = tamanio;
        this.origen = origen;
    }
    
    public GatoDTO(){
        super();
        this.tamanio = -1;
        this.origen = "";
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + ", mide " + this.tamanio + "cm y es de " + this.origen;
    }
}
