package practice.arrays;

public class exercise44 {
    /*
     * Practicando Arrays
     *
     * Crear una función countTrendBreaks
     *
     * Debe:
     * - retornar cuántas veces se rompe la tendencia inicial.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - countTrendBreaks(new int[]{1, 2, 3, 2, 3, 1}) -> 3
     * - countTrendBreaks(new int[]{5, 4, 3, 2) -> 0
     * - countTrendBreaks(new int[]{1, 2, 1, 2, 1}) -> 3
     * - countTrendBreaks(new int[]{1, 1, 1, 1}) -> 0
     */

    public static void main(String[] args) {
        System.out.println(countTrendBreaks(new int[]{1, 2, 3, 2, 3, 1}));
        System.out.println(countTrendBreaks(new int[]{5, 4, 3, 2}));
        System.out.println(countTrendBreaks(new int[]{1, 2, 1, 2, 1}));
        System.out.println(countTrendBreaks(new int[]{1, 1, 1, 1}));
    }

    static int countTrendBreaks(int[] num){
        if(num.length<2) return 0;

       int count = 0, bp = 0; // BP or bp is equal to Break Point or Punto de Ruptura

        for (int i = 1; i < num.length; i++) {
            if(num[i] == num[i-1]) continue;

            if(bp == 0) {
                bp = num[i] > num[i-1] ? 1 : -1;
            } else {
                if(bp == 1 && num[i] < num[i-1]) {
                    bp = -1;
                    count++;
                }else if(bp == -1 && num[i] > num[i-1]) {
                    bp = 1;
                    count++;
                }
            }
        }
        return count;
    }

}
