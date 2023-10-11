package cl.duoc.herenciatest.models;

public abstract class Dinosaurio {
    private String nombre;
    private boolean escamas;
    private int numeroPatas;
    private String periodo;
    private boolean carnivoro;

    public Dinosaurio(String nombre, boolean escamas, int numeroPatas, String periodo, boolean carnivoro) {
        this.nombre = nombre;
        this.escamas = escamas;
        this.numeroPatas = numeroPatas;
        this.periodo = periodo;
        this.carnivoro = carnivoro;
    }
    
    public Dinosaurio() {
        this.nombre = "";
        this.escamas = false;
        this.numeroPatas = 0;
        this.periodo = "";
        this.carnivoro = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
    // CUSTOM
    public abstract String cantaDinosaurioCanta();
}
