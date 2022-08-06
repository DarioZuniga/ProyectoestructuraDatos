/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyetoestructuradatos.pkg2022;

/**
 *
 * @author joelm
 */
public class Pila {
    
    private NodoP top;
    private int size;
    
    public Pila() {
        this.top = null;
        this.size = 0;
    }
    
    public void push(AtributosP elemento) {
        this.top = new NodoP(elemento, this.top);
        this.size++;
    }
	
    public AtributosP pop(){
        if (this.top == null) {
            System.out.println("La pila esta vacia");
            return null;
        }
        AtributosP temp = this.top.getElemento();
        this.top = this.top.getSiguiente();
        this.size--;
        return temp;
    }
	
    public AtributosP top(){
        if (this.top == null) {
            System.out.println("La pila esta vacia");
            return null;
        }
        return this.top.getElemento();
    }
	
    public int size(){
        return this.size;
    }
	
    public boolean empty(){
        if(size() == 0)return true;
        return false;
    }
	
    public void clear(){
        this.top = null;
        this.size = 0;
    }

    
    
}
