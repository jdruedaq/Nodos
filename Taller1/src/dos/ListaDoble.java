package dos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * @author sigacdev
 */
public class ListaDoble {

    NodoDobleEnlace cabeza;

    public void insertarCabezaLista(int entrada) {
        NodoDobleEnlace nuevo;
        nuevo = new NodoDobleEnlace(entrada);
        nuevo.adelante = cabeza;
        if (cabeza != null) {
            cabeza.atras = nuevo;
        }
        cabeza = nuevo;
    }

    public void insertarFinLista(int entrada) {
        NodoDobleEnlace nuevo = new NodoDobleEnlace(entrada);
        NodoDobleEnlace actual = cabeza;
        while (actual != null) {
            if (actual.adelante == null) {
                actual.adelante = nuevo;
                nuevo.atras = actual;
                break;
            }
            actual = actual.adelante;
        }
    }

    public void insertaDespues(NodoDobleEnlace anterior, int entrada) {
        NodoDobleEnlace nuevo;
        nuevo = new NodoDobleEnlace(entrada);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null) {
            anterior.adelante.atras = nuevo;
        }
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
    }

    void insertaAntes(NodoDobleEnlace adelante, int entrada) {
        NodoDobleEnlace nuevo;
        nuevo = new NodoDobleEnlace(entrada);
        nuevo.atras = adelante.atras;
        if (adelante.atras != null) {
            adelante.atras.adelante = nuevo;
        }
        adelante.atras = nuevo;
        nuevo.adelante = adelante;
    }

    public void eliminar(int entrada) {
        NodoDobleEnlace actual;
        boolean encontrado = false;
        actual = cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            /* la comparación se realiza con el método equals()...,			
            depende del tipo Elemento */
            encontrado = (actual.dato == entrada);
            if (!encontrado) {
                actual = actual.adelante;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            //distingue entre nodo cabecera o resto de la lista
            if (actual == cabeza) {
                cabeza = actual.adelante;
                if (actual.adelante != null) {
                    actual.adelante.atras = null;
                }
            } else if (actual.adelante != null) // No es el último nodo
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            } else // último nodo
            {
                actual.atras.adelante = null;
            }
            actual = null;
        }
    }

    void visualizar() {
        NodoDobleEnlace n;
        int k = 0;
        n = cabeza;
        while (n != null) {
            System.out.print(n.dato + " ---> ");
            n = n.adelante;
            k++;
        }
        System.out.println();
    }

    @Nullable
    NodoDobleEnlace buscarLista(@NotNull int destino, @NotNull boolean print) {
        NodoDobleEnlace actual;
        boolean encontrado = false;
        actual = cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            /* la comparación se realiza con el método equals()...,
            depende del tipo Elemento */
            encontrado = (actual.dato == destino);
            if (!encontrado) {
                actual = actual.adelante;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            int last = 0;
            int next = 0;
            try {
                last = actual.atras.dato;
            } catch (NullPointerException ignore) {
                System.out.println("El anterior es nulo, se mostrará 0 por defecto");
            }
            try {
                next = actual.adelante.dato;
            } catch (NullPointerException ignore) {
                System.out.println("El siguiente es nulo, se mostrará 0 por defecto");
            }
            if (print) {
                System.out.println("+----------+----------+-----------+");
                System.out.println("| anterior |  actual  | siguiente |");
                System.out.println("+----------+----------+-----------+");
                System.out.println(String.format("|   %4d   |   %4d   |   %4d    |", last, actual.dato, next));
                System.out.println("+----------+----------+-----------+");
            }
            return actual;
        }
        System.out.println("El " + destino + " no existe");
        return null;
    }

}
