package cl.duoc.dinodino.DTO;

public class VelociraptorDTO extends DinosaurioDTO {
    public String Rugir(){
        return "Raaaawwwrr";
    }

    @Override
    public boolean isValid() {
        return this.getNombre().length() > 3;
    }
}
