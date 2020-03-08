package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecciona una opcion");
        System.out.println();
        System.out.println("1. Desayuno: $4.000");
        System.out.println("2. Almuerzo: $10.000");
        System.out.println("3. Cena: $8.000");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("Paga $4.000 por el Desayuno.");

        } else if (opcion == 2) {
            System.out.println("Paga $10.000 por el Almuerzo.");
        } else if (opcion == 3) {
            System.out.println("Paga $8.000 por la Cena");

        } else {
            System.out.println("OPcion Incorrecta");
        }

        switch (opcion) {
            case 1:
                System.out.println("Paga $4.000 por el Desayuno.");
                break;
            case 2:
                System.out.println("Paga $10.000 por el Almuerzo.");
                break;
            case 3:
                System.out.println("Paga $8.000 por la cena.");
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }

        System.out.println("Ingresa tu Edad");
        int edad = teclado.nextInt();

        if(edad >=0 && edad <=3){
            System.out.println("es un bebe");

        }else  if(edad >=4 && edad <=7){
            System.out.println("es un niño");

        }else   if(edad >=8 && edad <=14){
            System.out.println("es un adolecente");

        }else   if(edad >=15 && edad <=20){
            System.out.println("es un joven");

        }else   if(edad >=21 && edad <=40){
            System.out.println("es un adulto");

        }else   if(edad >=41 ){
            System.out.println("es un anciono");

        }else {
            System.out.println("edad icorrecta");

        }

}
}
