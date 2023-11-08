/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.ejemploexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class EjemploExcepciones {

    public static void main(String[] args) {
        boolean salir = true;

        do{
            try{
                System.out.println("Ingrese un numero, no letra, numero:");
                Scanner sc = new Scanner(System.in);
                int numero = sc.nextInt();
                System.out.println("Usted escribio "+ numero);
                
                try{
                    String palabra = null;
                    System.out.println(palabra.length());
                }catch(NullPointerException ex){
                    System.out.println("INTERNAL :::: Error elemento nulo.");
                }
                
                salir = false;
            }catch(Exception ex){
                if(ex.getClass() == NullPointerException.class){
                    System.out.println("Error objeto nulo.");
                }
                if(ex.getClass() == InputMismatchException.class){
                    System.out.println("Error Parámetro entregado no es un número.");
                }
            }
        }while(salir);
    }
}
