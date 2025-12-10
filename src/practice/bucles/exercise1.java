package practice.bucles;

public class exercise1 {


    /*
     * Practicar bucle for hasta dominarlo
     * Contar pares
     * Contar impares
     */
    public static void main(String[] args) {
        int number = 15;
        int count = 0;
        int count2=0;
        for (int i = 1; i <= number; i++) {
            if ((i + 1) % 2 == 0) {
                count++;
            } else  {
                count2++;
            }

        }
        System.out.println("La cantidad de números pares es: "+count);
        System.out.println("La cantidad de números impares es: "+ count2);
    }
}
