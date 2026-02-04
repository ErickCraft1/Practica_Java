package practice.arrays;

public class exercise48 {
    /*
     * Practicando Arrays
     *
     * Crear una función maxSumOfTwoConsecutive
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
     * - maxSumOfTwoConsecutive(new int[]{1, 2, 3, 1}) -> 5
     * - maxSumOfTwoConsecutive(new int[]{-1, -2, -3}) -> -3
     * - maxSumOfTwoConsecutive(new int[]{5}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(maxSumOfTwoConsecutive(new int[]{1, 2, 3, 1}));
        System.out.println(maxSumOfTwoConsecutive(new int[]{-1, -2, -3}));
        System.out.println(maxSumOfTwoConsecutive(new int[]{5}));
    }

    static int maxSumOfTwoConsecutive(int[] n){
        if(n.length <2) return -1;
        int max = n[0]+n[1];

        for (int i = 1; i < n.length-1; i++) {
            int sum = n[i] + n[i+1];

            if(sum>max) {
                max =sum;
            }
        }
        return max;
    }
}
