package practice.bucles;

import java.util.Scanner;

public class exercise6 {
    /*
     * Practicando bucle for hasta dominarlo
     * Pida un número N
     * y muestre solo la suma de los números pares desde 1 hasta N.
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el numero a calcular");
        int n = keyboard.nextInt();

        int add = 0;

        for (int i=1;i<=n;i++) {
            if (i%2==0) {
                add = i + add;
            }
        }
        System.out.println(add);
    }
}
