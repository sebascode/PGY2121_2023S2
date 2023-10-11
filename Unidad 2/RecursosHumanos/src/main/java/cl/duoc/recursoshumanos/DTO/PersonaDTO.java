package cl.duoc.recursoshumanos.DTO;

public class PersonaDTO {
    private String nombreCompleto;
    private String rut;

    public PersonaDTO(String nombreCompleto, String rut) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
    }
    
    public PersonaDTO() {
        this.nombreCompleto = "";
        this.rut = "";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
}
