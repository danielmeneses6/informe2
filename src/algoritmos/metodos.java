
package algoritmos;

import java.util.Scanner;
public class metodos {
    Scanner leer3= new Scanner(System.in);
    public void burbuja(int t)
    {
        double aleatorio1=0, opcion1=0,aux=0;
        double [] arreglo2= new double [t];  
        for(int i=0;i<t;i++)
        {
            aleatorio1= (double)(Math.random()*10);
            arreglo2[i]=aleatorio1;
           
        }
        System.out.println("el arreglo aleatorio tiene los siguientes valores: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
        System.out.println(" ");
        for(int i=0; i<arreglo2.length;i++)
        {
            for(int j=0; j<(arreglo2.length-1);j++)
            {
                if(arreglo2[j]>arreglo2[j+1])
                {
                    aux=arreglo2[j];
                    arreglo2[j]=arreglo2[j+1];
                    arreglo2[j+1]=aux;
                }
            }
        
        }
        System.out.println("el arreglo ordenado por medio del algoritmo burbuja queda de la siguiente manera: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
    }
    public void seleccion(int t)
    {
         double aleatorio1=0, opcion1=0,aux=0;
        double [] arreglo2= new double [t];  
        int minimo;
        for(int i=0;i<t;i++)
        {
            aleatorio1= (double)(Math.random()*10);
            arreglo2[i]=aleatorio1;
           
        }
        System.out.println("el arreglo aleatorio tiene los siguientes valores: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<arreglo2.length;i++)
        {
            minimo=i;
            for(int j=i+1;j<arreglo2.length;j++)
            {
                if(arreglo2[j]<arreglo2[minimo])
                {
                    minimo=j;
                }
            }
            aux=arreglo2[i];
            arreglo2[i]=arreglo2[minimo];
            arreglo2[minimo]=aux;
        }
         System.out.println("el arreglo ordenado por medio del algoritmo seleccion queda de la siguiente manera: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
    }
    public void mergesort()
    {
        
    }
    public void insercion(int t)
    {
         double aleatorio1=0, opcion1=0,aux=0;
         int pos;
        double [] arreglo2= new double [t];  
        for(int i=0;i<t;i++)
        {
            aleatorio1= (double)(Math.random()*10);
            arreglo2[i]=aleatorio1;
           
        }
        System.out.println("el arreglo aleatorio tiene los siguientes valores: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
        System.out.println(" ");
        
        for(int i=0;i<arreglo2.length;i++)
        {
            pos=i;
            aux=arreglo2[i];
            do
            {
                arreglo2[pos]=arreglo2[pos-1];
                pos--;
            }while((pos>0)&&(arreglo2[pos-1]>aux));
            arreglo2[pos]=aux;
        }
         System.out.println("el arreglo ordenado por medio del algoritmo insercion queda de la siguiente manera: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+" ");
        }
    }
}
