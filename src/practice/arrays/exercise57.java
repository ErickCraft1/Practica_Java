package practice.arrays;

public class exercise57 {
    /*
     * Practicando Arrays
     *
     * Crear una función longestSequence
     *
     * Debe:
     * - Encuentra la longitud de la secuencia más larga de números positivos consecutivos.
     * - Si no existe → retornar 0
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - longestSequence(new int[]{1,2,3,-1,4,5})     → 3
     * - longestSequence(new int[]{-1, -2, -3})       → 0
     * - longestSequence(new int[]{5, 6, 7, 8})       → 4
     * - longestSequence(new int[]{1, 2, 3})          → 3
     */

    public static void main(String[] args) {
        System.out.println(longestSequence(new int[]{1, 2, 3, -1, 4, 5}));
        System.out.println(longestSequence(new int[]{-1, -2, -3}));
        System.out.println(longestSequence(new int[]{5, 6, 7, 8}));
        System.out.println(longestSequence(new int[]{1, 2, 3}));
    }

    static int longestSequence(int[] num){
        int current = 0, max = 0;
        if(num.length<1) return 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                current++;
            }else {
                current = 0;
            }
            if(current>max) max = current;
        }
        return max;
    }
}
