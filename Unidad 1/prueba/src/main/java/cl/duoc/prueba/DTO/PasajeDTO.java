package cl.duoc.prueba.models;

import java.time.LocalDate;

public class Pasaje {
    /*Para el pasaje los atributos son:
 número del vuelo
 pasajero
 destino
 fecha
 valor
 número asiento
 trae equipaje o no.
    */
    private int numeroVuelo;
    private Pasajero pasajero;
    private String destino;
    private LocalDate fecha;
    private int valor;
    private int numeroAsiento;
    public boolean traeEquipaje;

    public Pasaje(int numeroVuelo, Pasajero pasajero, String destino, LocalDate fecha, int valor, int numeroAsiento, boolean traeEquipaje) {
        this.numeroVuelo = numeroVuelo;
        this.pasajero = pasajero;
        this.destino = destino;
        this.fecha = fecha;
        this.valor = valor;
        this.numeroAsiento = numeroAsiento;
        this.traeEquipaje = traeEquipaje;
    }
    
    
    public Pasaje() {
        this.numeroVuelo = 0;
        this.pasajero = null;
        this.destino = "";
        this.fecha = LocalDate.now();
        this.valor = 0;
        this.numeroAsiento = 0;
        this.traeEquipaje = false;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) { 
        this.fecha = fecha;
    }
    
    public void setFecha(int dia, int mes, int anio){
        LocalDate fechaAux = LocalDate.of(anio, mes, dia);
        if(fechaAux.isAfter(LocalDate.now())){
            this.fecha = fechaAux;
        }
        else{
            System.out.println("Fecha no válida.");
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor < 10000){
            System.out.println("Valor menor a 10.000 no válido para pasaje.");
        }
        else{
            this.valor = valor;
        }
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        if(numeroAsiento >= 1 && numeroAsiento <= 90){
            this.numeroAsiento = numeroAsiento;
        }
        else{
            System.out.println("Asiento indicado no válido.");
        }
    }

    public boolean isTraeEquipaje() {
        return traeEquipaje;
    }

    public void setTraeEquipaje(boolean traeEquipaje) {
        this.traeEquipaje = traeEquipaje;
    }
    
    // CUSTOM
    public boolean isValid(){
        return LocalDate.now().isAfter(this.fecha);
    }
    
    @Override
    public String toString(){
        
        double extra = 0;
        if(this.traeEquipaje){
            extra = this.valor * 0.20;
        }
        
        String mensaje = "";
        mensaje += "VUELO N° "+ this.numeroVuelo;
        mensaje += "\nCon fecha: "+this.fecha;
        mensaje += "\nAsiento N°:"+this.numeroAsiento;
        mensaje += "\nCon destino a "+this.destino;
        mensaje += "\n"+this.pasajero;
        mensaje += "\nValor Pasaje: $"+this.valor;
        mensaje += "\nExtra por Equipaje: $"+ extra;
        mensaje += "\nTotal: $"+ (this.valor + extra);
        
        return mensaje;
    }
    
}
