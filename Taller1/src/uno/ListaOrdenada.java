/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 * @author sigacdev
 */
public class ListaOrdenada extends Lista {

    public ListaOrdenada() {
        super();
    }

    public ListaOrdenada insertaOrden(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (primero == null) // lista vacía
        {
            primero = nuevo;
        } else if (entrada < primero.getDato()) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        } else /* búsqueda del nodo anterior a partir del que
se debe insertar */ {
            Nodo anterior, p;
            anterior = p = primero;
            while ((p.getEnlace() != null) && (entrada > p.getDato())) {
                anterior = p;
                p = p.getEnlace();
            }
            if (entrada > p.getDato()) //se inserta después del último nodo
            {
                anterior = p;
            }
            // Se procede al enlace del nuevo nodo
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }
    // métodos a codificar:

    public Nodo buscarLista(int destino) {
        return null;
    }
}
