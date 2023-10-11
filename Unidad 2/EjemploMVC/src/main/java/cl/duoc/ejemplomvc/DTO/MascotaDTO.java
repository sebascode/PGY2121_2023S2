package cl.duoc.ejemplomvc.DTO;

public class MascotaDTO {
    private String nombre;
    private String raza;
    private int nroChip;

    public MascotaDTO(String nombre, String raza, int nroChip) {
        this.nombre = nombre;
        this.raza = raza;
        this.nroChip = nroChip;
    }

    public MascotaDTO(){
        this.nombre= "";
        this.raza = "";
        this.nroChip = -1;
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

    public int getNroChip() {
        return nroChip;
    }

    public void setNroChip(int nroChip) {
        this.nroChip = nroChip;
    }
    
    @Override
    public String toString(){
        return this.nombre + " "+ this.nroChip + " - "+ this.raza;
    }
}
