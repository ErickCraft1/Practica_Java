package practice.arrays;

public class exercise49 {
    /*
     * Practicando Arrays
     *
     * Crear una función firstSequenceOfThreePositives
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
     * - firstSequenceOfThreePositives(new int[]{1, 2, 3, -1}) -> 1
     * - firstSequenceOfThreePositives(new int[]{-1, 1, 2, 3, 4}) -> 1
     * - firstSequenceOfThreePositives(new int[]{1, 2}) -> -1
     * - firstSequenceOfThreePositives(new int[]{-2, 4, 6, 8, 3}) -> 4
     */

    public static void main(String[] args) {
        System.out.println(firstSequenceOfThreePositives(new int[]{1, 2, 3, -1}));
        System.out.println(firstSequenceOfThreePositives(new int[]{-1, 1, 2, 3, 4}));
        System.out.println(firstSequenceOfThreePositives(new int[]{1, 2}));
        System.out.println(firstSequenceOfThreePositives(new int[]{-2, 4, 6, 8, 3}));
    }

    static int firstSequenceOfThreePositives(int[] n){
        if(n.length <3) return -1;

        for (int i = 0; i < n.length; i++) {
            if(0<n[i] && 0<n[i+1]&&0<n[i+2])return n[i];
        }

        return -1;
    }
}
