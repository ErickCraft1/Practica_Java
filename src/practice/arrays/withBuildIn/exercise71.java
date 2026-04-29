package practice.arrays.withBuildIn;

import java.util.Arrays;

public class exercise71 {
    /*
     * Practicando Arrays
     *
     * Crear una función arrayPipeline(int[] arr, int target).
     *
     * Debe:
     * - Ordenar arr
     * - Eliminar duplicados (sin built-in de eliminación — construye el array manualmente comparando adyacentes)
     * - Busquar cada target en el array sin duplicados
     * - Retornar el array sin duplicados
     *
     * Desde main:
     * - prueba con al menos 4 arrays
     *
     * Ejemplos:
     * - arrayPipeline(new int[]{3,1,4,1,5,9,2,6,5,3}, new int[]{4,7,1})
     * - arrayPipeline(new int[]{1,1,1,1}, new int[]{1,2})
     * - arrayPipeline(new int[]{1,2,3}, new int[]{1,2,3})
     * - arrayPipeline(new int[]{}, new int[]{1})
     * - arrayPipeline(new int[]{5}, new int[]{5,6})
     */

    public static void main(String[] args) {
        arrayPipeline(new int[]{3,1,4,1,5,9,2,6,5,3}, new int[]{4,7,1});
        arrayPipeline(new int[]{1,1,1,1}, new int[]{1,2});
        arrayPipeline(new int[]{1,2,3}, new int[]{1,2,3});
        arrayPipeline(new int[]{}, new int[]{1});
        arrayPipeline(new int[]{5}, new int[]{5,6});
        arrayPipeline(new int[]{4,4,8}, new int[]{4,8});
        arrayPipeline(new int[]{2,4,6}, new int[]{});
        arrayPipeline(new int[]{6}, new int[]{});
    }

    static void arrayPipeline(int[] arr, int[] target){
        if(arr.length<1) return;
        int count=0, j, acc;
        int[] arrCopy;
        Arrays.sort(arr);
            for (int i = 1; i<arr.length;i++){
                if(arr[i-1]==arr[i]){
                    count++;
                }
            }
            arrCopy = new int[arr.length - count];
            arrCopy[0]=arr[0];
            j=1;
            for (int i = 1; i<arr.length;i++){
                if(arr[i]!=arr[i-1]){
                    arrCopy[j]=arr[i];
                    j++;
                }
            }
            if(target.length<1) {
                System.out.println(Arrays.toString(arrCopy));
                return;
            }
            for(int num : target){
                acc =Arrays.binarySearch(arrCopy,num);
                if(acc>=0) System.out.println(acc);
            }
        System.out.println(Arrays.toString(arrCopy));
    }

//    Implemetar retorno en Matriz / Array de Arrays / Array 2D
    /*
    *
        static void arrayPipeline(int[] arr, int[] target){
            if(arr.length<1) return;
            int count=0, j, acc;
            int[] arrCopy;
            Arrays.sort(arr);
            for (int i = 1; i<arr.length;i++){
                if(arr[i-1]==arr[i]){
                    count++;
                }
            }
            arrCopy = new int[arr.length - count];
            arrCopy[0]=arr[0];
            j=1;
            for (int i = 1; i<arr.length;i++){
                if(arr[i]!=arr[i-1]){
                    arrCopy[j]=arr[i];
                    j++;
                }
            }
            if(target.length<1) {
                System.out.println(Arrays.toString(arrCopy));
                return;
            }
            for(int num : target){
                acc =Arrays.binarySearch(arrCopy,num);
                if(acc>=0) System.out.println(acc);
            }
            System.out.println(Arrays.toString(arrCopy));
        }
    *
    * */
}

/*
 * Built-in y sin Built-in
 * - Este ejercicio fue mas retador de lo imaginado, ya que:
 * Primero: Pensar en como colocar el arr original en el arrCopy sin usar built-in.
 * Segundo: Comenzar a implementar la lógica ya que al inicio fue simple, pero los casos bordé me hicieron repensar la lógica.
 * Tercero: Refactorizar todo para que no solo sea limpio, si no legible y con el menor coste posible teniendo en cuneta los futuros tests.
 *
 * La complejidad algoritmica de este ejercicio es O(n log n).
 *
 *
 *
 * Built-in and without Built-in
 * - This exercise was more challenging than imagined, since:
 * First: Think about how to put the original arr in the arrCopy without using built-in.
 * Second: Start implementing the logic since at the beginning it was simple, but the borderline cases made me rethink the logic.
 * Third: Refactor everything so that it is not only clean, but also readable and at the lowest possible cost, taking future tests into account.
 *
 * The algorithmic complexity of this exercise is O(n log n).
 */