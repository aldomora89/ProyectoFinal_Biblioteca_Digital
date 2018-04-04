/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Estructuras.PilaCliente;

/**
 *
 * @author Colochos
 */
public class Prestamo {
    
    PilaCliente cliente;
    private int periodo;
    private Boolean estado;
    private String multa;
    

    public PilaCliente getCliente() {
        return cliente;
    }

    public void setCliente(PilaCliente cliente) {
        this.cliente = cliente;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public Prestamo(PilaCliente cliente, int periodo, Boolean estado, String multa) {
        this.cliente = new PilaCliente();
        this.periodo = periodo;
        this.estado = estado;
        this.multa = multa;
    }

    public Prestamo() {
    }

    @Override
    public String toString() {
        return "Prestamo{" + "cliente=" + cliente + ", periodo=" + periodo + ", estado=" + estado + ", multa=" + multa + '}';
    }
    
    
    
}
