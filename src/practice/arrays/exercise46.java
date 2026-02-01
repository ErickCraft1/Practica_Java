package practice.arrays;

public class exercise46 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstPositiveAfterNegativeIndex
     *
     * Debe:
     * - retornar el índice, no el valor.
     *
     * Reglas:
     * - no imprimir dentro de la función
     * - usar arrays + bucle
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - firstPositiveAfterNegativeIndex(new int[]{-1, 2, 3}) -> 1
     * - firstPositiveAfterNegativeIndex(new int[]{1, -2, -3, 4}) -> 3
     * - firstPositiveAfterNegativeIndex(new int[]{1, 2, 3}) -> -1
     */

    public static void main(String[] args) {
        System.out.println(firstPositiveAfterNegativeIndex(new int[]{-1, 2, 3}));
        System.out.println(firstPositiveAfterNegativeIndex(new int[]{1, -2, -3, 4}));
        System.out.println(firstPositiveAfterNegativeIndex(new int[]{1, 2, 3}));
    }

    static int firstPositiveAfterNegativeIndex(int[] n) {
        if(n.length < 2) return -1;
        for (int i = 1; i < n.length; i++) {
            if(n[i-1]<0 && n[i] >0) return i;
        }
        return -1;
    }
}
