package practice;

import java.util.Scanner;

public class exercice1 {
    public static void main (String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<15;i++){
            System.out.println("Ingrese los número para el vector");
            vector[i] = teclado.nextInt();
        }

        // Recorrer y contar cuantos números 3 hay
        int count=0;
        for (int i=0; i<15;i++) {
            if(vector[i] == 3) {
                count++;
            }
        }
        System.out.println("La cantidad de números '3' que hay en el vector es: "+count);
    }
}
