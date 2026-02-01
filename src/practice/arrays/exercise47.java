package practice.arrays;

public class exercise47 {
    /*
     * Practicando Arrays
     *
     * Crear una función longestPositiveStreak
     *
     * Debe:
     * - retorna mayor cantidad consecutiva de positivos.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - longestPositiveStreak(new int[]{1, 2, -1, 3, 4, 5}) -> 3
     * - longestPositiveStreak(new int[]{-1, -2}) -> 0
     * - longestPositiveStreak(new int[]{1, 1, 1}) -> 3
     * - longestPositiveStreak(new int[]{1, 2, 3, -1, 1}) -> 3
     * - longestPositiveStreak(new int[]{4, 5, -1, -2, 6, 7, 8, -5, 1}) -> 3
     */

    public static void main(String[] args) {
        System.out.println(longestPositiveStreak(new int[]{1, 2, -1, 3, 4, 5}));
        System.out.println(longestPositiveStreak(new int[]{-1, -2}));
        System.out.println(longestPositiveStreak(new int[]{1, 1, 1}));
        System.out.println(longestPositiveStreak(new int[]{1, 2, 3, -1, 1}));
        System.out.println(longestPositiveStreak(new int[]{4, 5, -1, -2, 6, 7, 8, -5, 1}));
    }

    static int longestPositiveStreak(int[] n){
        if(n.length == 0) return 0;

        int current = 0, max = 0;

        for (int i = 0; i < n.length; i++) {
            if(n[i]>0) {
                current++;
            }else {
                current = 0;
            }
            if(current > max){
                max = current;
            }
        }

        return max;
    }
}
