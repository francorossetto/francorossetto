/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio7deJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("elija una opcion de bomba de acuerdo al que quiere")
                ; 
         Scanner opcion = new Scanner(System.in);
         int tipomotor =  opcion.nextInt();
         switch (tipomotor) {
             case 1 : 
                 System.out.println("La bomba es una bomba de agua" );
                 break ;
             case 2 : 
                 System.out.println("La bomba es una bomba de gasolina"); 
                 break ;
             case 3 : 
                 System.out.println("La bomba es una bomba de hormigon");
                 break ;
             case 4 :
                 System.out.println("La bomba es una bomba de pasta alimenticia"
                 );
                 break ;
             default :
                 System.out.println("no existe un valor valido para tipo de bomba"
                 ); 
         }               
    } 


}


                
    
