package practice.arrays;

public class exercise59 {
    /*
     * Practicando Arrays
     *
     * Crear una función longestEvenSumPositiveSequence
     *
     * Debe:
     * - retornar la longitud de la secuencia más larga de números positivos consecutivos cuya suma total sea par.
     *
     * Reglas:
     * - Solo cuentan números positivos consecutivos.
     * - La secuencia puede ser de cualquier longuitud >= 1.
     * - La suma total de esa secuencia debe ser par.
     * - Si ninguna secuencia cumple -> retorna 0.
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - longestEvenSumPositiveSequence(new int[]{1, 3, 5})       → 0 (1,3,5 -> suma=9 → impar ❌)
     * - longestEvenSumPositiveSequence(new int[]{2, 4, 1, 1})    → 4 (2,4,1,1 -> suma=8 ->len = 4)
     * - longestEvenSumPositiveSequence(new int[]{1, 2, 3, -1, 4, 4})  → 3 (1,2,3 → suma=6 → par ✔ → len=3)
     * - longestEvenSumPositiveSequence(new int[]{5, 7, -1, -2})  → 2
     * - longestEvenSumPositiveSequence(new int[]{})              → 0
     */

    public static void main(String[] args) {
        System.out.println(longestEvenSumPositiveSequence(new int[]{1, 3, 5}));
        System.out.println(longestEvenSumPositiveSequence(new int[]{2, 4, 1, 1}));
        System.out.println(longestEvenSumPositiveSequence(new int[]{1, 2, 3, -1, 4, 4}));
        System.out.println(longestEvenSumPositiveSequence(new int[]{5, 7, -1, -2}));
        System.out.println(longestEvenSumPositiveSequence(new int[]{}));
        System.out.println(longestEvenSumPositiveSequence(new int[]{1,1,1,2,2,2,-1}));
    }

    static int longestEvenSumPositiveSequence(int[] num){
        int len=0, maxLen=0, sum=0;
        if(num.length<1) return maxLen;

        for (int n : num) {
            if (n > 0) {
                len++;
                sum += n;
            } else {
                if (len > maxLen && sum%2==0) maxLen = len;
                sum = 0;
                len = 0;
                continue;
            }
        }
        if (len > maxLen && sum%2==0) maxLen = len;
        return maxLen;
    }
}
