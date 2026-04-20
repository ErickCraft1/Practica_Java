package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise68 {
    /*
     * Practicando Arrays
     *
     * Crear una función mergeAndCompare(int[] arr1, int[] arr2).
     *
     * Debe:
     * - Unir los dos arrays en uno solo sin built-in de concatenación
     * - Rellenar con -1 las posiciones vacías si arr1 y arr2
     *   tienen distinta longitud (para igualar tamaños antes de comparar)
     * - Comparar si arr1 y arr2 son iguales
     * - Imprimir el array unido y el resultado de la comparación
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - mergeAndCompare(new int[]{1, 2, 3}, new int[]{1, 2, 3})
     * - mergeAndCompare(new int[]{1, 2, 3}, new int[]{4, 5, 6})
     * - mergeAndCompare(new int[]{1, 2}, new int[]{1, 2, 3})
     * - mergeAndCompare(new int[]{}, new int[]{1, 2, 3})
     */

    public static void main(String[] args) {
        mergeAndCompare(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        mergeAndCompare(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        mergeAndCompare(new int[]{1, 2}, new int[]{1, 2, 3});
        mergeAndCompare(new int[]{1, 2, 3}, new int[]{1});
        mergeAndCompare(new int[]{}, new int[]{1, 2, 3});
    }

    static void mergeAndCompare(int[] arr1, int[] arr2){
        int len = arr1.length+arr2.length,
                val = -1,
                init = 0,
                arr1len,
                arr2len;
        int[] copy;
        if(arr1.length>arr2.length){
            len +=(arr1.length-arr2.length);
            arr2len=arr2.length;
            arr2 = Arrays.copyOf(arr2,arr1.length);
            Arrays.fill(arr2,arr2len,arr2.length,val);
            copy = Arrays.copyOf(arr1,len);
            System.arraycopy(arr2, init, copy, arr1.length, arr1.length);
        }else if(arr2.length>arr1.length){
            len +=(arr2.length-arr1.length);
            arr1len = arr1.length;
            arr1 = Arrays.copyOf(arr1,arr2.length);
            Arrays.fill(arr1,arr1len,arr1.length,val);
            copy = Arrays.copyOf(arr1,len);
            System.arraycopy(arr2, init, copy, arr2.length, arr2.length);
        } else {
            copy = Arrays.copyOf(arr1,len);
            System.arraycopy(arr2, init, copy, arr2.length, arr2.length);
        }
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.toString(copy));
    }
}

/*
 * Build-in 'Arrays.fill(), Arrays.equals() y System.arraycopy()'
 * - fill rellena con un número en especifico o tambien en un rango con el numero en especifico
 * - equals compara si 2 arrays son exactamente iguales tanto en loguitud, orden y valores.
 *
 * La complejidad algoritmica de este ejercicio es O(n).
 *
 *
 *
 * Build-in 'Arrays.fill(), Arrays.equals(), and System.arraycopy()'
 * - `fill` fills an array with a specific number or within a range containing a specific number.
 * - `equals` compares two arrays to see if they are exactly equal in length, order, and values.
 *
 * The algorithmic complexity of this exercise is O(n).
 */