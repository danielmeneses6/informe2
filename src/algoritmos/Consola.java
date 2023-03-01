
package algoritmos;

import java.util.Scanner;
import java.lang.System;
public class Consola {

  
    public static void main(String[] args) {
      int opt=1,opcion1;
        do{
            Aleatorio objetoa=new Aleatorio();
            Caracteres objetob=new Caracteres();
            metodos objetoc=new metodos();
          Scanner leer= new Scanner(System.in);
           System.out.println("===MENU DE USUARIO===");
        System.out.println("1.estadistica de un arreglo con numeros aleatorios");
        System.out.println("2.linea de caracteres");
        System.out.println("3.ordenar arreglo por distintos metodos");
        int op=leer.nextInt();
        switch(op)
        {
            case 1:
                do{
                System.out.println("ingrese el tamaño del arreglo (numero de datos)");
                int tam=leer.nextInt();
                objetoa.llenar(tam);
                 opcion1=leer.nextInt();
                }while(opcion1!=0);
                break;
            case 2:
                objetob.inverso();
                break;
            case 3:
                System.out.println("ingrese el tamaño del arreglo: ");
                int tam1=leer.nextInt();
                System.out.println("ingrese una opcion: ");
                System.out.println("1. ordenar arreglo por metodo burbuja: ");
                System.out.println("2. ordenar arreglo por metodo margesort: ");
                System.out.println("3. ordenar arreglo por metodo de insercion");
                System.out.println("4. ordenar arreglo por metodo de seleccion: ");
                int opt1=leer.nextInt();
                switch(opt1)
                {
                    case 1: 
                objetoc.burbuja(tam1);
                break;
                    case 2:
                objetoc.mergesort(tam1);
                break;
                    case 3:
                objetoc.insercion(tam1);
                break;
                    case 4: 
                objetoc.seleccion(tam1);
                break;
                }
                break;
        }
            System.out.println("desea realizar otra operacion? ");
            System.out.println("1. si");
            System.out.println("0. salir");
            opt=leer.nextInt();
      }while(opt!=0);
    }
    
}
