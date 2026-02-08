package practice.arrays;

public class exercise50 {
    /*
     * Practicando Arrays
     *
     * Crear una función minAbsSumOfTwoConsecutive
     *
     * Debe:
     * - retorna la suma de menor valor absoluto entre dos elementos consecutivos.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - minAbsSumOfTwoConsecutive(new int[]{4, -3, 1, -2}) -> -1  // 1 + -2
     * - minAbsSumOfTwoConsecutive(new int[]{5, 6, 7}) -> 11  // 5 + 6
     * - minAbsSumOfTwoConsecutive(new int[]{-10, 3, 8}) -> -7
     * - minAbsSumOfTwoConsecutive(new int[]{5}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(minAbsSumOfTwoConsecutive(new int[]{4, -3, 1, -2}));
        System.out.println(minAbsSumOfTwoConsecutive(new int[]{5, 6, 7}));
        System.out.println(minAbsSumOfTwoConsecutive(new int[]{-10, 3, 8}));
        System.out.println(minAbsSumOfTwoConsecutive(new int[]{5}));
    }

    static int minAbsSumOfTwoConsecutive(int[] num){
        if(num.length < 2) return -1;

        int bestSum = num[0] + num[1];
        int bestAbs=Math.abs(bestSum);

        for(int i = 2; i<num.length;i++){
            int sum = num[i] + num[i-1];
            int abs = Math.abs(sum);

            if(abs<bestAbs) {
                bestAbs = abs;
                bestSum = sum;
            }
        }
        return bestSum;
    }
}
