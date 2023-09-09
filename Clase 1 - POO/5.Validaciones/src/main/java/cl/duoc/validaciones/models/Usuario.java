package cl.duoc.validaciones.models;

public class Usuario {
    private static int id_interno = 100;
    
    private String usuario;
    private String password;
    private int id;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        setCurrentId();
    }    
    
    public Usuario(){
        this.usuario = "Usuario no valido";
        this.password = "Sin Password";
        setCurrentId();
    }
    
    private void setCurrentId(){
        this.id =  id_interno;
        id_interno = id_interno +20;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
    
    // CUSTOM
    @Override
    public String toString(){
        String mensaje = "Hola, yo soy "+ this.usuario;
        mensaje += " y tengo de pass "+ this.password;
        mensaje += " y me identifico con "+ this.id;
        
        return mensaje;
    }
}
