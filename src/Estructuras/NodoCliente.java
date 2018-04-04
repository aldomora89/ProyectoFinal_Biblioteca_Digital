/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Datos.Cliente;

/**
 *
 * @author Colochos
 */
public class NodoCliente {
    
    private Cliente dato;
    private NodoCliente abajo;

    public NodoCliente(Cliente dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Cliente: " + "dato=" + dato + '}';
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoCliente getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoCliente abajo) {
        this.abajo = abajo;
    }
}
