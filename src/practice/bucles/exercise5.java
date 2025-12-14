package practice.bucles;

import java.util.Scanner;

public class exercise5 {
    /*
    * Practicando bucle for hasta dominarlo
    * Escribe un programa que pida un número
    * y muestre la suma de todos los números del 1 hasta N.
    */

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Ingrese el numero a calcular");
        int n = keyboard.nextInt();
        keyboard.close();

        int count=0;

        for (int i=1;i<=n;i++) {
            count = i + count;
            System.out.println(count-i +"+"+ i +"="+count);
        }
    }
}
