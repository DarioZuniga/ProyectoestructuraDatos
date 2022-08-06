/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyetoestructuradatos.pkg2022;

/**
 *
 * @author Extreme PC
 */

    public class PersonaSimple {
    private int id;
  
    private String Apellido1;
    private String Apellido2;
    private String nombre;
     private String correo;
      private String Telefono;
    

    public PersonaSimple(int id, String nombre, String Apellido1,String Apellido2,String correo,String Telefono) {
        this.id = id;
        this.Apellido2= Apellido2;
        this.Apellido1 = Apellido1;
        this.nombre = nombre;
        this.correo = correo;
         
          this.Telefono = Telefono;
    }

   
    @Override
    public String toString(){
        return "Persona {" + " id=" + id + ", nombre=" + nombre + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    }