/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetoestructuradatos.pkg2022;

/**
 *
 * @author jonha
 */
public class NodoListaDC {
    private Actividades dato;
    private NodoListaDC next;
    private NodoListaDC back;
    @Override
    public String toString(){
        return "NodoListaDC(" + "dato=" + dato + ')';
    }

    public NodoListaDC(Actividades dato) {
        this.dato = dato;
    }

    public Actividades getDato() {
        return dato;
    }

    public void setDato(Actividades dato) {
        this.dato = dato;
    }

    public NodoListaDC getNext() {
        return next;
    }

    public void setNext(NodoListaDC next) {
        this.next = next;
    }

    public NodoListaDC getBack() {
        return back;
    }

    public void setBack(NodoListaDC back) {
        this.back = back;
    }
}
