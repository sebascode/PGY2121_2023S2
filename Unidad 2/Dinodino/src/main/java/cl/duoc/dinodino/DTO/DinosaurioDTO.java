package cl.duoc.dinodino.DTO;

public abstract class DinosaurioDTO {
    private String nombre;
    private String epoca;
    private String color;

    public DinosaurioDTO(String nombre, String epoca, String color) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.color = color;
    }
    
    public DinosaurioDTO() {
        this.nombre = "";
        this.epoca = "";
        this.color = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return this.nombre
                + " es de la época "+this.epoca
                + " y de color " + this.color;
    }
    
    public abstract boolean isValid();
}
