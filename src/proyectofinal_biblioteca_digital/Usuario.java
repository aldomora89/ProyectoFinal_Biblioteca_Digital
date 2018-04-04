/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_biblioteca_digital;

import Datos.Cliente;

/**
 *
 * @author aldomora89
 */
public class Usuario {

    private String nombre;
    private String password;
    private String rol;
    private Bibliotecario bibliotecario;
    private Cliente cliente;
    private int id;
   

    public Usuario(String nombre, String password, String rol, int id) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + ", rol=" + rol + ", id=" + id + '}';
    }
    
    
    
}
