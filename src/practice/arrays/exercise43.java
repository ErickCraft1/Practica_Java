package practice.arrays;

public class exercise43 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstTrendBreakIndex
     *
     * Debe:
     * - retornar el índice donde se rompe la tendencia, no el valor.
     * - si no existe ese caso, retorna -1
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstTrendBreakIndex(new int[]{1, 2, 3, 2}) -> 3
     * - firstTrendBreakIndex(new int[]{5, 6, 7, 8, 1}) -> 4
     * - firstTrendBreakIndex(new int[]{1, 1, 1, 4}) -> -1
     * - firstTrendBreakIndex(new int[]{3, 2, 1, 0}) -> -1
     * - firstTrendBreakIndex(new int[]{15, 2, 8, 5, 3, 1}) -> 2
     */

    public static void main(String[] args) {
        System.out.println(firstTrendBreakIndex(new int[]{1, 2, 3, 2}));
        System.out.println(firstTrendBreakIndex(new int[]{5, 6, 7, 8, 1}));
        System.out.println(firstTrendBreakIndex(new int[]{1, 1, 1, 4}));
        System.out.println(firstTrendBreakIndex(new int[]{3, 2, 1, 0}));
        System.out.println(firstTrendBreakIndex(new int[]{15, 2, 8, 5, 3, 1}));
    }

    static int firstTrendBreakIndex(int[] num){
        if(num.length<2) return -1;

        int trend = 0;

        for (int i = 1; i < num.length; i++) {
            if(num[i] == num[i-1]) continue;

            if(trend == 0) {
                trend = num[i] > num[i-1] ? 1 : -1;
            } else {
                if(trend == 1 && num[i] < num[i-1]) return i;
                if(trend == -1 && num[i] > num[i-1]) return i;
            }
        }
        return -1;
    }
}
