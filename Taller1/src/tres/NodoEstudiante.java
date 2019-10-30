package tres;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// clase uno.Nodo con las dos partes de un nodo y su constructor

public class NodoEstudiante {

    Alumno dato;
    NodoEstudiante enlace;

    public NodoEstudiante(Alumno x) {
        dato = x;
        enlace = null;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }

    public NodoEstudiante getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoEstudiante enlace) {
        this.enlace = enlace;
    }
}
