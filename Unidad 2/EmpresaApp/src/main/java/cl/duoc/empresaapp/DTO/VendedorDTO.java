package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendedorDTO extends EmpleadoDTO {

    /*Tiene coche de la empresa 
    teléfono móvil, área de venta, lista de clientes y
    porcentaje que se lleva de las ventas en concepto de 
    comisiones.
    Incrementa su salario un 10% anual.
    
    Tendrá, al menos, las siguientes funciones miembro:

Constructores (debe rellenar la información personal y los datos principales)
Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
Dar de alta un nuevo cliente.
Dar de baja un cliente.
Cambiar de coche.
    */
    private CocheDTO coche;
    private int celular;
    private String areaVenta;
    private List<String> clientes;
    private float porcentajeVentas;
    
    private final int porc = 10;

    public VendedorDTO(CocheDTO coche, int celular, String areaVenta, List<String> clientes, float porcentajeVentas, String nombre, String apellidos, String dni, String direccion, int telefono, float salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.celular = celular;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.porcentajeVentas = porcentajeVentas;
    }

    public VendedorDTO(CocheDTO coche, int celular, String areaVenta, List<String> clientes, float porcentajeVentas, String nombre, String apellidos, String dni, String direccion, int telefono, float salario, LocalDate fechaContrato, EmpleadoDTO supervisor) {
        super(nombre, apellidos, dni, direccion, telefono, salario, fechaContrato, supervisor);
        this.coche = coche;
        this.celular = celular;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.porcentajeVentas = porcentajeVentas;
    }

    public VendedorDTO(CocheDTO coche, int celular, String areaVenta, List<String> clientes, float porcentajeVentas) {
        this.coche = coche;
        this.celular = celular;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.porcentajeVentas = porcentajeVentas;
    }

    public VendedorDTO() {
        this.coche = null;
        this.celular = 0;
        this.areaVenta = "";
        this.clientes = new ArrayList<>();
        this.porcentajeVentas = 0;
    }

    public CocheDTO getCoche() {
        return coche;
    }

    public void setCoche(CocheDTO coche) {
        this.coche = coche;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public List<String> getClientes() {
        return clientes;
    }

    public void setClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    public float getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(float porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }
    
    
    
    
    @Override
    public void IncrementarSalario() {
        float porcSalario = this.getSalario() * this.porc / 100;
        super.setSalario(this.getSalario() + porcSalario);
    }
    
    // dar de alta
    public void DarAlta(String cliente){
        this.clientes.add(cliente);
    }
    
    // dar de baja
    public void DarBaja(String cliente){
        this.clientes.remove(cliente);
    }
    
    public void Imprimir(){
        int cont = 0;
        for(String cliente : this.clientes){
            cont++;
            System.out.println(cont +": "+cliente);
        }
    }
}
