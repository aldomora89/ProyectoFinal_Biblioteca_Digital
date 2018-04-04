/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Datos.Bibliotecario;

/**
 *
 * @author aldomora89
 */
public class NodoBibliotecario {
    
    private NodoBibliotecario atras;
    
    private Bibliotecario nodobiblio;

    public NodoBibliotecario(Bibliotecario nodobiblio) {
        this.nodobiblio = nodobiblio;
    }

    public NodoBibliotecario getAtras() {
        return atras;
    }

    public void setAtras(NodoBibliotecario atras) {
        this.atras = atras;
    }

    public Bibliotecario getNodobiblio() {
        return nodobiblio;
    }

    public void setNodobiblio(Bibliotecario nodobiblio) {
        this.nodobiblio = nodobiblio;
    }

    @Override
    public String toString() {
        return "NodoBibliotecario{" + "nodobiblio=" + nodobiblio + '}';
    }
    
    
}
