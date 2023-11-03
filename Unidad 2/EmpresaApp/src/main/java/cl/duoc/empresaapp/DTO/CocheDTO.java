package cl.duoc.empresaapp.DTO;

public class CocheDTO {
    /*
    (identificado por la matricula, marca y modelo),
    */
    
    private String matricula;
    private String marca;
    private String modelo;

    public CocheDTO(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public CocheDTO() {
        this.matricula = "";
        this.marca = "";
        this.modelo = "";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
