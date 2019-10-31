package cuatro;

import javax.swing.*;

/**
 * 4. Utilizar una lista doblemente enlazada para controlar una lista de pasajeros de una línea aérea. El vuelo
 * consta de un total de 50 puestos, se debe mostrar al viajero los asientos disponibles y los que se
 * encuentran ocupados debe mostrar a quién están asignados. El campo dato está formado por el objeto
 * pasajero que contiene los datos del nombre y número de asiento. De acuerdo a los asientos disponibles
 * el pasajero podrá seleccionar y se insertarán los datos en la posición correspondiente. El pasajero podrá
 * anular su reserva por número de asiento o por sus datos personales (Nombre). El programa principal
 * debe ser controlado por menú.
 */

public class Main4 {
    private static ListaDoble controller = new ListaDoble();

    public static void main(String... args) {
        Main4 m = new Main4();

        for (int i = 0; i < Seat.SEATS; i++) {
            controller.insertarCabezaLista(new Seat(null, i + 1));
        }

        boolean exe = true;
        while (exe) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1- Agregar pasajero\n" +
                    "2- Cancelar asiento\n" +
                    "3- Ver asientos\n" +
                    "4- Salir\n"
            ));

            switch (option) {
                case 1:
                    System.out.flush();
                    controller.visualizar();
                    try {
                        int seat = Integer.parseInt(
                                JOptionPane.showInputDialog("Seleccione asiento en el que desea viajar (Rango desde 1 a " +
                                        Seat.SEATS));
                        controller.buscarLista(seat, true, false);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Se ha ingresado un dato no válido");
                    }
                    break;

                case 2:
                    System.out.flush();
                    controller.visualizar();
                    String input = JOptionPane.showInputDialog("Seleccione asiento a cancelar (Rango desde 1 a " + Seat.SEATS + ") o ingrese su nombre");

                    try {
                        controller.buscarLista(Integer.parseInt(input), true, true);
                    } catch (NumberFormatException ignore) {
                        controller.buscarLista(input, true, true);
                    }
                    break;

                case 3:
                    System.out.flush();
                    controller.visualizar();
                    break;

                case 4:
                    exe = false;
            }
        }
    }
}
