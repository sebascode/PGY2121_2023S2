package cl.duoc.veterinaria.models;

public class Mascota {
    // métodos
    private int nroChip;
    
    // constructores
    public Mascota(){
        this.nroChip = 0;
    }
    
    public Mascota(int nroChip){
        this.nroChip = nroChip;
    }
    
    // Accesadores
    public int getNroChip(){
        return this.nroChip;
    }
    
    // Mutadores
    public void setNroChip(int nroChip){
        this.nroChip = nroChip;
    }
}