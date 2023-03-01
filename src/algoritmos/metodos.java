
package algoritmos;

import java.util.Arrays;
import java.util.Scanner;
public class metodos {
    Scanner leer3= new Scanner(System.in);
    public void burbuja(int t)
    {
        long startTime = System.nanoTime();
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
            System.out.print(arreglo2[i]+"//");
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
        long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println(" ");
    System.out.println("El tiempo de ejecución de el Metodo fue de: " + elapsedTime + " nanosegundos.");
    }
    public void seleccion(int t)
    {
         long startTime = System.nanoTime();
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
            System.out.print(arreglo2[i]+"//");
        }
        long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println(" ");
    System.out.println("El tiempo de ejecución de el Metodo fue de: " + elapsedTime + " nanosegundos.");
    }
    public void mergesort(int t)
    {
         long startTime = System.nanoTime();
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
            System.out.print(arreglo2[i]+"//");
        }
        System.out.println(" ");
        
       mergeSort(arreglo2, 0, arreglo2.length - 1);
        System.out.println("el arreglo ordenado por este metodo quedaria de la siguiente manera: ");
        System.out.println(Arrays.toString(arreglo2));
        
        long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println(" ");
    System.out.println("El tiempo de ejecución de el Metodo fue de: " + elapsedTime + " nanosegundos.");
    }
    public void insercion(int t)
    {
         long startTime = System.nanoTime();
         double aleatorio1=0;
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
        
        int n = arreglo2.length;
    for (int i = 1; i < n; ++i) {
        double key = arreglo2[i];
        int j = i - 1;
        while (j >= 0 && arreglo2[j] > key) {
            arreglo2[j + 1] = arreglo2[j];
            j = j - 1;
        }
        arreglo2[j + 1] = key;
    }
        
         System.out.println("el arreglo ordenado por medio del algoritmo insercion queda de la siguiente manera: ");
        for(int i=0;i<arreglo2.length;i++)
        {
            System.out.print(arreglo2[i]+"//");
        }
        long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
        System.out.println(" ");
    System.out.println("El tiempo de ejecución de el Metodo fue de: " + elapsedTime + " nanosegundos.");
    }

    public void mergeSort(double[] arreglo2, int par, int par1) {
       if (arreglo2.length > 1) {
        int mid = arreglo2.length / 2;
        double[] leftArr = Arrays.copyOfRange(arreglo2, 0, mid);
        double[] rightArr = Arrays.copyOfRange(arreglo2, mid, arreglo2.length);
        mergeSort(leftArr, 0, leftArr.length - 1);
        mergeSort(rightArr, 0, rightArr.length - 1);
        merge(arreglo2, leftArr, rightArr);
       }
    }

    public void merge(double[] arreglo2, double[] leftArr, double[] rightArr) {
        int i = 0, j = 0, k = 0;
    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) {
            arreglo2[k++] = leftArr[i++];
        } else {
            arreglo2[k++] = rightArr[j++];
        }
    }
    while (i < leftArr.length) {
        arreglo2[k++] = leftArr[i++];
    }
    while (j < rightArr.length) {
        arreglo2[k++] = rightArr[j++];
    }
    }
}
