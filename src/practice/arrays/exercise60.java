package practice.arrays;

public class exercise60 {
    /*
     * Practicando Arrays
     *
     * Crear una función maxSumPositiveSubarray
     *
     * Debe:
     * - retornar la máxima suma de cualquier subarray compuesto únicamente por números positivos.
     *
     * Reglas:
     * - Solo cuentan números positivos consecutivos.
     * - La secuencia puede ser de cualquier longuitud >= 1.
     * - La suma total de esa secuencia debe ser par.
     * - Si no existe ninguno -> retornar 0.
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - maxSumPositiveSubarray(new int[]{1, 2, -1, 3, 4})   → 7 ([1,2] -> 3 , [3,4] -> 7)
     * - maxSumPositiveSubarray(new int[]{-1, -2, -3})          → 0 (no hay positivos)
     * - maxSumPositiveSubarray(new int[]{5, 1, 2})             → 8 (Un solo bloque → suma = 8)
     * - maxSumPositiveSubarray(new int[]{5, 7, -1, -2})        → 12
     */

    public static void main(String[] args) {
        System.out.println(maxSumPositiveSubarray(new int[]{1, 2, -1, 3, 4}));
        System.out.println(maxSumPositiveSubarray(new int[]{-1, -2, -3}));
        System.out.println(maxSumPositiveSubarray(new int[]{5, 1, 2}));
        System.out.println(maxSumPositiveSubarray(new int[]{5, 7, -1, -2}));
    }

    static int maxSumPositiveSubarray(int[] num){
        int sum = 0, maxSum = 0;
        if(num.length < 1) return maxSum;

        for (int n : num){
            if(n>0){
                sum+=n;
            } else {
                if(sum>maxSum) maxSum=sum;
                sum = 0;
            }
        }
        if(sum>maxSum) maxSum=sum;

        return maxSum;
    }
}
