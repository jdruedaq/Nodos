package tres;

import javax.swing.*;

/**
 * 3. Crear una lista enlazada donde el campo dato es objeto alumno con las variables: nombre, edad, sexo.
 * Escribir un método para transformar la lista de tal forma que si el primer nodo es un alumno de sexo
 * masculino, el siguiente sea de sexo femenino, y así alternativamente, siempre que sea posible. Deberá
 * crearse un segundo método que la lista ordenada de acuerdo a la edad de cada alumno. El programa
 * principal debe ser controlado por menú.
 */
public class Main3 {
    private static ListaOrdenada controller = new ListaOrdenada();

    public static void main(String... s) {
        Main3 m = new Main3();

        boolean exe = true;
        while (exe) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1- Agregar Alumno\n" +
                    "2- Listar Alumnos por sexo\n" +
                    "3- Listar Alumnos por edad\n" +
                    "4- Salir\n"
            ));

            switch (option) {
                case 1:
                    /*String[] options = {"Hombre", "Mujer"};
                    controller.insertaOrdenEdad(new Alumno(
                            JOptionPane.showInputDialog("Ingrese nombre del estudiante"),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese edaad del estudiante")),
                            JOptionPane.showOptionDialog(null, "Sexo del estudiante",
                                    "Seleccione una opciòn", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0])
                    ));*/
                    controller.insertaOrdenEdad(new Alumno("Hola", 21, Alumno.MEN));
                    controller.insertaOrdenEdad(new Alumno("Juan", 34, Alumno.FEMALE));
                    controller.insertaOrdenEdad(new Alumno("Laura", 65, Alumno.MEN));
                    controller.insertaOrdenEdad(new Alumno("David", 44, Alumno.MEN));
                    controller.insertaOrdenEdad(new Alumno("Lola", 12, Alumno.FEMALE));
                    controller.insertaOrdenEdad(new Alumno("Pancracia", 38, Alumno.MEN));
                    controller.insertaOrdenEdad(new Alumno("Memo", 93, Alumno.FEMALE));
                    controller.insertaOrdenEdad(new Alumno("Otro ola", 73, Alumno.FEMALE));

                case 2:
                    m.sexOrder();
                    break;

                case 3:
                    m.ageOrder();
                    break;

                case 4:
                    exe = false;
            }
        }
    }

    private void sexOrder() {
        ListaOrdenada l = controller.toSexList();
        l.visualizar();
    }

    private void ageOrder() {
        controller.visualizar();
    }
}
