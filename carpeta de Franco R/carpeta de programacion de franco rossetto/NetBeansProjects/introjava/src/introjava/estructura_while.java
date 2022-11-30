/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava; 
import java.util.Scanner ; 

/**
 *
 * @author Usuario
 */
public class estructura_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in) ;
      System.out.println("ingrese una nota entre 0 y 10");
      int nota = leer.nextInt();
    
      while (nota < 0 || nota > 10) {
         System.out.println("la nota es invalida, ingrese una nota valida");
         int not = leer.nextInt();
          nota = not ;
         
         } 
      System.out.println("la nota esta entre o y 10");
          
      }
      
}

    

