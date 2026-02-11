package practice.arrays;

public class exercise52 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstDecreasingPair
     *
     * Debe:
     * - retorna el primer valor que rompe una subida.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstDecreasingPair(new int[]{1, 2, 3, 2, 5}) -> 2
     * - firstDecreasingPair(new int[]5, 4, 3}) -> -1
     * - firstDecreasingPair(new int[]{1, 2, 3}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(firstDecreasingPair(new int[]{1, 2, 3, 2, 5}));
        System.out.println(firstDecreasingPair(new int[]{1, 2, 3, 2, 1}));
        System.out.println(firstDecreasingPair(new int[]{1, 1, 2, 3, 0}));
        System.out.println(firstDecreasingPair(new int[]{1, 2, 1, 3}));
        System.out.println(firstDecreasingPair(new int[]{1, 2, 3, 4, 1}));
        System.out.println(firstDecreasingPair(new int[]{5, 4, 3}));
        System.out.println(firstDecreasingPair(new int[]{1, 2, 3}));
    }

    static int firstDecreasingPair(int[] num) {
        int numBreak = -1;

        if(num.length<3) return numBreak;

        for (int i = 2; i<num.length;i++){
            if(num[i-2]<num[i-1]&&num[i-1]>num[i]) {
                return numBreak = num[i];
            }
        }

        return numBreak;
    }
}
