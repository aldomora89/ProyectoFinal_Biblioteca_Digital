/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Colochos
 */
public class PilaCliente {

    private NodoCliente top;

    public void push(NodoCliente n) {

        if (top == null) {
            top = n;
        } else {
            n.setAbajo(top);
            top = n;
        }
    }

    public NodoCliente pop() {
        NodoCliente aux = top;
        if (aux != null) {
            top = top.getAbajo();
            aux.setAbajo(null);
        }
        return aux;
    }

    public boolean encuentra(int n) {
        NodoCliente aux = top;
        while (aux != null) {
            if (n == aux.getDato().getEdad()) {
                return true;
            }
            aux = aux.getAbajo();
        }
        return false;
    }

    public NodoCliente elimina(int m) {
        NodoCliente aux = top;
        while (aux != null) {
            if (m == aux.getDato().getEdad()) {
                top = top.getAbajo();
                aux.setAbajo(null);
            }
            aux = aux.getAbajo();
        }
        return aux;
    }

    public void modificaClientePresta(String Correo, String Telefono, int id, String Curso) {
        /**
         * Este metodo es al que el bibliotecario tiene acceso, y se le muestran
         * los datos que este puede cambiar.
         */
        NodoCliente aux = top;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                aux.getDato().setCorreo(Correo);
                aux.getDato().setTelefono(Telefono);
//                aux.getNodobiblio().setCurso(Curso);
            }
            aux = aux.getAbajo();
        }
    }

    @Override
    public String toString() {
        NodoCliente aux = top;
        String msj = "";
        while (aux != null) {
            aux = pop();
            msj += aux + "\n";
        }
        return msj;
    }

}
