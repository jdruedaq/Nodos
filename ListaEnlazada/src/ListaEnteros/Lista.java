/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnteros;

public class Lista {

    protected Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public Lista insertarColaLista(int dato) {
        Nodo ultimo;
        ultimo = esUltimo();
        ultimo.enlace = new Nodo(dato);
        ultimo = ultimo.enlace;
        return this;
    }

    public Nodo esUltimo() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            if (n.getEnlace() == null) {
                return n;
            }
            n = n.enlace;
            k++;
        }
        return null;
    }

    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino == indice.dato) // (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }

    public Lista insertarLista(int testigo, int entrada) {
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null) {
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    public void visualizar() {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " --->");
            n = n.enlace;
            k++;
        }
        System.out.println();
    }

    public Nodo buscarPosicion(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0) // posición ha de ser mayor que 0
        {
            return null;
        }
        indice = primero;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
//inicializa los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
// búsqueda del nodo y del anterior
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato == entrada);
            //con objetos: actual.dato.equals(entrada)
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
// Enlace del nodo anterior con el siguiente
        if (actual != null) {
            // Distingue entre que el nodo sea el cabecera,
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null; // no es necesario al ser una variable local
        }
    }
}
