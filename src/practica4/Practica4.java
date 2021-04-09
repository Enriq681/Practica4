

import java.util.Scanner;


public class Practica4 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double SumaNumeros=0;
       double Promedio=0;
       
       System.out.println("Ingresa un Numero: ");
       int Numero=sc.nextInt();
       
       double numeros[]=new double[Numero];
       
       for(int i=0; i<numeros.length; i++){
           System.out.println("Ingrese un numero: "+(i+1));
           numeros[i]=sc.nextDouble();
       }
       for(int i=0; i<numeros.length; i++){
           SumaNumeros=SumaNumeros+numeros[i];
           Promedio=SumaNumeros/Numero;
    }
       System.out.println("Promedio: "+Promedio);
    }
    
}
