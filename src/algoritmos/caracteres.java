package algoritmos;

import java.util.Scanner;

public class Caracteres {
    Scanner leer2= new Scanner(System.in);
     public void inverso()
     {
         System.out.println("ingrese la linea a modificar: ");
         String lineadc =leer2.nextLine();
         char[] caract = lineadc.toCharArray();
         int frecuencia = 0;
         int frecuenciacmr=0;
         char caract1=0;
         int numerodemodas=2;
         for (int i = 0; i < caract.length; i++) {
             for (int j = 0; j < caract.length; j++) {
            if (caract[j] == caract[i]) {
                frecuencia++;
            }
            }
              if (frecuencia > frecuenciacmr) {
                frecuenciacmr = frecuencia;
                caract1 = caract[i];
                
            }
               if(frecuenciacmr==numerodemodas)
            {
                numerodemodas++;
            }
               
            }
         if (frecuenciacmr == 1) {
            System.out.println("No hay dato que se repita mas veces");
            }
            else
                if(numerodemodas==frecuenciacmr)
            {
                System.out.println("hay mas de un caracter que se repite, se tomará: "+caract1);
                System.out.println("la linea al reemplazar las vocales seria: ");
                    for(int i=0;i<caract.length;i++)
                    {
                        if(caract[i]=='a'||caract[i]=='e'||caract[i]=='i'||caract[i]=='o'||caract[i]=='u'||caract[i]=='A'||caract[i]=='E'||caract[i]=='I'||caract[i]=='O'||caract[i]=='U')
                        {
                            caract[i]=caract1;
                        }
                    }
                    System.out.println(caract);
            }
            else
                {
                    System.out.println("la caracter mas repetido es: "+caract1);
                    System.out.println("la linea al reemplazar las vocales seria: ");
                    for(int i=0;i<caract.length;i++)
                    {
                        if(caract[i]=='a'||caract[i]=='e'||caract[i]=='i'||caract[i]=='o'||caract[i]=='u'||caract[i]=='A'||caract[i]=='E'||caract[i]=='I'||caract[i]=='O'||caract[i]=='U')
                        {
                            caract[i]=caract1;
                        }
                    }
                    System.out.println(caract);
                }
         System.out.println("la linea de codigo escrita de forma inversa seria: ");
         String invertido="";
          for (int i = caract.length - 1; i >= 0; i--) {
            invertido += caract[i];
        }
         System.out.println(invertido);
     }
}
