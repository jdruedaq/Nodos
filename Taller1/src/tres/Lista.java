/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

public class Lista {

    protected NodoEstudiante primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarCabezaLista(Alumno entrada) {
        NodoEstudiante nuevo;
        nuevo = new NodoEstudiante(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public Lista insertarColaLista(Alumno dato) {
        NodoEstudiante ultimo;
        ultimo = esUltimo();
        ultimo.enlace = new NodoEstudiante(dato);
        ultimo = ultimo.enlace;
        return this;
    }

    public NodoEstudiante esUltimo() {
        NodoEstudiante n;
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

    public NodoEstudiante buscarLista(Alumno destino) {
        NodoEstudiante indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (destino == indice.dato) // (destino.equals(indice.dato))
            {
                return indice;
            }
        }
        return null;
    }

    public Lista insertarLista(Alumno testigo, Alumno entrada) {
        NodoEstudiante nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior != null) {
            nuevo = new NodoEstudiante(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    public void visualizar() {
        NodoEstudiante n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " --->");
            n = n.enlace;
            k++;
        }
        System.out.println();
    }

    public NodoEstudiante buscarPosicion(int posicion) {
        NodoEstudiante indice;
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

    public void eliminar(long entrada) {
        NodoEstudiante actual, anterior;
        boolean encontrado;
//inicializa los apuntadores
        actual = primero;
        anterior = null;
        encontrado = false;
// búsqueda del nodo y del anterior
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato.getDni() == entrada);
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
