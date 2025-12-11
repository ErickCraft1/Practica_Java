package practice.bucles;

import java.util.Scanner;

public class exercise4 {
    /*
    * Practica bucle for hasta dominarlo
    * Dibujo asteriscos
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int filas = keyboard.nextInt();
        keyboard.close();

        for (int i=1;i<=filas;i++) {
            String fila = "*".repeat(2);
            System.out.println(fila);
        }
    }
}
