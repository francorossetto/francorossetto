/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner ;

public class do_while {

  
    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in) ;
    System.out.println("ingrese 20 numeros y sumelos");
    int n = 0;
    int numn ;
    int sumant = 0;
    int suma;
    do { n++;
        System.out.println("ingrese el numero "+n);
         numn = leer.nextInt();
         if (numn < 0){ System.out.println("asi va la suma: "+sumant);
                 continue;}
         suma = sumant + numn;
         sumant = suma ;
         System.out.println("asi va la suma: "+ sumant);
         if (numn == 0){ break;}
         
         
    }while ( n <= 19);  
    if (numn == 0){System.out.println("se capturo el numero cero");}
    if (n <= 20 ){System.out.println("la suma total de los numeros "
            + "ingresados es: "+ sumant);}
    }
    
}
