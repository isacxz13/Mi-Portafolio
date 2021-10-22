package test;

import java.util.Scanner;

/*
Elija un programa anterior y usando el ciclo 
do-while haga que su programa salga de acuerdo 
a la pregunta Desea salir del programa? S/N s/n ____
 */
public class Actividad_3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        //inicializamos las variables que utilizaremos
        float suma = 0;
        char respuesta;
        int opcion = 0;
        int pagar = 0;

        System.out.println("<<Bienvenido a la tienda de XZ13>>");
        //se utiliza el do while
        do {
            System.out.println("La suma de sus articulos es de: $" + suma);
            System.out.println("Opciones...\n[S] = Comprar\n[N] = Salir de la tienda\n");
            System.out.print("Elija una opcion >> ");
            char x = consola.next().charAt(0);
            
            //Se agrega este codigo para todos los caracteres que digite el usuario los haga a minuscula
            respuesta = Character.toLowerCase(x);
            //utilizamos un switch para el menu
            switch (respuesta) {
                case 's':
                    System.out.println("En la tienda\n");
                    System.out.println(".:Menu:.\n");
                    System.out.println("1.-Pantalones para hombre <<$150.45>>");
                    System.out.println("2.-Camisas para hombre <<$99.99>>");
                    System.out.println("3.-Playeras para hombre <<$50.99>>");
                    System.out.print("Elija una opcion >>");
                    opcion = consola.nextInt();
                    if (opcion == 1) {
                        suma += 150.45;
                    } else if (opcion == 2) {
                        suma += 99.99;
                    } else if (opcion == 3) {
                        suma += 50.99;
                    } else {
                        System.out.println("la opcion indicada no cuenta con un articulo :(");
                    }
                    break;
                case 'n':
                    System.out.print("Cerrar programa\n");
                    break;
                    //Si no digita la correcta el programa le indicara 
                default:
                    System.out.println("Opcion indicada no encotrada");
                    break;
            }
            //Se cierra el programa al introducir n de no comprar más
        } while (respuesta != 'n');
        System.out.println("El total de la compra es de: " + suma);
    }
}
