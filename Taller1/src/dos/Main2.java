package dos;

import uno.ListaOrdenada;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2. Crear un método que permita ingresar n cantidad de elementos a una lista enlazada ordenada.
 * Una vez se finalice de insertar la n cantidad de elementos,
 * se debe crear un método que a partir de la lista enlazada que se creo al inicio cree una lista doblemente enlazada
 * donde la cabeza de la misma será el último nodo de la lista enlazada creada inicialmente.
 * El programa principal debe ser controlado por menú.
 */

public class Main2 {
    private static ListaOrdenada listaOrdenada;
    private static ListaDoble listaDoble;

    public static void main(String... s) {
        listaOrdenada = new ListaOrdenada(); // crea lista vacía
        listaDoble = new ListaDoble(); // crea lista vacía
        listaDoble.insertarCabezaLista(0);
        Main2 m = new Main2();
        boolean exe = true;
        while (exe) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1- Agregar\n" +
                    "2- Migrar a lista doblemente enlasada\n" +
                    "3- Listar ordenada\n" +
                    "4- Listar doblemente enlasada\n" +
                    "5- Salir\n"
            ));

            switch (option) {
                case 1:
                    m.nCantidad();
                    break;

                case 2:
                    m.lOrdenada2LdobleEnlace();
                    break;

                case 3:
                    // escribe los elementos de la lista
                    System.out.println("Elementos de la lista ordenada \n");
                    try {
                        listaOrdenada.visualizar();
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "No hay nada en la lista");
                    }
                    break;

                case 4:
                    try {
                        listaDoble.visualizar();
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "No hay nada en la lista");
                    }
                    break;

                case 5:
                    exe = false;
            }
        }
    }

    private void nCantidad() {
        List<Integer> n = new ArrayList<>();
        boolean exe = true;
        int i = 1;
        while (exe) {
            try {
                n.add(Integer.parseInt(JOptionPane.showInputDialog("Inserte posición " + i + ", si desea detenerse presione cancelar o deje en blanco.")));
            } catch (NullPointerException | NumberFormatException e) {
                exe = false;
            }
            i -= -1;
        }

        for (Integer x : n) {
            listaOrdenada.insertaOrden(x);
        }
    }

    private void lOrdenada2LdobleEnlace() {
        listaOrdenada.transition(listaDoble);
    }
}
