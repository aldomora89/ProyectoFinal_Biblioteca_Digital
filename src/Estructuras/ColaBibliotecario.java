/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Datos.Bibliotecario;
import java.util.Date;

/**
 *
 * @author aldomora89
 */
public class ColaBibliotecario {

    private NodoBibliotecario Ultimo;
    private NodoBibliotecario Frente;

    public Bibliotecario enCola(NodoBibliotecario n) {
        //Coloca los elementos en la cola
        if (Frente == null) {
            Frente = n;
            Ultimo = n;
        } else {
            Ultimo.setAtras(n);
            Ultimo = n;
        }
        return n.getNodobiblio();
    }

    public NodoBibliotecario Atiende() {
        /**
         * El metodo atiende lo que hace es sacar el primer nodo de la cola
         */
        NodoBibliotecario aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        //Este metodo nos permite convertir todo a String para asi poder imprimirlo.

        String s = "";
        NodoBibliotecario aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public Bibliotecario BuscarBibliotecario(int id) {
        /**
         * Se realiza una validacion con un id que tiene por parametro para asi
         * encontrar el respectivo profesor. Una vez este se a encontrado es
         * retornado
         */
        NodoBibliotecario aux = Frente;
        while (aux != null) {
            if (aux.getNodobiblio().getId() == id) {
                return aux.getNodobiblio();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public void modificaBiblioAdmin(String Nombre, String Apellido, String Correo, String Curso, int id, int Telefono, int Edad, Date fechaDeIngreso) {
        /**
         * Este metodo lo que realiza son todos los cambios a lo que el
         * administrador tiene acceso para realizar los cambios del bibliotecario. Se
         * hace una validacion conforme a un ID para asi encontrar al bibliotecario,
         * una vez encontrado se le cambian sus datos.
         */
        NodoBibliotecario aux = Frente;
        while (aux != null) {
            if (aux.getNodobiblio().getId() == id) {
                aux.getNodobiblio().setCorreo(Correo);
                aux.getNodobiblio().setTelefono(Telefono);
                aux.getNodobiblio().setNombre((Nombre));
                aux.getNodobiblio().setApellido((Apellido));
                aux.getNodobiblio().setEdad((Edad));
            }
            aux = aux.getAtras();
        }
    }

    public Bibliotecario modificaBiblio(String Correo, int Telefono, int id) {
        /**
         * Este metodo es al que el bibliotecario tiene acceso, y se le muestran los
         * datos que este puede cambiar.
         */
        NodoBibliotecario aux = Frente;
        while (aux != null) {
            if (aux.getNodobiblio().getId() == id) {
                aux.getNodobiblio().setCorreo(Correo);
                aux.getNodobiblio().setTelefono(Telefono);
//                aux.getNodoprof().setCurso(Curso);
            }
            aux = aux.getAtras();
        }
        return null;
    }



    public String eliminadatosProfesor(int id) {
        /**
         * Este método lo que realiza es poder eliminar un bibliotecario de la
         * colaBiblio conforme un ID que se le manda por parametro
         */

        NodoBibliotecario aux = Frente;
        NodoBibliotecario aux2 = aux;
        while (aux != null) {
            if (aux.getNodobiblio().getId() == id) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino el Bibliotecario";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el Blbliotecario";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el Bibliotecario";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el id " + id;
    }
}
