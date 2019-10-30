public class Main {
    public static void main(String[] strings) {
        ListaDoble listaDoble = new ListaDoble();

        System.out.println("Insertando a cabeza");
        listaDoble.insertarCabezaLista(1);
        listaDoble.insertarCabezaLista(2);
        listaDoble.insertarCabezaLista(3);
        listaDoble.insertarCabezaLista(4);
        listaDoble.insertarCabezaLista(5);
        listaDoble.insertarCabezaLista(6);
        listaDoble.visualizar();
        System.out.println("Insertando a cola");
        listaDoble.insertarFinLista(0);
        listaDoble.insertarFinLista(-1);
        listaDoble.insertarFinLista(-2);
        listaDoble.insertarFinLista(-3);
        listaDoble.insertarFinLista(-4);
        listaDoble.insertarFinLista(-5);
        listaDoble.insertarFinLista(-6);
        listaDoble.visualizar();
        int search = 0;
        System.out.println("Insertando despues de " + search);
        listaDoble.insertaDespues(listaDoble.buscarLista(search, false), 10);
        listaDoble.visualizar();
        search = 0;
        System.out.println("Insertando antes de " + search);
        try {
            listaDoble.insertaAntes(listaDoble.buscarLista(search, false), 20);
        } catch (NullPointerException ignore) {
            System.out.println("No es posible realizar la insersión debido a que no existe el valor buscado");
        }
        listaDoble.visualizar();
        search = -6;
        System.out.println("Buscando el número " + search);
        listaDoble.buscarLista(search, true);
    }
}
