package practice.bucles;

import java.util.Scanner;

public class exercise9 {
    /*
     * Practicando bucle while hasta dominarlo
     * Pide números al usuario uno por uno
     * El programa termina cuando el usuario ingrese 0
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese los números:");
        int num = keyboard.nextInt();
        int add = 0;
        int count = 0;
        while (num != 0) {
            add = add + num;
            count++;
            num = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println("Suma: "+add);
        System.out.println("Cantidad: "+ count);
    }
}
