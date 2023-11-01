package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JefeZonaDTO extends EmpleadoDTO {
    /*
    Tiene despacho, tiene un secretario a su cargo,
    una lista de vendedores a su cargo y
    tiene coche de la empresa
    Incrementa su salario un 20% anual.
    
    Tendrá, al menos, las siguientes funciones miembro:
        Constructores (debe rellenar la información personal y los datos principales)
        Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
        Cambiar de secretario.
        Cambiar de coche.
        Dar de alta y de baja un nuevo vendedor en su zona.
    */
    
    private String despacho;
    private SecretarioDTO secretario;
    private List<VendedorDTO> vendedores;
    private CocheDTO coche;
    
    private final float porc = 20;

    public JefeZonaDTO(String despacho, SecretarioDTO secretario, List<VendedorDTO> vendedores, CocheDTO coche, String nombre, String apellidos, String dni, String direccion, LocalDate fechaIngreso, int telefono, float salario) {
        super(nombre, apellidos, dni, direccion, fechaIngreso, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    public JefeZonaDTO(String despacho, SecretarioDTO secretario, List<VendedorDTO> vendedores, CocheDTO coche) {
        super();
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }
    
    public JefeZonaDTO() {
        super();
        this.despacho = "";
        this.secretario = new SecretarioDTO();
        this.vendedores = new ArrayList<>();
        this.coche = null;
    }
    

    @Override
    public void Imprimir() {
        System.out.println("::::Jefe Zona::::");
        System.out.println(super.toString());
        
        int contador = 0;
        System.out.println("Vendedores: ");
        for(VendedorDTO vendedor : this.vendedores){
            contador++;
            System.out.println("\t"+contador + ": " + vendedor.getNombre() + " " + vendedor.getApellidos());
        }
    }

    @Override
    public void IncrementarSalario() {
        float salarioNuevo = super.getSalario() * this.porc / 100;
        super.setSalario(salarioNuevo);
    }
    
    public void darAlta(VendedorDTO v){
        this.vendedores.add(v);
    }
    
    public void darBaja(VendedorDTO v){
        this.vendedores.remove(v);
    }
}
