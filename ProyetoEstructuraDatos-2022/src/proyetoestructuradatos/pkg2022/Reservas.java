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
public class Reservas {
    private int id;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String fechaR;

    public Reservas(int id, String nombre, String pApellido, String sApellido, String fechaR) {
        this.id = id;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.fechaR = fechaR;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public Reservas(){}
    @Override
    public String toString(){
        return "Reserva("+ "id=" + id + ", nombre=" + nombre + ", Primer Apellido = " + pApellido + ", Segundo Apellido = " + sApellido + ", Fecha de Reserva = " + fechaR 
+ ')';    } 
}
