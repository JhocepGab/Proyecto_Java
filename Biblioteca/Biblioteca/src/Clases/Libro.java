/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jhose
 */
public class Libro {
    public String titulo;
    public String autor;
    public int anio;
    public int nrPag;

    @Override
    public String toString() {
        return  """
                -------------------------
                Titulo: """ + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Año: " + anio + "\n" +
                "Nr Paginas: " + nrPag + "\n" +
                "-------------------------\n";
    }
}
