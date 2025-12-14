package practice.bucles;

import java.util.Scanner;

public class exercise7 {

    /*
     * Practicando bucle while hasta dominarlo
     * Pida un número mayor que 0
     * Si el usuario ingresa un número inválido, lo vuelve a pedir
     * Cuando sea válido, muestra la tabla de multiplicar de ese número (1 al 10)
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el número a calcular:");
        int num;
        num= keyboard.nextInt();

        int multiplicator = 1;

        while (num<=0) {
            System.out.println("Número inválido, el número tiene que ser mayor que 0, por favor ingrese el número nuevamente");
            System.out.println("Ingrese el número a calcular:");
           num = keyboard.nextInt();
        }
        while(multiplicator<=10) {
            System.out.println(num+" x "+multiplicator+" = "+num*multiplicator);
            multiplicator++;
        }
    }
}
