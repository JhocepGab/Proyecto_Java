/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecucion;
import Clases.Libro;
import Clases.Pila;
import java.util.Scanner;
/**
 *
 * @author jhose
 */
public class Program {
    public static void main(String[] args) {
        Pila pl = new Pila();
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            int op;
            
            do {
                for (int i = 0; i < 20; i++) {
                    System.out.println();
                }
                
                System.out.println("------------MENU DE OPCIONES-------------");
                System.out.println("1. Apilar Libro");
                System.out.println("2. Desapilar Libro");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opcion: ");
                
                op = scanner.nextInt();
                scanner.nextLine();
                
                switch (op) {
                    case 0 -> System.out.println("Saliendo...");
                    case 1 -> {
                        Libro l = new Libro();
                        
                        System.out.print("Ingrese su titulo: ");
                        l.titulo = scanner.nextLine();
                        
                        System.out.print("Ingrese autor: ");
                        l.autor = scanner.nextLine();
                        
                        System.out.print("Ingrese Año: ");
                        l.anio = scanner.nextInt();
                        
                        System.out.print("Ingrese Nr de paginas: ");
                        l.nrPag = scanner.nextInt();
                        scanner.nextLine(); // Volvemos a limpiar el enter
                        
                        pl.apilar(l);
                        System.out.println("Libro registrado correctamente");
                    }
                    case 2 -> {
                        Libro l2 = pl.desapilar();
                        
                        if (l2 != null) {
                            System.out.println(l2.toString());
                        } else {
                            System.out.println("Pila Vacia");
                        }
                    }
                }
                if (op != 0) {
                    System.out.println("\nPresione ENTER para continuar...");
                    scanner.nextLine();
                }
                
            } while (op != 0);
        }
    }
}
