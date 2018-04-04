/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Datos.Libro;

/**
 *
 * @author aldomora89
 */
public class NodoArbol {

    /**
     * Se generan objetos de tipo libro y 2 de tipo NodoArbol para asi
     * poder generar los respectivos gets y sets y constructores.
     */
    private Libro libro;//se encuentran los datos del libro

    private NodoArbol hijoIzq;//Se hace referencia al hijo izquierdo del arbol
    private NodoArbol hijoDer;//Se hace referencia al hijo derecho del arbol

    public NodoArbol(Libro libro) {
        this.libro = libro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
    
 
    

}
