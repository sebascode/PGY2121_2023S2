package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;

public class SecretarioDTO extends EmpleadoDTO {
    /*2. Secretario

Tiene despacho, número de fax e incrementa su salario un 5% anual.
   
    Tendrá, al menos, las siguientes funciones miembro:
    Constructores (debe rellenar la información personal y los datos principales)
    Imprimir (debe imprimir sus datos personales y su puesto en la empresa).

    */
    
    private boolean despacho;
    private int fax;
    private final int porc = 5;

    public SecretarioDTO(boolean despacho, int fax, String nombre, String apellidos, String dni, String direccion, LocalDate fechaIngreso, int telefono, float salario) {
        super(nombre, apellidos, dni, direccion, fechaIngreso, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    public SecretarioDTO(boolean despacho, int fax) {
        super();
        this.despacho = despacho;
        this.fax = fax;
    }
    
    public SecretarioDTO(){
        super();
        this.despacho = false;
        this.fax = 0;
    }

    public boolean isDespacho() {
        return despacho;
    }

    public void setDespacho(boolean despacho) {
        this.despacho = despacho;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }
    
    @Override
    public void Imprimir() {
        System.out.println("::::Secretario::::");
        System.out.println(super.toString());
        System.out.println(this.despacho);
        System.out.println(this.fax);
    }

    @Override
    public void IncrementarSalario() {
        float salarioNuevo = super.getSalario() * this.porc / 100;
        super.setSalario(salarioNuevo);
    }
    
    
}
