package practice.bucles;

public class exercice1 {


    /*
     * Precicar bucle for hasta dominarlo
     * Contar pares
     */
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if ((i + 1) % 2 == 0) {
                count++;
            }

        }
        System.out.println("La cantidad de números pares es: "+count);
    }
}
