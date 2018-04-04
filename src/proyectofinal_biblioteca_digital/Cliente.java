/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_biblioteca_digital;

import Estructuras.Arbol;
/**
 *
 * @author AlMora10
 */
public class Cliente {

    private String Nombre;
    private String Apellido;
    private String Correo;
    private int id;
    private String Telefono;
    private int Edad;
    private String nombreUsuario;
    private Arbol calificacion;

    
    public Arbol getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Arbol calificacion) {
        this.calificacion = calificacion;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Cliente(String Nombre, String Apellido, String Correo, int id, String Telefono, int Edad, String nombreUsuario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.id = id;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.nombreUsuario = nombreUsuario;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return " \nid: " + id + "\nNombre= " + Nombre + "\nApellido= " + Apellido + "\nCorreo= " + Correo + "\nTelefono= " + Telefono + "\nEdad= " + Edad + "\nNombre Usuario= " + nombreUsuario + "";
    }

}
