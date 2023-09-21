package cl.duoc.miscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiScanner {
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numeros:");
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        
        System.out.println("Escribiste: ");
        System.out.println("Input 1: "+ input);
        System.out.println("Input 2: "+ input2);
        System.out.println("Input 3: "+ input3);
    }
    */
    
    /*
    Pedir una cantidad de nombres a ingresar
    para luego solicitar uno por uno los nombres.
    Al finalizar el proceso, imprimir el resultado.-
    */
    public static void main(String[] params){
        // Configurar
        Scanner sc = new Scanner(System.in);
        List lista = new ArrayList<String>();
        int cantidad;
        
        // La ejecuchon
        System.out.println("Ingresa la cantidad de nombres a pedir:");
        cantidad = Integer.parseInt(sc.nextLine());
        
        for(int indice = 0; indice < cantidad; indice++){
            System.out.println("Ingrese nombre n°"+ (indice+1) +": ");
            String nombre = sc.nextLine();
            lista.add(nombre);
        }

        for(int indice = 0; indice < lista.size(); indice++){
            System.out.println("Nombre: " + lista.get(indice));
        }
    }
}
