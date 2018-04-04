/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import proyectofinal_biblioteca_digital.Cliente;
import proyectofinal_biblioteca_digital.Libro;

/**
 *
 * @author aldomora89                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
 */
public class Arbol {

    private NodoArbol raiz;
    private static String salida;

    public void insertar(Libro libro) {//En el metodo insertar lo que se realiza es insertar un numero al arbol, donde por medio del metodo recursivo insertaRec donde se realiza la validacion de que lado del arbol se encuentra
        if (raiz == null) {
            raiz = new NodoArbol(libro);
        } else {
            insertaRec(libro, raiz);
        }
    }

    public Arbol() { //metodo que me permite imprimir si mi arbol esta vacio o no 
        salida = "";
    }

    public void insertaRec(Libro libro, NodoArbol n) {
        /**
         * En este metodo lo que se realiza es el metodo recursivo que se llama
         * desde el metodo insertar Lo que realiza es que acomoda las
         * calificaciones de los libros conforme a la raiz
         */
        if ( libro.getCalificacion() < n.getLibro().getCalificacion()) {//Acomoda a la izquierda
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoArbol(libro));
            } else {
                insertaRec(libro, n.getHijoIzq());
            }
        } else {//Acomoda a la derecha
            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoArbol(libro));
            } else {
                insertaRec(libro, n.getHijoDer());
            }
        }
    }

    public String inOrden() {
        /**
         * El metodo inOrden lo que se hace es realizar como lo dice su nombre,
         * ordena el arbol de mayor a menor
         */
        if (raiz == null) {
            salida = "El arbol se encuentra vacio";
        } else {
            inOrdenRec(raiz);

        }
        return salida;
    }

    private void inOrdenRec(NodoArbol n) {
        /**
         * El metodo inOrdenRec lo que es, es un metodo recursivo donde es
         * llamado desde el metodo inOrden para ordenar en orden
         */
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            salida += "Calificación: " + n.getLibro().getCalificacion() + " " + "( Id: " + n.getLibro().getId() + ": " + n.getLibro().getTitulo() + " " + n.getLibro().getAutor() + " )" + "\n";
            inOrdenRec(n.getHijoDer());
        }

    }

    public String caliAceptable() {
        /**
         * El metodo caliAceptable lo que realiza es que conforme al metodo
         * inOrdenRec lo que realiza es que acomoda las calificaciones de los libros
         * conforme a la raiz ya establecida, y los acomoda al lado derecho.
         */
        if (raiz == null) {
            salida = "El arbol se encuentra vacio";
        } else {
            inOrdenRec(raiz.getHijoDer());

        }
        return salida;
    }

    public String caliRegular() {
        /**
         * El metodo caliRegular lo que hace es acomodar las notas de los
         * libros con calificacion regular por medio del metodoinOrdenrec pero solo
         * recorriendo el lado izquierdo del arbol
         */
        if (raiz == null) {
            salida = "El arbol se encuentra vacio";
        } else {
            inOrdenRec(raiz.getHijoIzq());

        }
        return salida;
    }
}
