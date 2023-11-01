package cl.duoc.empresaapp.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendedorDTO extends EmpleadoDTO {
    /*
    Tiene coche de la empresa, teléfono móvil, área de venta,
    lista de clientes y porcentaje que se lleva de las ventas en concepto de comisiones.
    Incrementa su salario un 10% anual.
    
    Tendrá, al menos, las siguientes funciones miembro:

    Constructores (debe rellenar la información personal y los datos principales)
    Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
    Dar de alta un nuevo cliente.
    Dar de baja un cliente.
    Cambiar de coche.
    */
    
    private CocheDTO coche;
    private int movil;
    private String areaVenta;
    private float recorteComisiones;
    private List<String> listaClientes;
    private final int porc = 10;

    public VendedorDTO(CocheDTO coche, int movil, String areaVenta, float recorteComisiones, List<String> listaClientes, String nombre, String apellidos, String dni, String direccion, LocalDate fechaIngreso, int telefono, float salario) {
        super(nombre, apellidos, dni, direccion, fechaIngreso, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.recorteComisiones = recorteComisiones;
        this.listaClientes = listaClientes;
    }

    public VendedorDTO(CocheDTO coche, int movil, String areaVenta, float recorteComisiones, List<String> listaClientes) {
        super();
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.recorteComisiones = recorteComisiones;
        this.listaClientes = listaClientes;
    }
    
    public VendedorDTO(){
        super();
        this.coche = null;
        this.movil = 0;
        this.areaVenta = "";
        this.recorteComisiones = 0;
        this.listaClientes = new ArrayList<>();
    }

    public CocheDTO getCoche() {
        return coche;
    }

    public void setCoche(CocheDTO coche) {
        this.coche = coche;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public float getRecorteComisiones() {
        return recorteComisiones;
    }

    public void setRecorteComisiones(float recorteComisiones) {
        this.recorteComisiones = recorteComisiones;
    }

    public List<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public void Imprimir() {
        System.out.println("::::Vendedor::::");
        System.out.println(super.toString());
        System.out.println(this.movil);
        System.out.println(this.areaVenta);
        System.out.println(this.recorteComisiones);
        
        int contador = 0;
        System.out.println("Clientes: ");
        for(String cliente : this.listaClientes){
            contador++;
            System.out.println("\t"+contador + ": " + cliente);
        }
    }

    @Override
    public void IncrementarSalario() {
        float salarioNuevo = super.getSalario() * this.porc / 100;
        super.setSalario(salarioNuevo);
    }
    
    /*
    Dar de alta un nuevo cliente.
    Dar de baja un cliente.
    */
    public void darAlta(String cliente){
        this.listaClientes.add(cliente);
    }
    public void darBaja(String cliente){
        this.listaClientes.remove(cliente);
    }
}
