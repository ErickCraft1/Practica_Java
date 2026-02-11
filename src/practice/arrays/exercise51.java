package practice.arrays;

public class exercise51 {
    /*
     * Practicando Arrays
     *
     * Crear una función maxSumOfThreeConsecutive
     *
     * Debe:
     * - retorna la mayor suma de 3 consecutivos.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - maxSumOfThreeConsecutive(new int[]{1, 2, 3, 1}) -> 6
     * - maxSumOfThreeConsecutive(new int[]-1, -2, -3, 4}) -> -1
         * - maxSumOfThreeConsecutive(new int[]{5, 2, 6, 7, 1}) -> 15
     * - maxSumOfThreeConsecutive(new int[]{5, 1}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(maxSumOfThreeConsecutive(new int[]{1, 2, 3, 1}));
        System.out.println(maxSumOfThreeConsecutive(new int[]{-1, -2, -3, 4}));
        System.out.println(maxSumOfThreeConsecutive(new int[]{5, 2, 6, 7, 1}));
        System.out.println(maxSumOfThreeConsecutive(new int[]{5, 1}));
    }


    static int maxSumOfThreeConsecutive(int[] num){
        int acc = 0, max = -1;

        if(num.length<3) return -1;

        max = num[0] + num[1] + num[2];

        for (int i = 1; i <= num.length-3; i++) {
            acc = num[i] +num[i+1] + num[i+2];
            if(acc>max) max = acc;
        }

        return max;
    }
}
