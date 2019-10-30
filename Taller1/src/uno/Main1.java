package uno;

import javax.swing.*;

/**
 * 1. Crear en una lista enlazada ordenada de números enteros,
 * un método que reciba dos número enteros como parámetro y realice la resta de los mismos,
 * si el resultado es un entero negativo se deberá tomar su valor absoluto,
 * luego de eso se debe insertar un nuevo nodo con el valor obtenido en la posición que le corresponda de acuerdo al orden de la lista.
 * Adicional se debe crear el método para que elimine el nodo que ocupa la posición i ,
 * siendo el nodo cabecera el que ocupa la posición 0. Finalmente crea un método que permita visualizar la lista.
 * El programa principal debe ser controlado por menú.
 */

public class Main1 {
    private ListaOrdenada lista;

    public static void main(String... s) {
        Main1 m = new Main1();
        boolean exe = true;
        while (exe) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1- Operar resta para agregar\n" +
                    "2- Eliminar\n" +
                    "3- Listar\n" +
                    "4- Salir\n"
            ));

            switch (option) {
                case 1:
                    m.ordenada(false);
                    break;

                case 2:
                    m.lista.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Inserte número a eliminar")));
                    break;

                case 3:
                    m.ordenada(true);
                    break;

                case 4:
                    exe = false;
            }
        }
    }

    private void ordenada(boolean print) {
        int a, b, k, testigo;
        if (!print) {
            lista = new ListaOrdenada(); // crea lista vacía
            k = 5; // número de nodos	 // número de elementos
            // inserta elementos en la lista
            for (; k >= 0; k--) {
                a = Integer.parseInt(JOptionPane.showInputDialog("Inserte primer número"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Inserte segundo número"));
                int r = resta(a, b);
                JOptionPane.showMessageDialog(null, String.format("|%d - %d| = %d", a, b, r));

                lista.insertaOrden(r);
            }
        } else {
            // escribe los elementos de la lista
            System.out.println("Elementos de la lista ordenada \n");
            try {
                lista.visualizar();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No hay nada en la lista");
            }
        }
    }

    private int resta(int a, int b) {
        return Math.abs(a - b);
    }
}
