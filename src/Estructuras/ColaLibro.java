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
public class ColaLibro {
    
    private NodoLibro frente, ultimo;

    public void encola(NodoLibro n) {

        if (frente == null) {
            frente = n;
        } else {
            ultimo.setDetras(n);
        }
        ultimo = n;

    }

    public NodoLibro atiende() {

        NodoLibro aux = frente;
        if (aux != null) {
            frente = frente.getDetras();
            aux.setDetras(null);
            if (frente == null) {
                ultimo = null;
            }
        }
        return aux;

    }

    // Metodo para imprimir los libros
    
    @Override
    public String toString() {
        String s = "";
        NodoLibro aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getDetras();
        }
        return s;
    }

    // Metodo para modificar un libro
    
    public void modifica(Libro l) {
        NodoLibro aux = frente;
        while (aux != null) {
            if (l.getAutor().equals(aux.getDato().getAutor())) { // Se compara el ID de la cita con "p" para verificar que existe
                aux.setDato(l);                                    // y si existe la variable p se le asigna a aux. 
            }
            aux = aux.getDetras();
        }
    }
    
    // Metodo para buscar libros
    
    public boolean busca(String genero) { // Este método busca un id de la clase persona, si el id se encuentra en la cola nos retorna
        NodoLibro aux = frente;            // un true y si el id no se encuentra en la cola nos retorna un false.
        boolean encuentra = false;
        while (aux != null) {
            if (genero.equals(aux.getDato().getTipo())) {
                encuentra = true;
            }
            aux = aux.getDetras();
        }
        return encuentra;
    }
    
    // Metodo para eliminar un libro
    
    public String extraer(String titulo){ 
       String msj = "";       
       NodoLibro aux =frente; // Se crea una variable aux de tipo NodoCola        
        while(aux !=null){
            msj += aux;
            if(aux.getDetras() != null && titulo.equals(aux.getDetras().getDato().getTitulo())){ // Se comppara si aux el valor detrás es nulo y si "x" es igual al cita ID del valor que está detrás
              NodoLibro temp =aux.getDetras(); // Se crea una variable temporal que tiene lo que está detras de aux
              aux.setDetras(temp.getDetras()); // Se le asigna a lo que está detrás de aux con lo que tiene temp detrás
            }else{
                if(titulo.equals(aux.getDato().getTitulo())){
                   frente= frente.getDetras();
                }
            }
            aux=aux.getDetras();   
        }
        return msj;
    }
    
}
