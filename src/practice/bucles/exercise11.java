package practice.bucles;

import java.util.Scanner;

public class exercise11 {
    /*
     * Practicando bucle do-while
     * Crea un programa que muestre este menú al menos una vez:
     *  1. Sumar
     *  2. Restar
     *  3. Salir
     * El menú se repite hasta que el usuario elija Salir
     * Para sumar/restar:
     *  - Pide dos números
     *  - Muestra el resultado
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bienvenido, que desea realizar el día de hoy?");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Salir");

        int num, a, b, result;
        do {
            num = keyboard.nextInt();
            if (num == 1) {
                System.out.println("Usted eligio Sumar");
                System.out.println("Coloque los 2 números a sumar:");
                System.out.println("Primer número: "+ (a = keyboard.nextInt()));
                System.out.println("Segundo número: "+ (b = keyboard.nextInt()));
                result = a + b;
                System.out.println("El resultado de la suma es: "+result);

                System.out.println("Porfavor seleccione una de las siguientes opciones: ");

                System.out.println("1.- Sumar");
                System.out.println("2.- Restar");
                System.out.println("3.- Salir");
            } else if (num == 2) {
                System.out.println("Usted eligio Restar");
                System.out.println("Coloque los 2 números a restar:");
                System.out.println("Primer número: "+ (a = keyboard.nextInt()));
                System.out.println("Segundo número: "+ (b = keyboard.nextInt()));
                result = a - b;
                System.out.println("El resultado de la resta es: "+result);

                System.out.println("Porfavor seleccione una de las siguientes opciones: ");

                System.out.println("1.- Sumar");
                System.out.println("2.- Restar");
                System.out.println("3.- Salir");

            } else {
                System.out.println("Usted eligio salir, vuelva pronto.");
            }
        }
        while (num!=3);
        keyboard.close();
    }

}
