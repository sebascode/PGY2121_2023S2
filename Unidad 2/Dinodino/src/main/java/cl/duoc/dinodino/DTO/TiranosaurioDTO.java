package cl.duoc.dinodino.DTO;

public class TiranosaurioDTO extends DinosaurioDTO {
    private int cantidadDientes;

    public TiranosaurioDTO(int cantidadDientes, String nombre, String epoca, String color) {
        super(nombre, epoca, color);
        this.cantidadDientes = cantidadDientes;
    }

    public TiranosaurioDTO(int cantidadDientes) {
        super();
        this.cantidadDientes = cantidadDientes;
    }
    
    
    public TiranosaurioDTO() {
        super();
        this.cantidadDientes = 0;
    }

    public int getCantidadDientes() {
        return cantidadDientes;
    }

    public void setCantidadDientes(int cantidadDientes) {
        this.cantidadDientes = cantidadDientes;
    }
    
    @Override
    public String toString(){
        return this.getNombre() + " tiene "+ this.cantidadDientes
                + " dientes";
    }

    @Override
    public boolean isValid() {
        return (this.cantidadDientes > 30);
    }
}
