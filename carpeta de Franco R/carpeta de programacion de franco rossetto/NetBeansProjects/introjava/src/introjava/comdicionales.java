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
public class comdicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
     System.out.println("califique a la pelicula del 1 al 5");
     Scanner num = new Scanner (System.in);
     int opinion = num.nextInt();
   
  
   
   if ( opinion >= 1 && opinion <= 5) {
       

       switch ( opinion ) { 
         case 1 :
         case 2 :
            System.out.println("la pelicula no fue buena");
         break;
         case 3 : 
             System.out.println("la pelicula fue regular");
             break;
         case 4 : 
             System.out.println("la pelicula fue buena");
             break;
         case 5 : 
             System.out.println("la pelicula fue muy buena");
             break;
        }
           
   } else if ( opinion < 1 ) { 
       System.out.println("la peor pelicula que vi");
   } else { 
       System.out.println("la mejor pelicula");
   }
           
    }
    
}
