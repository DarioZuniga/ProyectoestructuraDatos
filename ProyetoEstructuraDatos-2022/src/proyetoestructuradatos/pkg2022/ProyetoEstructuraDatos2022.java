/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyetoestructuradatos.pkg2022;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author josed
 */
public class ProyetoEstructuraDatos2022 {

    
    public static void main(String[] args) {
     int menu=0;
 do{
            try {  
                menu = Integer.parseInt(JOptionPane.showInputDialog(
                (
                    "******Airbnb ******\n"
                    + "1) Control de Planilla \n" 
                    + "2) Fichas para atender \n"
                    + "3) Atributos del Airbnb \n"
                    + "4) Categorias de los Airbnb \n"
                    + "5) Actividades incluidas en los Airbnb \n"
                    + "6) Reservas \n"
                    + "7) Salir \n"
                    + "\n Digite la opción que desea ejecutar: ")));
                
            switch (menu) {
                case 1:  
                    
                    int opcion = 0;
                        do{
                    try { //es para que no hayan errores a la hora de ingresar datos 
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    (
                        "******Tabla de Estadisticas ******\n"
                        + "1)  \n" 
                        + "2)  \n"
                        + "3) \n"
                        )));

                        switch (opcion) {
                            case 1:
                                 System.out.println("Digite los Datos del Empleado");

                                     laLista.inserta(new PersonaSimple(Integer.parseInt(JOptionPane.showInputDialog("Digite el id")),
                                             JOptionPane.showInputDialog("Digite el Nombre"),
                                             JOptionPane.showInputDialog("Digite su Primer Apellido"),
                                           JOptionPane.showInputDialog("Digite su Segundo Apellido"),
                                             JOptionPane.showInputDialog("Digite su Correo"),

                                             JOptionPane.showInputDialog("Digite su Telefono")));
                            break;

                            case 2: 
                                laLista.imprimir(laLista,laLista.cabeza );

                            break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Salir");
                                    break;
                            }


                        } catch (NumberFormatException e) {
                            System.out.println("Error, Intente denuevo");
                        }
                        } while (opcion != 3);
  
 
                    
                break;
                
                case 2:  
       
       
//       Hay irian conJ Option
       miCola.encola(new NodoC("Juan"));
       miCola.encola(new NodoC("Pedro"));
       miCola.encola(new NodoC("Sebastian"));
       miCola.encola(new NodoC("Daniela"));
       miCola.encola(new NodoC("Andres"));
       miCola.encola(new NodoC("Michael"));
       miCola.encola(new NodoC("Karla"));
       miCola.encola(new NodoC("Kevin"));
       miCola.copiaElementosDeCola(miCola, miCola2, miCola.atiende());
       
    
    
                break;
                
                case 3:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del airbnb"));
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Airbnb");    
                String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion del Airbnb");
                String idioma = JOptionPane.showInputDialog("Ingrese el idioma en que desea ser atentido");
                String disponibilidad = JOptionPane.showInputDialog("Ingrese la disponibilidad del Airbnb");
                int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del airbnb"));
                String actividades = JOptionPane.showInputDialog("Ingrese las actividades del Airbnb");
                int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion del Airbnb"));
                int huespedes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de huespedes del Airbnb"));
//                AtributosP = atributosP = new AtributosP(id, nombre, ubicacion, idioma, disponibilidad, precio, actividades, calificacion, huespedes);
                break;
                
                case 4:
                int playa =1;
                int montaña =2;
                int ciudad =3;
                int condominio =4;
                int residencial =5;
                arbol.inserta(1, playa);
                arbol.inserta(2, montaña);
                arbol.inserta(3, ciudad);
                arbol.inserta(4, condominio);
                arbol.inserta(5, residencial);
                
                break;
                
                case 5:
                    //ListDC
                    NodoC objetoCola = miCola.atiende();
                    actId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación de la actividad del AirBnB "));
                    actNombre = JOptionPane.showInputDialog("Ingrese el nombre de la actividad del AirBnB ");
                    ListDC.inserta(new Actividades(actId, actNombre));
                    
                break;
                
                case 6: 
                    //ListaCirc
                    resId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación de la reserva del AirBnB "));
                    resNombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario que reserva el AirBnB ");
                    resPApellido = JOptionPane.showInputDialog("Ingrese el primer apellido del usuario que reserva el AirBnB ");
                    resSApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido del usuario que reserva el AirBnB ");
                    resFechaR = JOptionPane.showInputDialog("Ingrese la fecha de reserva del AirBnB ");
                    ListCirc.inserta(new Reservas(resId, resNombre, resPApellido, resSApellido, resFechaR));
                break;
                
                
                
    }
 
             }    
             catch (HeadlessException | NumberFormatException e) {
                //System.out.println(e);
                JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            }
      }while (menu != 7);
    }
}
