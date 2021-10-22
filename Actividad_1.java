/*
Elabore un programa que pida al usuario su edad, si es mayor de edad, 
debe preguntar si es trabajador, estudiante, ambos o nini; en cada caso 
envíe una recomendación o reconocimiento a la persona. El mensaje debe 
enfocarse a buscar un equilibrio entre tener un ingreso y seguir aprendiendo.

Si la persona trabaja y estudia pida su sueldo mensual y si gana menos de 
6000 al mes anúnciele que puede solicitar apoyo en el programa "Así prospera cualquiera"
en caso de ser menor de edad preguntar que desea hacer cuando sea grande... 
sugiérale opciones mínimo 3 y envíele información breve de cada opción.
 */
package test;

import java.util.Scanner;

public class Actividad_1 {

    public static void main(String[] args) {
        byte option = 0;
        Scanner consola = new Scanner(System.in);
        System.out.println("    Bienvenido usuario");
        System.out.println("Digite datos correspondientes");
        System.out.print("Edad >> ");
        int edad = consola.nextInt();

        if (edad >= 18) {
            System.out.println("¿Dedicacion...?");
            System.out.println("1.-Trabajador");
            System.out.println("2.-Estudiante");
            System.out.println("3.-Trabajador y estudiante");
            System.out.println("4.-Nini (Ni trabajo, ni estudio)");
            System.out.print(">> ");
            option = consola.nextByte();
            switch (option) {
                case 1:
                    System.out.println("Sigue trabajando para conseguir tus metas");
                    break;
                case 2:
                    System.out.println("Tus esfuerzos de hoy seran la reconpenza del mañana");
                    break;
                case 3:
                    System.out.println("¿Cuanto es el ingreso mensual?");
                    System.out.print("$$$ >> ");
                    float ingreso = consola.nextFloat();
                    if (ingreso < 6000) {
                        System.out.println("Ustede puede solicitar  apoyo al programa\n"
                                + "\"Así prospera cualquiera\"");
                    } else {
                        System.out.println("Se que lograras todas tus metas");
                    }
                    break;
                case 4:
                    System.out.println("Pongase a jalar weeeee");
                    break;
                default:
                    System.out.println("Opcion indicada no encontrada");
                    break;
            }
        } else {
            System.out.println("¿Que desea ser de grande?");
            System.out.print("1.-Ingeniero en sistemas computacionales\n"
                    + "2.-Policia\n"
                    + "3.-Soldado\n"
                    + "4.-Ingeniero en informatica\n"
                    + "5.-Contador\n"
                    + ">> ");
            option = consola.nextByte();
            switch(option){
                case 1:
                    System.out.println("Seras el/la mejor [Ingeniero/a en sistemas computacionales]");
                    break;
                case 2:
                    System.out.println("Seras el/la mejor [Policia]");
                    break;
                case 3:
                    System.out.println("Seras el/la mejor [Ingeniero/a en informatica]");
                    break;
                case 4:
                    System.out.println("Seras el/la mejor [Contador/a]");
                    break;
                default:
                    System.out.println("option incorrect");
            }
        }
    }
}
