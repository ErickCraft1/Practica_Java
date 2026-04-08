package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise66 {
    /*
     * Practicando Arrays
     *
     * Crear una función arrayBuild1(int[] num).
     *
     * Debe:
     * - Ordenarlo de menor a mayor
     * - Imprimirlo antes y después de ordenar
     * - Encontrar el valor mínimo y máximo SIN usar bucles
     *   (solo con Arrays y el array ya ordenado)
     *
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - arrayBuild1(new int[]{5, 3, 1, 4, 2})
     * - arrayBuild1(new int[]{-3, 7, 0, -1, 5})
     * - arrayBuild1(new int[]{1})
     * - arrayBuild1(new int[]{})
     */

    public static void main(String[] args) {
        arrayBuild1(new int[]{5, 3, 1, 4, 2});
        arrayBuild1(new int[]{-3, 7, 0, -1, 5});
        arrayBuild1(new int[]{1});
        arrayBuild1(new int[]{});
    }

    static void arrayBuild1(int[] num){
        if(num.length<1) {
            System.out.println("The array is empty");
            return;
        }
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int numMin = num[0];
        int numMax = num[num.length - 1];
        System.out.println("Minimun number " + numMin + " and Max number " + numMax);
    }
}

/*
 * Build-in 'Arrays.sort()'
 * "Este es el primer ejercicio el cual se utiliza build-in para comenzar
 *  a complementar lo aprendido en los 65 ejercicios anteriores"
 *
 * La complejidad algoritmica de Arrays.sort() es O(n log n), además
 * Arrays.sort() usa un algoritmo llamado Dual-Pivot Quicksort
 *
 *
 *
 *
 * Build-in 'Arrays.sort()'
 *
 * "This is the first exercise that uses the build-in to begin
 * complementing what you learned in the previous 65 exercises"
 *
 * The algorithmic complexity of Arrays.sort() is O(n log n), and
 * Arrays.sort() uses an algorithm called Dual-Pivot Quicksort
 */
