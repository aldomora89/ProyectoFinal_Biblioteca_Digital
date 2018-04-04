/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import proyectofinal_biblioteca_digital.Usuario;

/**
 *
 * @author AlMora10
 */
public class NodoUsuarios {

    private Usuario dato;
    private NodoUsuarios next;

    public NodoUsuarios(Usuario dato) {
        this.dato = dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuarios getNext() {
        return next;
    }

    public void setNext(NodoUsuarios next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoUsuarios{" + "dato=" + dato + '}';
    }

    
    
    

}
