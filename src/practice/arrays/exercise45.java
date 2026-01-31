package practice.arrays;

public class exercise45 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstTrendBreakStrict
     *
     * Debe:
     * - Solo considerar tendencia si existen al menos 2 pasos consecutivos en la misma dirección.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstTrendBreakStrict(new int[]{1, 2, 1, 3}) -> -1
     * - firstTrendBreakStrict(new int[]{1, 2, 3, 1}) -> 1
     * - firstTrendBreakStrict(new int[]{5, 4, 3, 6}) -> 6
     * - firstTrendBreakStrict(new int[]{1, 1, 2, 3, 0}) -> 0
     */

    public static void main(String[] args) {
        System.out.println(firstTrendBreakStrict(new int[] {1,2,1,3}));
        System.out.println(firstTrendBreakStrict(new int[] {1,2,3,1}));
        System.out.println(firstTrendBreakStrict(new int[] {5,4,3,6}));
        System.out.println(firstTrendBreakStrict(new int[] {1,2,3,0}));
    }

    static int firstTrendBreakStrict(int[] num){
        if(num.length<3) return 0;
        int bp = 0;
        for (int i = 2; i < num.length; i++) {
            if (num[i] == num[i-1] && num[i-1] == num[i-2]) continue;

            if (bp ==0) {
                if(num[i-2] < num[i-1] && num[i-1] < num[i]) {
                    bp = 1;
                } else if (num[i-2] > num[i-1] && num[i-1] > num[i]){
                    bp = -1;
                }
                continue;
            }
            if (bp == 1 && num[i] < num[i - 1]) {
                return num[i];
            }
            if (bp == -1 && num[i] > num[i - 1]) {
                return num[i];
            }
        }
            return -1;
    }
}
