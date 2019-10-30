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
public class ListaOrdenadaMain {

    public static void main(String[] a) {
        int d, k, testigo;
        Scanner scan = new Scanner(System.in);
        ListaOrdenada lista;
        lista = new ListaOrdenada(); // crea lista vacía
        k = 5; // número de nodos	 // número de elementos
        // inserta elementos en la lista
        for (; k >= 0; k--) {
            d = scan.nextInt();
            lista.insertaOrden(d);
            lista.visualizar();
        }
        // escribe los elementos de la lista
        System.out.println("Elementos de la lista ordenada \n");
        lista.visualizar();
    }
}
