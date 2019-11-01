/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

/**
 * @author sigacdev
 */
public class ListaOrdenada extends Lista {

    public ListaOrdenada insertaOrdenSexo(Alumno entrada) {
        NodoEstudiante nuevo;
        nuevo = new NodoEstudiante(entrada);
        if (primero == null) { // lista vacía
            primero = nuevo;
        } else if (entrada.getGender() > primero.getDato().getGender()) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        } else {
            // búsqueda del nodo anterior a partir del que se debe insertar
            NodoEstudiante anterior, p;
            anterior = p = primero;

            while (p.getEnlace() != null) {
                anterior = p;
                p = p.getEnlace();
                try {
                    if (p.enlace.dato.getGender() == Alumno.FEMALE) {
                        break;
                    }
                } catch (NullPointerException ignore) {
                }
            }
            if (entrada.getGender() < p.getDato().getGender()) { //se inserta después del último nodo
                anterior = p;
            }
            // Se procede al enlace del nuevo nodo
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }

    public ListaOrdenada insertaOrdenEdad(Alumno entrada) {
        NodoEstudiante nuevo;
        nuevo = new NodoEstudiante(entrada);
        if (primero == null) { // lista vacía
            primero = nuevo;
        } else if (entrada.getAge() < primero.getDato().getAge()) {
            nuevo.setEnlace(primero);
            primero = nuevo;
        } else {
            /* búsqueda del nodo anterior a partir del que se debe insertar */
            NodoEstudiante anterior, p;
            anterior = p = primero;
            while ((p.getEnlace() != null) && (entrada.getAge() > p.getDato().getAge())) {
                anterior = p;
                p = p.getEnlace();
            }
            if (entrada.getAge() > p.getDato().getAge()) //se inserta después del último nodo
            {
                anterior = p;
            }
            // Se procede al enlace del nuevo nodo
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }
}
