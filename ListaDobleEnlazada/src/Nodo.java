/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author sigacdev
 */
public class Nodo {

    int dato;
    Nodo adelante;
    Nodo atras;

    public Nodo(int entrada) {
        dato = entrada;
        adelante = null;
        atras = null;
    }

    public int getDato() {
        return dato;
    }
}
