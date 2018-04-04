/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Datos.Libro;

/**
 *
 * @author Colochos
 */
public class NodoLibro {
    
    private Libro dato;
    private NodoLibro detras;

    public NodoLibro(Libro dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Libro: " + "dato: " + dato;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public NodoLibro getDetras() {
        return detras;
    }

    public void setDetras(NodoLibro detras) {
        this.detras = detras;
    }
}
