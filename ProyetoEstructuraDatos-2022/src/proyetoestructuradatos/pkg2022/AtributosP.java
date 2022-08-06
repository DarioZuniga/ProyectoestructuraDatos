/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyetoestructuradatos.pkg2022;

/**
 *
 * @author joelm
 */
public class AtributosP {

private int id;
private String nombre;
private String ubicacion;
private String idioma;
private String disponibilidad;
private int precio;
private String actividades;
private int calificacion;
private int huespedes;


    public AtributosP(int id, String nombre, String ubicacion, String idioma, String disponibilidad, int precio, String actividades, int calificacion, int huespedes) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.idioma = idioma;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.actividades = actividades;
        this.calificacion = calificacion;
        this.huespedes = huespedes;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(int huespedes) {
        this.huespedes = huespedes;
    }
    
    
}
