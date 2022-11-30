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
public class bucle_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese 4 numeros");
    
    for (int n=0;n<4;n++) {
    int num = leer.nextInt();
    
     if (num >= 1 && num <= 20){
          
       String c = "*";
       int i = 0;
      do { i++;
       String M = num+c;
       System.out.println(M);  
          
           
       }while(i == num);
         
         
               }
         }
     }
    
}

