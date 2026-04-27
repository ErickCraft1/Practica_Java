package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise70 {
    /*
     * Practicando Arrays
     *
     * Crear una función rotateArray(int[] arr, int k).
     *
     * Debe:
     * - Rotar el array k posiciones a la derecha
     * - Usar System.arraycopy para mover los elementos
     * - No usar bucles
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - rotateArray(new int[]{1,2,3,4,5}, 2)    →  [4,5,1,2,3]
     * - rotateArray(new int[]{1,2,3,4,5}, 5)    →  [1,2,3,4,5]
     * - rotateArray(new int[]{1,2,3,4,5}, 7)    →  [4,5,1,2,3]
     * - rotateArray(new int[]{1,2,3,4,5}, 0})   →  [1,2,3,4,5]
     * - rotateArray(new int[]{1}, 3)            →  [1]
     * - rotateArray(new int[]{}, 2)             →  vacío
     */

    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5}, 2);
        rotateArray(new int[]{1,2,3,4,5}, 5);
        rotateArray(new int[]{1,2,3,4,5}, 7);
        rotateArray(new int[]{1,2,3,4,5}, 0);
        rotateArray(new int[]{1}, 3);
        rotateArray(new int[]{}, 2);
    }

    static void rotateArray(int[] arr, int k){
        int[] copy;
        if(k>= arr.length && arr.length!=0) k = k % arr.length;
        if(k==arr.length || k<1 || arr.length==0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        copy = Arrays.copyOf(arr,arr.length-k);
        System.arraycopy(arr,copy.length,arr,0,k);
        System.arraycopy(copy,0,arr,k,copy.length);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Build-in 'Arrays.copyOf() y System.arraycopy()'
 * - Este ejercicio tuve que reutilizar conceptos ya aprendidos para rotar las posiciones de los
 *   elementos del array.
 *
 * La complejidad algoritmica de este ejercicio es O(n).
 *
 *
 *
 * Build-in 'Arrays.copyOf() and System.arraycopy()'
 * - This exercise required me to reuse previously learned concepts to rotate the positions of the array elements.
 *
 * The algorithmic complexity of this exercise is O(n).
 */