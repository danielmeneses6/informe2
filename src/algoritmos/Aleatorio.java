
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
            aleatorio= (int)(Math.random()*10);
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
                System.out.println("la media es: ");
                    System.out.println((float)suma/arreglo.length);
                    System.out.println("para la mediana se ordena el arreglo: ");
                    Arrays.sort(arreglo);
                    for(int i=0;i<arreglo.length;i++)
                {
                System.out.print(arreglo[i]+" ");
                }
                System.out.println(" ");
                    System.out.println("siendo esta el numero de la mitad en caso de ser impar la longitud del arreglo, pero el promedio de los numeros centrales en caso de ser par el arreglo");
                    if(arreglo.length %2 == 0)
                    {
                        System.out.println("la mediana es: "+(float)((arreglo[arreglo.length/2])+((arreglo[(arreglo.length/2)-1])))/2);
                    }
                    else
                    {
                        System.out.println("la mediana es: "+arreglo[(int)0.5+(arreglo.length/2)]);
                    }
                break;
            case 2:
                 for(int i=0;i<arreglo.length;i++)
                {
                    suma=suma+arreglo[i];
                }
                float media=(float)suma/arreglo.length;
                suma=0;
                for(int i=0;i<arreglo.length;i++)
                {
                    suma=(int)(suma+(Math.pow(arreglo[i]-media,2)));
                }
                System.out.println("la varianza es: "+suma/arreglo.length);
                break;
            case 3:
     for(int i=0;i<arreglo.length;i++)
                {
                    suma=suma+arreglo[i];
                }
                media=(float)suma/arreglo.length;
                suma=0;
                for(int i=0;i<arreglo.length;i++)
                {
                    suma=(int)(suma+(Math.pow(arreglo[i]-media,2)));
                }
                System.out.println("la desviacion estandar es: "+Math.sqrt(suma/arreglo.length));
                break;
            case 4:
            int moda = 0;
            int frecuenciaModa = 0;
            int numerodemodas=1;

            for (int i = 0; i < arreglo.length; i++) {
            int frecuencia = 0;
             for (int j = 0; j < arreglo.length; j++) {
            if (arreglo[j] == arreglo[i]) {
                frecuencia++;
            }
            }
            if (frecuencia > frecuenciaModa) {
            frecuenciaModa = frecuencia;
            moda = arreglo[i];
            }
            if(frecuenciaModa==numerodemodas)
            {
                numerodemodas++;
            }
            }
            if (frecuenciaModa == 1) {
            System.out.println("No hay moda en el conjunto de datos");
            }
            else
                if(numerodemodas==frecuenciaModa)
            {
                System.out.println("existe mas de una moda");
            }
            else
                    System.out.println("la moda es: "+moda);
            break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        
    }
    
}
