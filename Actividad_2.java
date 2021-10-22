package test;

import java.util.Scanner;

/*
2.- Elabore un programa usando ciclo while 
que pida un numero inicial y Numero final e 
imprima esa numeración.

Numero inicial   6                 Numero final  16

Al ejecutar debe imprimir 6,7,8,9,10,11,12,13,14,15,16   
La impresión debe ser en un renglón
 */
public class Actividad_2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Digita los datos para una cadena de numeros");
        //Inicalizar el contador
        System.out.print("Numero incial >> ");
        int numI = consola.nextInt();
        //Termina el contador
        System.out.print(" Numero final >> ");
        int numF = consola.nextInt();
        
        while (numI <= numF) {
            System.out.println(numI);
            numI ++;
        }
    }
}
