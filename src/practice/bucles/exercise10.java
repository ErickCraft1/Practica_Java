package practice.bucles;

import java.util.Scanner;

public class exercise10 {
    /*
     * Practicando bucle while hasta dominarlo
     * El programa tiene un número fijo (por ejemplo 7)
     * El usuario intenta adivinarlo
     * Mientras no acierte:
     * - Mostrar "Número incorrecto"
     * - Volver a pedir
     * Cuando acierte:
     * - Mostrar "Correcto"
     * - Mostrar cuántos intentos hizo
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numerCorrect = 7;
        int count = 0;
        String txtInit = "Ingrese un número:";
        String txtCorrect = "Correcto";
        String txtNoCorrect = "Número Incorrecto";
        System.out.println(txtInit);
        int num = keyboard.nextInt();

        count++;
        while (num != numerCorrect) {
            System.out.println(txtNoCorrect);
            System.out.println(txtInit);
            num = keyboard.nextInt();
            count++;
        }
        System.out.println(txtCorrect);

        System.out.println("Intenos: "+count);
        keyboard.close();
    }
}
