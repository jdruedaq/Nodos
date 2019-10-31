package cuatro;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.swing.*;

/**
 * @author sigacdev
 */
class ListaDoble {

    private Nodo cabeza;

    void insertarCabezaLista(Seat entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = cabeza;
        if (cabeza != null) {
            cabeza.atras = nuevo;
        }
        cabeza = nuevo;
    }

    void insertarFinLista(Seat entrada) {
        Nodo nuevo = new Nodo(entrada);
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.adelante == null) {
                actual.adelante = nuevo;
                nuevo.atras = actual;
                break;
            }
            actual = actual.adelante;
        }
    }

    void insertaDespues(Nodo anterior, Seat entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null) {
            anterior.adelante.atras = nuevo;
        }
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
    }

    void insertaAntes(Nodo adelante, Seat entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.atras = adelante.atras;
        if (adelante.atras != null) {
            adelante.atras.adelante = nuevo;
        }
        adelante.atras = nuevo;
        nuevo.adelante = adelante;
    }

    void eliminar(Seat entrada) {
        Nodo actual;
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
        Nodo n;
        int k = 0;
        n = cabeza;
        while (n != null) {
            System.out.println(n.dato.toString());
            n = n.adelante;
            k++;
        }
        System.out.println();
    }

    @Nullable
    Nodo buscarLista(@NotNull int destino, @NotNull boolean print, boolean delete) {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            /* la comparación se realiza con el método equals()...,
            depende del tipo Elemento */
            encontrado = (actual.dato.getSeatNumber() == destino);
            if (!encontrado) {
                actual = actual.adelante;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            Seat last = null;
            Seat next = null;
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

            if (!delete) {
                if (actual.dato.getName() == null) {
                    actual.dato.setName(JOptionPane.showInputDialog("Ingrese su nombre para reservar el puesto Nº" + actual.dato.getSeatNumber()));
                } else {
                    JOptionPane.showMessageDialog(null, "El puesto Nº" + actual.dato.getSeatNumber() +
                            " Se encuentra reservado para " + actual.dato.getName());
                }
            } else {
                actual.dato.setName(null);
            }

            if (print) {
                System.out.println(actual.dato.toString());
            }
            return actual;
        }
        JOptionPane.showMessageDialog(null, "El asiento " + destino + " no existe");
        return null;
    }

    @Nullable
    Nodo buscarLista(@NotNull String destino, @NotNull boolean print, boolean delete) {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            /* la comparación se realiza con el método equals()...,
            depende del tipo Elemento */
            if (actual.dato.getName() != null) {
                encontrado = (actual.dato.getName().equals(destino));
            }
            if (!encontrado) {
                actual = actual.adelante;
            }
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            Seat last = null;
            Seat next = null;
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

            if (!delete) {
                if (actual.dato.getName() == null) {
                    actual.dato.setName(JOptionPane.showInputDialog("Ingrese su nombre para reservar el puesto Nº" + actual.dato.getSeatNumber()));
                } else {
                    JOptionPane.showMessageDialog(null, "El puesto Nº" + actual.dato.getSeatNumber() +
                            " Se encuentra reservado para " + actual.dato.getName());
                }
            } else {
                actual.dato.setName(null);
            }

            if (print) {
                System.out.println(actual.dato.toString());
            }
            return actual;
        }
        JOptionPane.showMessageDialog(null, "El asiento " + destino + " no existe");
        return null;
    }
}
