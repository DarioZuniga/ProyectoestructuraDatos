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
public class Actividades {
    private int id;
    private String nombreAct; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreAct;
    }

    public void setNombre(String nombre) {
        this.nombreAct = nombre;
    }

    public Actividades(int id, String nombreAct) {
        this.id = id;
        this.nombreAct = nombreAct;
    }
    public Actividades(){}
    @Override
    public String toString(){
        return "Persona("+ "id=" + id + ", nombre de Actividad=" + nombreAct
+ ')';    } 
}
