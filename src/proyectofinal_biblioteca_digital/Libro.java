/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_biblioteca_digital;

import Estructuras.Arbol;

/**
 *
 * @author aldomora89
 */
public class Libro { // en este clase libro se van a establecer cada uno de los atributos de este objeto

    private int id;
    private String Titulo;
    private String Autor;
    private String Tipo;
    private String Ubicacion;
    private int Calificacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public Libro(int id, String Titulo, String Autor, String Tipo, String Ubicacion) {
        this.id = id;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Tipo = Tipo;
        this.Ubicacion = Ubicacion;
   
    }

 

    @Override
    public String toString() {
        return "\nLibro: " + "\nid= " + id + "\nTitulo= " + Titulo + "\nAutor= " + Autor + "\nTipo= " + Tipo + "\nUbicacion= " + Ubicacion + "\nCalificacion= " + Calificacion + '}';
    }



}
