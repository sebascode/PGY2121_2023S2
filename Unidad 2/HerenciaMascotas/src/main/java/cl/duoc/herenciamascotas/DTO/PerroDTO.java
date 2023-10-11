package cl.duoc.herenciamascotas.DTO;

import java.time.LocalDate;

public class PerroDTO extends MascotaDTO {
    private String tipoPelo;
    private boolean aulla;

    public PerroDTO(String tipoPelo, boolean aulla, String nombre, String raza, String color, int chip, LocalDate fechaNacimiento) {
        super(nombre, raza, color, chip, fechaNacimiento);
        this.tipoPelo = tipoPelo;
        this.aulla = aulla;
    }

    public PerroDTO(String tipoPelo, boolean aulla) {
        super();
        this.tipoPelo = tipoPelo;
        this.aulla = aulla;
    }
    
    public PerroDTO(){
        super();
        this.tipoPelo = "";
        this.aulla = false;
    }

    
    
    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public boolean isAulla() {
        return aulla;
    }

    public void setAulla(boolean aulla) {
        this.aulla = aulla;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", aulla? "+ this.aulla;
    }
}
