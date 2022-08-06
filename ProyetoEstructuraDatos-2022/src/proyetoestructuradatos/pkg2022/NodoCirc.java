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
public class NodoCirc {
    private Reservas dato;
    private NodoCirc next;
    @Override
    public String toString(){
        return "Nodo Circular(" + "dato=" + dato + ')';
    }

    public NodoCirc(Reservas dato) {
        this.dato = dato;
    }

    public Reservas getDato() {
        return dato;
    }

    public void setDato(Reservas dato) {
        this.dato = dato;
    }

    public NodoCirc getNext() {
        return next;
    }

    public void setNext(NodoCirc next) {
        this.next = next;
    }    
}
