package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise69 {
    /*
     * Practicando Arrays
     *
     * Crear una función searchInSorted(int[] arr, int[] targets).
     *
     * Debe:
     * - Ordenar el array
     * - Para cada valor en targets, busque si existe en arr
     * - Imprimir para cada target: el valor, si existe, y su índice
     * - Retornar cuántos targets fueron encontrados
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - searchInSorted(new int[]{5,3,8,1,9,2}, new int[]{3,7,1,9})
     * - searchInSorted(new int[]{10,20,30,40}, new int[]{25,30})
     * - searchInSorted(new int[]{}, new int[]{1})
     * - searchInSorted(new int[]{5}, new int[]{5, 6})
     */

    public static void main(String[] args) {
        System.out.println("exercise69.searchInSorted \n");
        System.out.println(searchInSorted(new int[]{5, 3, 8, 1, 9, 2}, new int[]{3, 7, 1, 9}));
        System.out.println(searchInSorted(new int[]{10, 20, 30, 40}, new int[]{25, 30}));
        System.out.println(searchInSorted(new int[]{}, new int[]{1}));
        System.out.println(searchInSorted(new int[]{5}, new int[]{5, 6}));
        System.out.println(searchInSorted(new int[]{5, 6}, new int[]{}));
    }

    static int searchInSorted(int[] arr, int[] targets) {
        int result, count = 0;
        if (targets.length < 1) {
            System.out.println("\nTarget is empty");
            return count;
        }
        Arrays.sort(arr);
        System.out.println("\narr = " + Arrays.toString(arr) + ", targets = " + Arrays.toString(targets));
        for (int num : targets) {
            result = Arrays.binarySearch(arr, num);
            System.out.print("Value: " + num + ", ");
            if (result < 0) {
                System.out.print("Does it exist?: " + false + ", ");
            } else {
                System.out.print("Does it exist?: " + true + ", ");
                count++;
            }
            System.out.println("Index: " + result);
        }
        System.out.println("Targets found: " + count);
        return count;
    }
}

/*
 * Build-in 'Arrays.binarySearch(param1,param2)'
 * - binarySearch busca de forma optima el valor ingresado en el param2, dividiendo el array
 *   en cada paso decidiendo si el valor está a la izquierda o derecha dependiendo del elemento
 *   ubicado en el centro.
 *
 * - El punto negativo es que el array debe estar ordenado, ya que si no lo está, binarySearch puede
 *   descartar el valor buscado.
 *
 * La complejidad algoritmica de este ejercicio es O(n log n).
 *
 *
 *
 * Build-in 'Arrays.binarySearch(param1,param2)'
 * - binarySearch optimally searches for the value entered in param2, dividing the array
 *   at each step and deciding whether the value is on the left or right depending on the element
 *   located in the middle.
 *
 * - The downside is that the array must be sorted, because if it isn't, binarySearch may
 *   discard the searched value.
 *
 * The algorithmic complexity of this exercise is O(n log n).
 */
