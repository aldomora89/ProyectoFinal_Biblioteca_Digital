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
public class ListaUsuarios {

    private NodoUsuarios cabeza;

    public void insert(Usuario p) {
        if (cabeza == null) {
            //Se crea el nuevo Nodo
            cabeza = new NodoUsuarios(p);

        } else //Se obtiene el dato menor
        {
            if (p.getId() <= cabeza.getDato().getId()) {
                NodoUsuarios aux = new NodoUsuarios(p);
                aux.setNext(cabeza);
                cabeza = aux;
            } else //Se inserta el dato menor
            {
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new NodoUsuarios(p));

                } else {
                    NodoUsuarios aux = cabeza;//Se pone un nodo en medio de la lista
                    while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()) {
                        aux = aux.getNext();
                    }
                    NodoUsuarios temp = new NodoUsuarios(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }
    
      public Usuario BuscarUsuario(String usuario, String password) {
        //Este metodo lo que realiza es buscar un usurio conforme a un usuario y una contrasena, se puede ver como una validacion de datos
        NodoUsuarios aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getNombre().equals(usuario) && aux.getDato().getPassword().equals(password)) {
                return aux.getDato();
            }
            aux = aux.getNext();
        }
        return null;
    }

    public Usuario BuscarUsuarioID(int id) {
        /**
         * Se realiza una validacion con un id que tiene por parametro para asi
         * encontrar un usuario especifico. Una vez este se a encontrado es
         * retornado
         */
        NodoUsuarios aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                return aux.getDato();
            }
            aux = aux.getNext();
        }
        return null;

    }

    public void ModificaUsuario(String usuario, String password, int id) {
        /**
         * Este metodo lo que realiza son todos los cambios a lo que el
         * administrador tiene acceso para realizar los cambios de los usuarios.
         * Se hace una validacion conforme a un ID para asi encontrar a un
         * usuario, una vez encontrado se le cambian sus datos.
         */
        NodoUsuarios aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                aux.getDato().setNombre(usuario);
                aux.getDato().setPassword(password);
            }
            aux = aux.getNext();
        }
    }

    public void eliminar(String nombreUsuario) {
        /**
         * Este metodo lo que realiza es poder eliminar un usuario de la Lista
         * de usuarios conforme a un nombre de usuario que se le manda por
         * parametro Se busca dentro de la lista, una vez es encontrado el
         * usuario es eliminado.
         */
        if (cabeza != null) { //Si la lista no esta vacia
            NodoUsuarios aux = cabeza;
            NodoUsuarios anterior = null;
            while (aux != null) {

                if (aux.getDato().getNombre().equals(nombreUsuario)) {
                    if (aux == cabeza) {//Caso 1
                        cabeza = aux.getNext();
                    } else if (aux.getNext() == null) { //caso 2
                        anterior.setNext(null);
                    } else {
                        anterior.setNext(aux.getNext());
                    }
                }
                anterior = aux;
                aux = aux.getNext();

            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public String toString() {
        //Este metodo nos permite convertir todo a String para asi poder imprimirlo.

        NodoUsuarios aux = cabeza;
        String s = "Lista : \n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }

}
