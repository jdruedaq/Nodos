/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnteros;

import java.util.Scanner;

/**
 * @author sigacdev
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d, k, testigo;
        Lista lista;
        Scanner scan = new Scanner(System.in);
        lista = new Lista(); // crea lista vacía
        k = 5; // número de nodos
        // se insertan elementos en la lista en la cabeza
        for (; k > 0; k--) {
            d = scan.nextInt();
            lista.insertarCabezaLista(d);
            lista.visualizar();
        }

        // se insertan elementos en la lista en la cola
        k = 5;
        System.out.print("Insertar al fin");
        for (; k > 0; k--) {
            d = scan.nextInt();
            lista.insertarColaLista(d);
            lista.visualizar();
        }

        // Buscar un elemento en la lista
        System.out.print("Insertar elemento a encontrar");
        System.out.println();
        testigo = scan.nextInt();
        Nodo nodoBuscar = lista.buscarLista(testigo);
        if (nodoBuscar == null) {
            System.out.print("Elemento no existe");
        } else {
            System.out.print(nodoBuscar.getDato());
            System.out.println();
        }

        //Insertar entre dos nodos
        System.out.print("Insertar elemento que precederá el valor a ingresar");
        System.out.println();
        testigo = scan.nextInt();
        System.out.print("Insertar el valor del nuevo elemento");
        System.out.println();
        d = scan.nextInt();
        lista.insertarLista(testigo, d);
        lista.visualizar();

        Nodo nodoPosicion = lista.buscarPosicion(8);
        System.out.print(nodoPosicion.dato);

        System.out.print("Insertar elemento a eliminar");
        testigo = scan.nextInt();
        lista.eliminar(testigo);
        lista.visualizar();
    }

}
