/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jhose
 */
public class Pila {
    Nodo cima = null;

    // apilar (push)
    public void apilar(Libro d) {
        // 1. Crear Nodo
        Nodo nuevo = new Nodo();
        nuevo.dato = d;

        if (cima == null) {
            cima = nuevo;
        } else {
            nuevo.sig = cima;
            cima = nuevo;
        }
    }
    public Libro desapilar() {
        Libro dato = null;
        if (cima != null) {
            dato = cima.dato;
            cima = cima.sig;
        }
        return dato;
    }
}
