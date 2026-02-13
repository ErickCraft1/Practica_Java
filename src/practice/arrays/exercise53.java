package practice.arrays;

public class exercise53 {
    /*
     * Practicando Arrays
     *
     * Crear una función longestAlternatingStreak
     *
     * Debe:
     * - retorna la cantidad de secuencia donde los signos alternan (+, −, +, −).
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - longestAlternatingStreak(new int[]{1, -1, 2, -2, 3}) -> 5
     * - longestAlternatingStreak(new int[]{1, 2, -1, -2}) -> 2
     * - longestAlternatingStreak(new int[]{-1, 1, -1}) -> 3
     */

    public static void main(String[] args) {
        System.out.println(longestAlternatingStreak(new int[]{1, -1, 2, -2, 3})); //5
        System.out.println(longestAlternatingStreak(new int[]{1, 2, -1, -2})); //2
        System.out.println(longestAlternatingStreak(new int[]{1, -1, 1})); //3
        System.out.println(longestAlternatingStreak(new int[]{1, 1, -1, 1, -1})); //4
        System.out.println(longestAlternatingStreak(new int[]{-5, 5, -3, 2})); //4
        System.out.println(longestAlternatingStreak(new int[]{5, 5, 5, -1})); //2
        System.out.println(longestAlternatingStreak(new int[]{1})); //1
    }

    static int longestAlternatingStreak(int[] n){
        if(n.length<1) return -1;

        int current = 1, max = 1;

        for (int i = 1; i < n.length; i++) {
            boolean prevSign = n[i - 1] > 0;
            boolean currSign = n[i] > 0;

            if(prevSign != currSign){
                current++;
            } else {
                current = 1;
            }
            if(current>max) max = current;
        }

        return max;
    }

}
