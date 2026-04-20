package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise67 {
    /*
     * Practicando Arrays
     *
     * Crear una función splitArray(int[] arr).
     *
     * Debe:
     * - Divida el array en dos mitades
     * - Si el array tiene longitud impar, la primera mitad
     *   tiene el elemento extra
     * - Imprima ambas mitades
     * - Retorne la mitad más larga
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - splitArray(new int[]{1, 2, 3, 4, 5, 6})
     * - splitArray(new int[]{1, 2, 3, 4, 5})
     * - splitArray(new int[]{1})
     * - splitArray(new int[]{})
     */

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(splitArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(splitArray(new int[]{1}));
        System.out.println(splitArray(new int[]{}));
    }

    static String splitArray (int[] arr){
        if(arr.length<1) return "The array is empty";
        String result = "They are both the same length";
        int [] firstArr;
        int [] secondArr= Arrays.copyOfRange(arr, arr.length/2+1,arr.length);
        if(arr.length%2==0) {
            firstArr =Arrays.copyOf(arr, arr.length/2);
            secondArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            System.out.println(Arrays.toString(firstArr));
            System.out.println(Arrays.toString(secondArr));
        } else {
            firstArr =Arrays.copyOf(arr, arr.length/2+1);
            System.out.println(Arrays.toString(firstArr));
            if(secondArr.length>0) {
                System.out.println(Arrays.toString(secondArr));
            }
        }
        if(firstArr.length>secondArr.length) {
            result = Arrays.toString(firstArr);
            return "The max Array is: "+result;
        }
        return result;
    }
}

/*
 * Build-in 'Arrays.copyOf() y Arrays.copyOfRange'
 * - copyOf copia desde índice 0 hasta nuevaLongitud
 * - copyOfRange copia desde 'desde' hasta 'hasta' (exclusivo)
 *
 * La complejidad algoritmica de estos dos es O(n).
 *
 *
 *
 * Build-in 'Arrays.copyOf() and Arrays.copyOfRange'
 * - copyOf copies from index 0 to newLength
 * - copyOfRange copies from 'from' to 'to' (exclusive)
 *
 * The algorithmic complexity of these two is O(n).
 */