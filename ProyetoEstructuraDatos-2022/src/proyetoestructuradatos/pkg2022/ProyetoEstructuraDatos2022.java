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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         do{
            try {  
               int menu = Integer.parseInt(JOptionPane.showInputDialog(
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
                        "******Airbnb ******\n"
                        + "1) Agregar Empleados \n" 
                        + "2) Mostrar Empleados \n"
                        + "3) Salir \n"
                        )));
                    
  

                    switch (opcion) {
                        
                        
                        case 1:
                   
                          break;
                
                        case 2:  
       
       

    
    
                break;
                
                case 3:
                
                break;
                
                case 4:
             
                
                break;
                
                case 5:
                    
                    
                    
                break;
                
                case 6: 
                   
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
