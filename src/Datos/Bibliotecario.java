/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author aldomora89
 */
public class Bibliotecario {
    
    private int id;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String nombreUsuario;
    private int telefono;
    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Bibliotecario() {
    }

    public Bibliotecario(int id, String Nombre, String Apellido, String Correo, String nombreUsuario, int telefono, int edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + ", nombreUsuario=" + nombreUsuario + ", telefono=" + telefono + ", edad=" + edad + '}';
    }
    
    
    
}
