package practice.bucles;

import java.util.Scanner;

public class exercise8 {
    /*
     * Practicando bucle while hasta dominarlo
     * Pide un número N > 0
     * Muestra los números desde N hasta 1
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el número a calcular:");
        int num;
        num=keyboard.nextInt();

        while (num<=0) {
            System.out.println("Número inválido, el número tiene que ser mayor que 0, por favor ingrese el número nuevamente");
            System.out.println("Ingrese el número a calcular:");
            num = keyboard.nextInt();
        }

        while (num>0) {
            System.out.println(num);
            num--;
        }
    }
}
