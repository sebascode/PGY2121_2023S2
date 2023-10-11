package cl.duoc.dinodino.DTO;

public class EstegosaurioDTO extends DinosaurioDTO {
    private int tamanio;

    public EstegosaurioDTO(int tamanio, String nombre, String epoca, String color) {
        super(nombre, epoca, color);
        this.tamanio = tamanio;
    }

    public EstegosaurioDTO(int tamanio) {
        super();
        this.tamanio = tamanio;
    }
    
    public EstegosaurioDTO(){
        super();
        this.tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean isValid() {
        return (this.tamanio > 30);
    }
    
    
}
