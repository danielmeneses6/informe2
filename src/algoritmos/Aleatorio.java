
package algoritmos;

import java.util.Scanner;
import java.util.Arrays;

public class Aleatorio {
    int tamaño,contador;
    Scanner leer1= new Scanner(System.in);
    public Aleatorio(int t,int c)
    {
        tamaño=t;
        contador=c;
    }
    public Aleatorio()
    {
        tamaño=0;
        contador=0;
    }
    public void llenar(int t)
    {
        int aleatorio=0, opcion1=0;
        int [] arreglo= new int [t];  
        int suma=0;
        for(int i=0;i<t;i++)
        {
            aleatorio= (int)(Math.random()*100);
            arreglo[i]=aleatorio;
            contador=arreglo.length;
        }
        System.out.println("el arreglo aleatorio tiene los siguientes valores: ");
        for(int i=0;i<arreglo.length;i++)
        {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println(" ");
        System.out.println("ingrese la accion que desea realizar: ");
                 System.out.println("1.media y mediana");
                 System.out.println("2.varianza");
                 System.out.println("3.desviacion estandar");
                 System.out.println("4. moda");
                  opcion1=leer1.nextInt();
        switch (opcion1) {
            case 1:
                for(int i=0;i<arreglo.length;i++)
                {
                    suma=suma+arreglo[i];
                    
                }
                System.out.println("la media aproximada es: ");
                    System.out.println(suma/arreglo.length);
                    System.out.println("para la mediana se ordena el arreglo: ");
                    Arrays.sort(arreglo);
                    for(int i=0;i<arreglo.length;i++)
                {
                System.out.print(arreglo[i]+" ");
                }
                System.out.println(" ");
                    System.out.println("siendo esta el numero de la mitad en caso de ser impar la longitud del arreglo, pero el promedio de los numeros centrales en caso de ser par el arreglo");
                    if(arreglo.length %2 !=0)
                    {
                        System.out.println("la mediana es: "+arreglo[(int)0.5+(arreglo.length/2)]);
                    }
                    else
                    {
                        System.out.println("la mediana es: "+((arreglo[arreglo.length/2])+((arreglo[arreglo.length/2])+1))/2);
                    }
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                
                break;
        }
        
    }
    
}
