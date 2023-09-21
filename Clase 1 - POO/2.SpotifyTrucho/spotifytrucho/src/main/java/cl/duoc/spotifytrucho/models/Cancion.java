package cl.duoc.spotifytrucho.models;

import java.time.LocalTime;

public class Cancion {
    /*
     * La canción tiene un título, un artista,tiempo de duración,
     * si es favorita o no y si se encuentra descargada o noen el dispositivo.
     */
    private int id;
    private String titulo;
    private String artista;
    private LocalTime duracion;
    private boolean favorita;
    private boolean descargada;

    // Constructor con parámetros
    public Cancion(){
        this.id = 0;
        this.titulo = "";
        this.artista = "";
        this.duracion = LocalTime.of(0, 0, 0);
        this.favorita = false;
        this.descargada = false;
    }

    public Cancion(int id, String titulo, String artista, LocalTime duracion, boolean favorita, boolean descargada){
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }

    // Getters
    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getArtista(){
        return this.artista;
    }
    public LocalTime getDuracion(){
        return this.duracion;
    }
    public String getDuracionStr(){
        return this.duracion.getMinute() + ":" +this.duracion.getSecond();
    }
    public boolean getFavorita(){
        return this.favorita;
    }
    public boolean getDescargada(){
        return this.descargada;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setDuracion(int minutos, int segundos){
        this.duracion = LocalTime.of(0, minutos, segundos);
    }
    public void setFavorita(boolean favorita){
        this.favorita = favorita;
    }
    public void setDescargada(boolean descargada){
        this.descargada = descargada;
    }

    // Custom
    public void Adelantar(int minutos, int segundos){
        this.duracion.minusMinutes(minutos);
        this.duracion.minusSeconds(segundos);
    }

    public void Retroceder(int minutos, int segundos){
        this.duracion.plusMinutes(minutos);
        this.duracion.plusSeconds(segundos);
    }
}