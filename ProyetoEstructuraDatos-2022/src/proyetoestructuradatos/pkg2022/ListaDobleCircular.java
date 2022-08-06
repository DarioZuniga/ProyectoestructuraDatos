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
public class ListaDobleCircular {
    private NodoListaDC cabeza;
    private NodoListaDC ultimo;
    
    public void inserta(Actividades a){
        if(cabeza == null){
            cabeza = new NodoListaDC(a);
            ultimo = cabeza;
            cabeza.setNext(ultimo);
            ultimo.setBack(cabeza);
        }else if(a.getId()<cabeza.getDato().getId()){
            NodoListaDC aux = new NodoListaDC(a);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if(ultimo.getDato().getId() <= a.getId()){
            NodoListaDC aux = new NodoListaDC(a);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else{
            NodoListaDC aux = cabeza;
            while(aux.getNext().getDato().getId() < a.getId()){
                aux = aux.getNext();
            }
            NodoListaDC temp = new NodoListaDC(a);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
    
    public Actividades extrae (int id){
        Actividades a = null;
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    a = cabeza.getDato();
                    cabeza = cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);
                }else{
                    NodoListaDC aux = cabeza;
                    while(aux.getNext() != cabeza && 
                            aux.getNext().getDato().getId() < id){
                        aux = aux.getNext();
                    }
                    if(aux.getNext().getDato().getId() == id){
                        a = aux.getNext().getDato();
                        if(aux.getNext()== ultimo){
                            ultimo = aux;
                            cabeza.setBack(ultimo);
                        }
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().setBack(aux);
                    }
                }
                
            }
        }
        return a;
    }
    
    public void elimina (int id){
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    cabeza = cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);
                }else{
                    NodoListaDC aux = cabeza;
                    while(aux.getNext() != cabeza && 
                            aux.getNext().getDato().getId() < id){
                        aux = aux.getNext();
                    }
                    if(aux.getNext().getDato().getId() == id){
                        if(aux.getNext()== ultimo){
                            ultimo = aux;
                            cabeza.setBack(ultimo);
                        }
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().setBack(aux);
                    }
                }
                
            }
        }
    }
    
    public void modifica(Actividades a){
        if(cabeza !=null){
            if(a.getId() >= cabeza.getDato().getId() && a.getId() <= ultimo.getDato().getId()){
                NodoListaDC aux = cabeza;
                while(aux != ultimo && aux.getDato().getId() < a.getId()){
                    aux = aux.getNext();
                }
                if(aux.getDato().getId() == a.getId()){
                    aux.getDato().setNombre(a.getNombre());
                }
            }
        }
    }
    
    
    public boolean existe(int id){
        boolean esta = false;
        if(cabeza !=null){
            if(id >= cabeza.getDato().getId() && id <= ultimo.getDato().getId()){
                NodoListaDC aux = cabeza;
                while(aux != ultimo && aux.getDato().getId() < id){
                    aux = aux.getNext();
                }
                esta = (aux.getDato().getId() == id);
            }
        }
        return esta;
    }

    @Override
    public String toString() {
        NodoListaDC aux = cabeza;
        String s = "----- Lista DC -----\n";
        if(aux != null){
            s+= aux;
            aux = aux.getNext();
            while(aux != cabeza){
                s+= aux;
                aux = aux.getNext();
            }
            s+= "----- Lista -----\n";
        }else{
            s+="Vacia";
        }
        return s;
    } 
}
