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
public class ListaCircular {
    NodoCirc cabeza;
    NodoCirc ultimo;
    public void inserta (Reservas r){
        if (cabeza == null){
            cabeza = new NodoCirc(r);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        }else if (r.getId() < cabeza.getDato().getId()){  
            NodoCirc aux = new NodoCirc(r);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
        }else if (ultimo.getDato().getId() <= r.getId()){
            ultimo.setNext(new NodoCirc(r));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
        }else{
            NodoCirc aux = cabeza;
            while(aux.getNext().getDato().getId() < r.getId()){
                aux = aux.getNext();
            }
            NodoCirc temp = new NodoCirc(r);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        ultimo.setNext(cabeza);
     
    }
    
        public boolean existe (int id){
        boolean esta = false;
        if(cabeza != null){
            if(id >= cabeza.getDato().getId() && id <= ultimo.getDato().getId())
            {
                NodoCirc aux = cabeza;
                while (aux != ultimo && aux.getDato().getId() < id){
                aux = aux.getNext();                
            }
            esta = (aux.getDato().getId() == id);
  
        }
    }
        return esta;
}
    public void modifica (Reservas r){
        if (cabeza != null){
            if(r.getId() >= cabeza.getDato().getId() && r.getId() <= ultimo.getDato().getId()){
                NodoCirc aux = cabeza;
                while (aux != ultimo && aux.getDato().getId() < r.getId()){
                aux = aux.getNext();
            }
            if (aux.getDato().getId() == r.getId()){
                aux.getDato().setNombre(r.getNombre());
            }
        }
            
    }
}
    public void elimina (int id){
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    cabeza = cabeza.getNext();
                    ultimo.setNext(cabeza);
                
            }else{
                NodoCirc aux = cabeza;
                while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id){
                    aux = aux.getNext();
                }
                if (aux.getNext().getDato().getId() == id){
                    if(aux.getNext() == ultimo){
                        ultimo = aux;
                    }
                    aux.setNext(aux.getNext().getNext());
                    }
                }
            }
        }
    }
    public Reservas extrae(int id){
        Reservas r = null;
        if(cabeza != null){
            if(cabeza.getDato().getId() <= id && id <= ultimo.getDato().getId()){
                if(cabeza.getDato().getId() == id){
                    r = cabeza.getDato();
                    cabeza = cabeza.getNext();
                    ultimo.setNext(cabeza);
                }else{
                    NodoCirc aux = cabeza;
                    while (aux.getNext() != cabeza && aux.getNext().getDato().getId() < id){
                        aux = aux.getNext();
                }
                    if(aux.getNext().getDato().getId() == id){
                        r = aux.getNext().getDato();
                        if (aux.getNext() == ultimo){
                            ultimo = aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                    }
                }
                
            }
        }
        return r;
    }
    
        @Override
        public String toString(){
        NodoCirc aux = cabeza;
        String s = "Lista Circular: ";
        if(aux != null){
            s += aux + ", ";
            aux = aux.getNext();
            while(aux != cabeza){
                s += aux + ", ";
                aux = aux.getNext();
            }
        }else{
            s += "Vacia ";
        }
        return s;
    }    
}
