/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* esto es el paquete*/
package introjava;
 import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/* esto es la clase*/
public class Introjava {

    /**
     * @param args the command line arguments
     */
    /* este es el metodo main*/
    public static void main(String[] args) {
        /* aca aprendi a definir, nombrar y asignar un valor a variables locales
        , primero se declara el tipo de variable -> luego asignar un nombre con
        el que identificaremos a la variable y por ultimo asignar un valor   */
        
      String nombre = "franco";
      long numero ;
      double decimales = 3.45;
      char carater = 'a';
      boolean bandera = false; 
      
      /* aqui aprendi a utilizar operadores para operar entre variables*/
      
      int num1 = 2;
      int num2 = 3;
      int suma = num1 + num2;
      int suma2 = suma + 3;
      float division = suma2 / 3;
      
      boolean VOF = num1 > num2;
   
      String resultado = "VOF";
      /* aqui aprendimos a ingresar valores de entrada y a mostrar valores de 
      salida
      */
      /* mostrar valores de salida*/
      System.out.println("RESULTADO DE SUMA: " +suma2);
      System.out.println("RESULTADO DE DIVISION: " +division);
      System.out.println("RESULTADO DE VOF: " +VOF);
      
      /*como mostrar valores de salida...
      primero se pone la accion "Scanner" y el nombre que quieras a la accion en 
      este caso "leer" , luego "= new Scanner(System.in);"
      luego definir que tipo de variable leera en este caso "int" y nombre en
      este caso "num;" sin valor
      luego le asignamos el valor de entrada a "num" y "=" luego 
      <nombre de la accion Scanner>.nextInt();
      "Int" si es numero, "ln" si es una cadena de caracteres y "char" si es un 
      solo caracter,"String" si es una cadena de caracteres o una letra tmb */
      
      
       
      Scanner leer = new Scanner(System.in);
      int num = leer.nextInt();
      System.out.println("el numero ingresado es: " + num);
      
      Scanner palabra = new Scanner(System.in);
      String letra = palabra.nextLine();
      System.out.println("la letrar ingresada es: " + letra);
      
      /* ESTRUCTURAS DE CONTROL ; CONDICIONALES :
      if : si 
      else if : sino si
      else : sino
      */ 
      
      Scanner NUM = new Scanner(System.in);
      System.out.println("ingrese dos numeros enteros");
      
      int NUM1 = NUM.nextInt();
      int NUM2 = NUM.nextInt();
      
      if (NUM1 > 25 && NUM2 < 25 ){ 
          
          System.out.println("el numero mayor a 25 es: " + NUM1 );
    } else if (NUM2 > 25 && NUM1 > 25) { 
        System.out.println("ambos numeros son mayor a 25");
    } else if ( NUM1 < 25 && NUM2 < 25 ) { 
        System.out.println("ambos numeros son menor a 25 " );
        
    }else if (NUM1 == 25 && NUM2 == 25){
        System.out.println("ambos numeros son igual a 25");
    }else if (NUM1 == 25 && NUM2 < 25 ) { 
        System.out.println("el numero igual a 25 es: " +NUM1);
    }else if (NUM1 < 25 && NUM2 == 25 ) { 
        System.out.println("el numero igual a 25 es: "+ NUM2 );
    }else { 
        System.out.println("el numero mayor a 25 es: "+NUM2);
    }

            
           }
    
}
