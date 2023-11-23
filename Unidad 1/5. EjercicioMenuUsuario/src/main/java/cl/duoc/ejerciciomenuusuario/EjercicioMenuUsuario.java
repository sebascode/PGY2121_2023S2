package cl.duoc.ejerciciomenuusuario;

import cl.duoc.ejerciciomenuusuario.models.Usuario;
import java.util.Scanner;

public class EjercicioMenuUsuario {

    public static int encontrarUsuario(Usuario[] fuenteDatos, String nombre){
        int indice = -1;
        // len(fuenteDatos) --> Largo del array
        for (int i = 0; i < fuenteDatos.length; i++) {
            if(fuenteDatos[i] != null){
                Usuario recorre = fuenteDatos[i];
                if(recorre.getNombre().equals(nombre)){
                    indice = i;
                    break;
                }
            }
        }
        /*
        if(indice >= 0){
            return fuenteDatos[indice];
        }
        else{
            return null;
        }*/
        return indice;
    }
    
    public static void main(String[] args) {
        // DECLARACION
        Scanner sc = new Scanner(System.in);
        // contenedor de 15 usuarios
        Usuario[] arrUsuario = new Usuario[50];
        
        boolean salir = false;
        int indice = 0;
        
        // UTILIZACIÓN
        do{
            System.out.println("Elija una opción");
            System.out.println("1. Ingresar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Modificar Usuario");
            System.out.println("x. Salir");

            String opcion = sc.nextLine();
            // eliminamos espacios en blanco con .trim()
            // convertimos a minúsculas con toLowerCase()
            opcion = opcion.trim().toLowerCase();
            
            switch (opcion) {
                case "1":
                    String nombre;
                    String email;
                    String pass;
                    String rut;
                    
                    System.out.println("Ingresar nombre:");
                    nombre = sc.nextLine();
                    
                    System.out.println("Ingresar email:");
                    email = sc.nextLine();
                    
                    System.out.println("Ingresar pass:");
                    pass = sc.nextLine();
                    
                    System.out.println("Ingresar rut:");
                    rut = sc.nextLine();
                    
                    Usuario user = new Usuario(nombre, email, rut, pass);
                    arrUsuario[indice] = user;
                    indice++;
                    
                    break;
                case "2":
                    for (int i = 0; i < indice; i++) {
                        System.out.println(arrUsuario[i]);
                    }
                    break;
                case "3":
                    // eliminar
                    System.out.println("Ingrese nombre a eliminar:");
                    String nombreEliminar = sc.nextLine();
                    int aEliminar = encontrarUsuario(arrUsuario, nombreEliminar);
                    if(aEliminar < 0){
                        System.out.println("Usuario no encontrado. longy");
                    }
                    else{
                        String nombreEliminado = arrUsuario[aEliminar].getNombre();
                        arrUsuario[aEliminar] = null;
                        System.out.println("Usuario '"+ nombreEliminado + "' a sido eliminado. pium pium");
                    }
                    
                    
                    break;
                case "4":
                    // eliminar
                    System.out.println("Ingrese nombre a editar:");
                    String nombreEditar = sc.nextLine();
                    int aEditar = encontrarUsuario(arrUsuario, nombreEditar);
                    if(aEditar < 0){
                        System.out.println("Usuario no encontrado. longy");
                    }
                    else {
                        
                        Usuario editar = arrUsuario[aEditar];
                        
                        System.out.println("Ingresar nombre:");
                        editar.setNombre(sc.nextLine());

                        System.out.println("Ingresar email:");
                        editar.setEmail(sc.nextLine());

                        System.out.println("Ingresar pass:");
                        editar.setPassword(sc.nextLine());

                        System.out.println("Ingresar rut:");
                        editar.setRut(sc.nextLine());
                    }
                    
                    break;
                case "x":
                    System.out.println("Chaolin");
                    salir = true;
                    break;
                default:
                    System.out.println("No pasó nah");
                    break;
            }
            
            /*
            if("1".equals(opcion.trim().lowerCase())){
                // escogió opción 1.
                System.out.println("a 1");
            }
            else if("2".equals(opcion)){
                // escogió opción 2.
                System.out.println("a 2");
            }
            else if("3".equals(opcion)){
                // escogió opción 3
                System.out.println("a 3");
            }
            else if("4".equals(opcion)){
                // escogió opción 4
                System.out.println("a 4");
            }
            else if("x".equals(opcion)){
                // escogió la muerte
                System.out.println("salir");
                salir = true;
            }
            */
        } while (salir == false);
    }
}
