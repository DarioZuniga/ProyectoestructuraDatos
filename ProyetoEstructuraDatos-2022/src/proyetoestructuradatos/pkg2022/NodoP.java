/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyetoestructuradatos.pkg2022;

/**
 *
 * @author joelm
 */
public class NodoP {
    
   private AtributosP elemento;
   private NodoP siguiente;
   
   public NodoP(AtributosP elemento, NodoP siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
   }

    public AtributosP getElemento() {
        return elemento;
    }

    public void setElemento(AtributosP elemento) {
        this.elemento = elemento;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
   
}
    
